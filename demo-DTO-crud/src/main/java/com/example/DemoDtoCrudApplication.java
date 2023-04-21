package com.example;

import com.example.Model.Location;
import com.example.Model.User;
import com.example.Repository.LocationRepository;
import com.example.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoDtoCrudApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoDtoCrudApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private LocationRepository locationRepository;

    @Override
    public void run(String... args) throws Exception {

        Location location = new Location();
        location.setPlace("Pune");
        location.setDiscription("Pune is grate place to live");
        location.setLongitude(40.5);
        location.setLatitude(30.6);
        locationRepository.save(location);

        User user1 = new User();
        user1.setFirstName("Spring");
        user1.setLastName("Boot");
        user1.setEmail("springboot@gmail.com");
        user1.setPassword("password");
        user1.setLocation(location);
        userRepository.save(user1);

        User user2 = new User();
        user2.setFirstName("Core");
        user2.setLastName("Java");
        user2.setEmail("corejava@gmail.com");
        user2.setPassword("password");
        user2.setLocation(location);
        userRepository.save(user2);
    }
}
