package com.belajar.crudwithjwt.controller;

import com.belajar.crudwithjwt.exceptions.ValidationException;
import com.belajar.crudwithjwt.model.RegisterUser;
import com.belajar.crudwithjwt.repository.RegisterUserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.Map;


@RestController
public class RegisterUserController {


    final
    private RegisterUserRepository registerUserRepository;

//    private HashData hashData = new HashData();

    public RegisterUserController(RegisterUserRepository registerUserRepository) {
        this.registerUserRepository = registerUserRepository;
    }


//    @PostMapping("/user")
//    @ResponseBody
//    public Boolean create(@RequestBody Map<String, String> body) throws NoSuchAlgorithmException {
//        String username = body.get("username");
//        if (userInfoRepository.existsByUsername(username)){
//
//            throw new ValidationException("Username already existed");
//
//        }
//
//        String password = body.get("password");
//        String encodedPassword = new BCryptPasswordEncoder().encode(password);
////        String hashedPassword = hashData.get_SHA_512_SecurePassword(password);
//        String fullname = body.get("fullname");
//        userInfoRepository.save(new UserInfo(username, encodedPassword, fullname));
//        return true;
//    }

    @PostMapping("/register")
//    @ResponseBody
    public ResponseEntity create(@Valid @RequestBody Map<String, String> body, UriComponentsBuilder uriComponentsBuilder) {
        String username = body.get("username");
        if (registerUserRepository.existsByUsername(username)){

            throw new ValidationException("Username already existed");
        }

        String password = body.get("password");
        String encodedPassword = new BCryptPasswordEncoder().encode(password);
        String numberphone = body.get("numberphone");
        String email = body.get("email");
        registerUserRepository.save(new RegisterUser(username, encodedPassword, email, numberphone));

//        throw new ValidationException(String.valueOf(HttpStatus.OK));
        return new ResponseEntity(HttpStatus.OK);
    }

}
