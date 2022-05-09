package com.unicommerce.clientInformation.service;

import com.unicommerce.clientInformation.entity.Tenant;
import com.unicommerce.clientInformation.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class TenantService {
    @Autowired
    private TenantRepository tenantRepository;

    public List<Tenant> findByCode(String code, Integer pagenumber, Integer pageSize) {
        if(pagenumber==null) pagenumber=0;
        if(pageSize==null) pageSize = 10;
        if(code ==null) code ="";
        return tenantRepository.findAllByCodeStartingWith(code, PageRequest.of(pagenumber, pageSize));
    }
    public ResponseEntity<String> createTenant(Tenant tenant) {
        try {
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
