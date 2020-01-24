package com.belajar.crudwithjwt.controller;

import com.belajar.crudwithjwt.exceptions.ValidationException;
import com.belajar.crudwithjwt.model.RegisterUser;
import com.belajar.crudwithjwt.repository.RegisterUserRepository;
import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.*;


@RestController
public class RegisterUserController {

    final
    private RegisterUserRepository registerUserRepository;

    public RegisterUserController(RegisterUserRepository registerUserRepository) {
        this.registerUserRepository = registerUserRepository;
    }

    //read by query search
    @PostMapping("/register/search")
    public Map<String, Object> search(@RequestParam Map<String, String> body) {
        String searchTerm = body.get("cari");
        String status;
        String message;
        Optional<RegisterUser> registerUserList = registerUserRepository.findByUsernameOrNumberphoneOrEmail(searchTerm, searchTerm, searchTerm);

        Map<String, Object> map = new HashMap<>();

        if (registerUserList.isPresent()){
            message = "pencarian ditemukan";
            status = "301(Found)";

            map.put("data", new HashMap<String, Object>() {
                {
                    put("username",registerUserList.get().getUsername());
                    put("numberphone", registerUserList.get().getNumberphone());
                    put("email", registerUserList.get().getEmail());
                }
            });
            map.put("status", status);
            map.put("message", message);
        } else {
            message = "pencarian tidak ditemukan";
            status = "404(Not Found)";

            map.put("data", "tidak ditemukan");
            map.put("status", status);
            map.put("message", message);
        }


        return map;
    }

    //read all
    @GetMapping("/register/show")
    public Map<String, Object> showAllList() {
        List<RegisterUser> registerUserList = registerUserRepository.findAll();

        int batasList = registerUserList.size();

        Map<String, Object> map = new HashMap<>();
        map.put("data", new HashMap<Integer, Object>(){
            {

                for (int i=0; i<batasList; i++){
                    int finalI = i;
                    put(i, new HashMap<String, Object>(){
                        {
                            for (int j=0; j<2; j++){
                                if (j == 0){
                                    put("username", registerUserList.get(finalI).getUsername());
                                } else if (j == 1) {
                                    put("email", registerUserList.get(finalI).getEmail());
                                } else if (j == 2) {
                                    put("numberphone", registerUserList.get(finalI).getPassword());
                                }
                            }
                        }
                    });
                }
            }
        });
        map.put("status", "200(Ok)");
        map.put("message","Succses");

        return map;

    }

    //create
    @PostMapping("/register/create")
    public Map<String, Object> create(@Valid @RequestParam Map<String, String> body, UriComponentsBuilder uriComponentsBuilder) {
        String username = body.get("username");
        String numberphone = body.get("numberphone");
        String email = body.get("email");
        String password = body.get("password");
        String encodedPassword = new BCryptPasswordEncoder().encode(password);

        String status;
        String message;


        if (registerUserRepository.existsByUsername(username)){

            message = "username telah digunakan";
            status = "400(Bad Request)";
        } else if (registerUserRepository.existsByNumberphone(numberphone)) {
            message = "number telah digunakan";
            status = "400(Bad Request)";
        } else if (registerUserRepository.existsByEmail(email)) {
            message = "email telah digunakan";
            status = "400(Bad Request)";
        } else {
            registerUserRepository.save(new RegisterUser(username, encodedPassword, email, numberphone));
            message = "Success create";
            status = "201(Created)";
        }

        Map<String, Object> map = new HashMap<>();
        map.put("data", new HashMap<String, String>(){
            {
                put("username",username);
                put("numberphone",numberphone);
                put("email",email);
            }
        });
        map.put("status", status);
        map.put("message", message);

        return map;
    }

}
