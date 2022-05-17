package com.unicommerce.clientInformation.repository;

import com.unicommerce.clientInformation.entity.Tenant;
import com.unicommerce.clientInformation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> getAllByTenant(Tenant tenant);
}
