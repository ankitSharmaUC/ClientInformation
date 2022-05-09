package com.unicommerce.clientInformation.controller;


import com.unicommerce.clientInformation.entity.Tenant;
import com.unicommerce.clientInformation.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TenantController {

    @Autowired
    private TenantService tenantService;

    @GetMapping("/search")
    List<Tenant> findByCode(@RequestParam(value = "code", required = false) String code, @RequestParam(value = "pageNumber", required = false) Integer pagenumber, @RequestParam(value = "pageSize", required = false) Integer pageSize){
        return tenantService.findByCode(code,pagenumber, pageSize);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createTenant(@RequestBody Tenant tenant){
        return tenantService.createTenant(tenant);
    }
}
