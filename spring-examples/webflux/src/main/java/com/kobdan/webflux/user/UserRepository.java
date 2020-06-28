package com.kobdan.webflux.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class UserRepository {
    
    static Map<String,User> userData;

    static Map<String,String> userAccessData;

    static
    {
        userData = new HashMap<>();
        userData.put("1",new User("1","User 1"));
        userData.put("2",new User("2","User 2"));
        userData.put("3",new User("3","User 3"));
        userData.put("4",new User("4","User 4"));
        userData.put("5",new User("5","User 5"));
        userData.put("6",new User("6","User 6"));
        userData.put("7",new User("7","User 7"));
        userData.put("8",new User("8","User 8"));
        userData.put("9",new User("9","User 9"));
        userData.put("10",new User("10","User 10"));
        
        userAccessData=new HashMap<>();
        userAccessData.put("1", "User 1 Access Key");
        userAccessData.put("2", "User 2 Access Key");
        userAccessData.put("3", "User 3 Access Key");
        userAccessData.put("4", "User 4 Access Key");
        userAccessData.put("5", "User 5 Access Key");
        userAccessData.put("6", "User 6 Access Key");
        userAccessData.put("7", "User 7 Access Key");
        userAccessData.put("8", "User 8 Access Key");
        userAccessData.put("9", "User 9 Access Key");
        userAccessData.put("10", "User 10 Access Key");
    }
    
    public Mono<User> findUserById(String id)
    {
        return Mono.just(userData.get(id));
    }
    
    public Flux<User> findAllUsers()
    {
        return Flux.fromIterable(userData.values());
    }
    
    public Mono<User> updateUser(User employee)
    {
        User existingUser=userData.get(employee.getId());
        if(existingUser!=null) {
            existingUser.setName(employee.getName());
        }
        return Mono.just(existingUser);
    }
}
