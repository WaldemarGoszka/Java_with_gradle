package pl.zajavka._warsztaty.w8.exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UserManagementService {

    Map<String,User> userMap = new HashMap<>();

    public void create(User user){
        if(findByEmail(user.getEmail()).isPresent()){
            throw new RuntimeException(String.format("User with email: [%s] is already created",user.getEmail()));
        }

        //..
    }
    public Optional<User> findByEmail(String email){
        //...
        return Optional.empty();
    }
    public List<User> findAll(){
        return List.of();
    }
}
