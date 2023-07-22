package hashenjanu.example.springsecurity.service;

import hashenjanu.example.springsecurity.entity.Role;
import hashenjanu.example.springsecurity.entity.User;
import hashenjanu.example.springsecurity.repo.RoleRepo;
import hashenjanu.example.springsecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;

    public User registerNewUser(User user) {
        return userRepo.save(user);
    }

    public void  initRoleAndUser(){
            Role adminRole = new Role();
            Role userRole = new Role();
        if (!roleRepo.existsById("Admin")){
            adminRole.setRoleName("Admin");
            adminRole.setRoleDescription("Admin Role");
            roleRepo.save(adminRole);
        }

        if (!roleRepo.existsById("User")) {
            userRole.setRoleName("User");
            userRole.setRoleDescription("User Role");
            roleRepo.save(userRole);
        }
            if (!userRepo.existsById("admin123")) {
            User user = new User();
            user.setUserName("admin123");
            user.setUserPassword("admin@123");
            user.setUserFristName("Hashen");
            user.setUserLastName("Janu");

            Set<Role> adminRoles = new HashSet<>();
            adminRoles.add(adminRole);

            user.setRole(adminRoles);
            userRepo.save(user);
        }
        if (!userRepo.existsById("user123")) {
            User user = new User();
            user.setUserName("user123");
            user.setUserPassword("user@123");
            user.setUserFristName("Nishan");
            user.setUserLastName("Raj");

            Set<Role> userRoles = new HashSet<>();
            userRoles.add(userRole);

            user.setRole(userRoles);
            userRepo.save(user);
        }
    }
}
