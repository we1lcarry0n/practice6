package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final EntityManager entityManager;

    @Transactional
    public UserEnt createUser(String fname, String lname) {
        UserEnt user = new UserEnt(fname, lname);
        user.setFirstName(fname);
        user.setLastName(lname);
        return entityManager.merge(user);
    }
}