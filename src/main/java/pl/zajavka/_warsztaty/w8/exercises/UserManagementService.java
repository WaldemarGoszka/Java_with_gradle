package pl.zajavka._warsztaty.w8.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class UserManagementService {

    private final Map<String,User> userMap = new HashMap<>();

    public void create(User user){
        if(userMap.containsKey(user.getEmail())){
            throw new RuntimeException(String.format("User with email: [%s] is already created",user.getEmail()));
        }
        userMap.put(user.getEmail(),user);

        //..
    }
    public Optional<User> findByEmail(String email){
        return Optional.ofNullable(userMap.get(email));
    }
    public List<User> findByName(String name){
         return userMap.values().stream()
                .filter(v -> v.getName().equals(name))
                .collect(Collectors.toList());

    }
    public List<User> findAll(){
        //wraca listę wszystkich userów

        //return userMap.entrySet().stream().map(e -> e.getValue()).collect(Collectors.toList());
        return new ArrayList<User>(userMap.values());
    }

    public void update(String userEmail, User user) {
        if(!userMap.containsKey(userEmail)){
            throw new RuntimeException(String.format("User with email: [%s] does't exist", userEmail));
        }
        userMap.remove(userEmail);
        userMap.put(user.getEmail(),user);


    }

    public void delete(String userEmail) {
        if(findByEmail(userEmail).isEmpty()){
            throw new RuntimeException(String.format("User with email: [%s] does't exist", userEmail));
        }
        userMap.remove(userEmail);

    }
}
