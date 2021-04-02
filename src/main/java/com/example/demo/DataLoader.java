package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("loading data ....");

        roleRepository.save(new Role("USER"));
        roleRepository.save(new Role("Admin"));

        Role adminRole = roleRepository.findByRole("ADMIN");
        Role userRole = roleRepository.findByRole("user");

        User user = new User("Boberson","bob@bob.com","Bob",true,"bob","pass");
        user.setRoles(Arrays.asList(userRole));
        userRepository.save(user);

         user = new User("Jimmerson","jim@jim.com","Jim",true,"jim","pass");
        user.setRoles(Arrays.asList(userRole));
        userRepository.save(user);

         user = new User("User","admin@admin.com","admin",true,"admin","pass");
        user.setRoles(Arrays.asList(adminRole));
        userRepository.save(user);

         user = new User("AAshish","aa@shish.com","paudel",true,"aash","pass");
        user.setRoles(Arrays.asList(userRole));
        userRepository.save(user);

    }
}
