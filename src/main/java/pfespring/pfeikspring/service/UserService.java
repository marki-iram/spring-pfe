package pfespring.pfeikspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pfespring.pfeikspring.repository.UserRepository;
import pfespring.pfeikspring.entity.User;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }
    public User addUser(User user) {
        return userRepository.save(user);
    }
    public User updateUser(int id, User user) {
        User existingUser = userRepository.findById(id).orElse(null);
        if (existingUser != null) {

            existingUser.setNom(user.getNom());
            existingUser.setPrenom(user.getPrenom());
            existingUser.setEmail(user.getEmail());
            existingUser.setTelephone(user.getTelephone());


            return userRepository.save(existingUser);
        }
        return null;
    }
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}
