package com.belajar.crudwithjwt.controller;

import com.belajar.crudwithjwt.exceptions.ValidationException;
import com.belajar.crudwithjwt.model.Biodata;
import com.belajar.crudwithjwt.model.RegisterUser;
import com.belajar.crudwithjwt.repository.RegisterUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;


@RestController
public class RegisterUserController {

    final
    private RegisterUserRepository registerUserRepository;

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
        if (registerUserRepository.existsByUsername(username)){

            throw new ValidationException("Username already existed");
        } else if (registerUserRepository.existsByNumberphone(numberphone)) {
            throw new ValidationException("Numberphone already existed");
        } else if (registerUserRepository.existsByEmail(email)) {
            throw new ValidationException("Email already exist");
        }

        String password = body.get("password");
        String encodedPassword = new BCryptPasswordEncoder().encode(password);

        registerUserRepository.save(new RegisterUser(username, encodedPassword, email, numberphone));

        return new ResponseEntity(HttpStatus.OK);
    }

}
