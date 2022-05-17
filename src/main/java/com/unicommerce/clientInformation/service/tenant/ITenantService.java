package com.unicommerce.clientInformation.service.tenant;

import com.unicommerce.clientInformation.api.CreateTenantRequest;
import com.unicommerce.clientInformation.entity.Tenant;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ITenantService {
    List<Tenant> findByCode(String code, Integer pagenumber, Integer pageSize);
    ResponseEntity<String> createTenant(CreateTenantRequest request);

}
