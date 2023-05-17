package com.security.BaseforProject.config;

import com.security.BaseforProject.entity.Role;
import com.security.BaseforProject.entity.User;
import com.security.BaseforProject.enums.Gender;
import com.security.BaseforProject.repo.RoleRepo;
import com.security.BaseforProject.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Configuration
@RequiredArgsConstructor
public class InitDbConfig {
    private final RoleRepo roleRepo;
    private final UserRepo userRepo;

    @PostConstruct
    public void doEntries(){


        if(roleRepo.findAll().size()==0){
            Role adminRole = new Role();
            adminRole.setName("ADMIN");

            Role savedAdminRole=roleRepo.save(adminRole);


            Role userRole = new Role();
            userRole.setName("user");
            roleRepo.save(userRole);

            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            User user = new User();
            user.setName("Sagar Thapa");
            user.setUserName("sthapa");
            user.setPassword(encoder.encode("sthapa123"));
            user.setGender(Gender.MALE);

            user.setRoles(Arrays.asList(savedAdminRole));

            userRepo.save(user);




        }
    }
}
