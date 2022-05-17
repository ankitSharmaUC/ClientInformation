package com.unicommerce.clientInformation.repository;

import com.unicommerce.clientInformation.entity.Tenant;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Integer> {
  List<Tenant> findAllByCodeStartingWith(@Param("code") String code, Pageable pageable);
  Tenant getTenantByCode(String tenantCode);
  }
