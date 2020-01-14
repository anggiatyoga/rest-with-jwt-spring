package com.belajar.crudwithjwt.controller;

import com.belajar.crudwithjwt.exceptions.ValidationException;
import com.belajar.crudwithjwt.model.RegisterUser;
import com.belajar.crudwithjwt.repository.RegisterUserRepository;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
public class RegisterUserController {

    final
    private RegisterUserRepository registerUserRepository;

    private List<RegisterUser> userList = new ArrayList<>();

    public RegisterUserController(RegisterUserRepository registerUserRepository) {
        this.registerUserRepository = registerUserRepository;
    }

    //read by query search
    //harus aktifin authorization/token (bearer)
    @PostMapping("/register/search")
    public RegisterUser search(@RequestBody Map<String, String> body) {
        String searchTerm = body.get("cari");
        return registerUserRepository.findByUsernameOrNumberphoneOrEmail(searchTerm, searchTerm, searchTerm)
                .orElseThrow(() -> new ValidationException("username atau numberphone tidak tersedia"));
    }

    //read all
    //harus aktifin authorization/token (bearer)
    @GetMapping("/register/show")
    public List<RegisterUser> index() {
        return registerUserRepository.findAll();
    }

    //create / register
    @PostMapping("/register/create")
    public ResponseEntity create(@Valid @RequestBody Map<String, String> body, UriComponentsBuilder uriComponentsBuilder) {
        String username = body.get("username");
        String numberphone = body.get("numberphone");
        String email = body.get("email");
        String password = body.get("password");
        String encodedPassword = new BCryptPasswordEncoder().encode(password);

        List<String> userData = null;
        try {
            userData = new ArrayList<String>();
            userData.add(username);
            userData.add(numberphone);
            userData.add(email);
            userData.add(password);

            String json = new Gson().toJson(userData);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (registerUserRepository.existsByUsername(username)){

//            throw new ValidationException("Username already existed");
            throw new ValidationException(""+username+" telah digunakan", "coba username lain", userData);
        } else if (registerUserRepository.existsByNumberphone(numberphone)) {
//            throw new ValidationException("Numberphone already existed");
            throw new ValidationException(""+numberphone+" telah digunakan", "coba numberphone lain", userData);
        } else if (registerUserRepository.existsByEmail(email)) {
//            throw new ValidationException("Email already exist");
            throw new ValidationException(""+email+" telah digunakan", "coba email lain", userData);
        } else {
            registerUserRepository.save(new RegisterUser(username, encodedPassword, email, numberphone));
            throw new ValidationException("Berhasil dibuat", "Ok", userData);
        }

    }

}
