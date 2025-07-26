package hosting.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class MainController {

    @Autowired
    private UserRepo userRepository;

    // GET all users
    @GetMapping
    public List<MyUser> getAllUsers() {
        return userRepository.findAll();
    }

    // POST create new user
    @PostMapping
    public MyUser createUser(@RequestBody MyUser user) {
        return userRepository.save(user);
    }

    // GET user by ID
    @GetMapping("/{id}")
    public MyUser getUserById(@PathVariable Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    // DELETE user by ID
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }
}
