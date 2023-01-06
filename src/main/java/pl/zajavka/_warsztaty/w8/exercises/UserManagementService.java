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
        //ma zwracać optional z userami o podaym emailu
        return Optional.empty();

    }
    public List<User> findByName(String name){
        return List.of();
        //ma zwracać listę userów z tymi samymi name
    }
    public List<User> findAll(){
        //wraca listę wszystkich userów
        return List.of();
    }

    public void update(String userEmail, User user) {
        if(findByEmail(userEmail).isEmpty()){
            throw new RuntimeException(String.format("User with email: [%s] does't exist", userEmail));
        }


    }

    public void delete(String userEmail) {
        if(findByEmail(userEmail).isEmpty()){
            throw new RuntimeException(String.format("User with email: [%s] does't exist", userEmail));
        }

    }
}
