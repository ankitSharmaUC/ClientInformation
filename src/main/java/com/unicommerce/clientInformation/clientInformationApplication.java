package com.unicommerce.clientInformation;

import com.unicommerce.clientInformation.entity.Nps;
import com.unicommerce.clientInformation.entity.Tenant;
import com.unicommerce.clientInformation.repository.NpsRepository;
import com.unicommerce.clientInformation.repository.TenantRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class clientInformationApplication {
	public static void main(String[] args) {
		SpringApplication.run(clientInformationApplication.class, args);
	}

}
