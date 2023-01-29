package org.nox7.userregistrationdemo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> listUsers(){
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        Optional<User> userByEmail = userRepository.findUserByEmail(user.getEmail());

        if (userByEmail.isPresent()){
            throw new IllegalStateException("Email already in use.");
        }

        userRepository.save(user);
    }
}
