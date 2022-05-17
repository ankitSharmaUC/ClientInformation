package com.unicommerce.clientInformation.service.user.impl;

import com.unicommerce.clientInformation.entity.Tenant;
import com.unicommerce.clientInformation.entity.User;
import com.unicommerce.clientInformation.repository.TenantRepository;
import com.unicommerce.clientInformation.repository.UserRepository;
import com.unicommerce.clientInformation.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TenantRepository tenantRepository;

    @Override
    public ResponseEntity createPoc(User poc, String tenantCode) {
        Tenant tenant = tenantRepository.getTenantByCode(tenantCode);
        poc.setTenant(tenant);
        userRepository.save(poc);
        return ResponseEntity.ok("Poc Added");
    }

    @Override
    public ResponseEntity searchPoc(String tenantCode) {
        Tenant tenant = tenantRepository.getTenantByCode(tenantCode);
        return ResponseEntity.ok(userRepository.getAllByTenant(tenant));
    }
}
