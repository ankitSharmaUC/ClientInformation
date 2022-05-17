package com.unicommerce.clientInformation.service.user;

import com.unicommerce.clientInformation.entity.User;
import org.springframework.http.ResponseEntity;

public interface IUserService {
    ResponseEntity createPoc(User poc, String tenantCode);
     ResponseEntity searchPoc(String tenantCode);
}
