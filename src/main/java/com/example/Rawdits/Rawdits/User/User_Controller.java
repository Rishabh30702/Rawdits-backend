package com.example.Rawdits.Rawdits.User;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class User_Controller {
    @Autowired
    private User_Repository userRepository;

//    @GetMapping("/authenticate/{Username}/{Password}/{Role}")
//    private ResponseEntity<?> authenticate(@RequestBody  User_Entity userEntity,
//                                           @PathVariable String Username,
//                                           @PathVariable String Password,
//                                           @PathVariable String Role){
//        System.out.print(Username+ " "+ Password +" " + Role);
//        System.out.print(userEntity.getUsername()+ " "+ userEntity.getPassword() +" " + userEntity.getRole());
//        if(Username.equals(userEntity.getUsername()) && Password.equals(userEntity.getPassword()) &&
//        Role.equals(userEntity.getRole())){
//            return ResponseEntity.ok(userEntity);
//        }else {
//            return null;
//        }
//    }
}

