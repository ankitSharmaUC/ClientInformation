package com.unicommerce.clientInformation.service.tenant.impl;

import com.unicommerce.clientInformation.api.CreateTenantRequest;
import com.unicommerce.clientInformation.entity.Tenant;
import com.unicommerce.clientInformation.repository.TenantRepository;
import com.unicommerce.clientInformation.service.tenant.ITenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


import java.time.LocalDateTime;
import java.util.List;

@Component
public class TenantServiceImpl implements ITenantService {
    @Autowired
    private TenantRepository tenantRepository;
    @Override
    public List<Tenant> findByCode(String code, Integer pagenumber, Integer pageSize) {
        if(pagenumber==null) pagenumber=0;
        if(pageSize==null) pageSize = 10;
        if(code ==null) code ="";
        return tenantRepository.findAllByCodeStartingWith(code, PageRequest.of(pagenumber, pageSize));
    }

    @Override
    public ResponseEntity<String> createTenant(CreateTenantRequest request) {
        try {
            Tenant tenant = new Tenant(request.getCode(), request.getName(), LocalDateTime.now());
            tenantRepository.save(tenant);

            return ResponseEntity.ok("Tenant Created");
        }
        catch (Exception e){
            return new ResponseEntity<>(
                    e.getMessage(),
                    HttpStatus.CONFLICT);
        }
    }

}
