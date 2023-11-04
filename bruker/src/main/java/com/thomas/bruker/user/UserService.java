package com.thomas.bruker.user;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void register(User user) {
        userRepository.save(user);
    }

    public void login(User user) {
        userRepository.save(user);
    }

    public void logout(User user) {
        userRepository.save(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public void update(User user) {
        userRepository.save(user);
    }

    public void get(User user) {
        userRepository.save(user);
    }

    public void getAll(User user) {
        userRepository.save(user);
    }

    public void findByEmail(User user) {
        userRepository.save(user);
    }

    public void findByUsername(User user) {
        userRepository.save(user);
    }

    public void findByRole(User user) {
        userRepository.save(user);
    }

    public void findByPassword(User user) {
        userRepository.save(user);
    }

    public void findByFirstName(User user) {
        userRepository.save(user);
    }

    public void findByLastName(User user) {
        userRepository.save(user);
    }

    public void findByAddress(User user) {
        userRepository.save(user);
    }

    public void findByCity(User user) {
        userRepository.save(user);
    }

    public void findByState(User user) {
        userRepository.save(user);
    }

    public void findByZipCode(User user) {
        userRepository.save(user);
    }

    public void findByPhoneNumber(User user) {
        userRepository.save(user);
    }

    public void findByDateOfBirth(User user) {
        userRepository.save(user);
    }

    public void findByDateOfRegistration(User user) {
        userRepository.save(user);
    }

    public void findByDateOfLastLogin(User user) {
        userRepository.save(user);
    }

    public void findByDateOfLastLogout(User user) {
        userRepository.save(user);
    }

    public void findByDateOfLastUpdate(User user) {
        userRepository.save(user);
    }

    public void findByDateOfDeletion(User user) {
        userRepository.save(user);
    }

    public void findByIsDeleted(User user) {
        userRepository.save(user);
    }

    public void findByIsLoggedIn(User user) {
        userRepository.save(user);
    }

    public void findByIsAdmin(User user) {
        userRepository.save(user);
    }

    public void findByIsSuperAdmin(User user) {
        userRepository.save(user);
    }

}
