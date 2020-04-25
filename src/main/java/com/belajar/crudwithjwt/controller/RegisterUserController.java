package com.belajar.crudwithjwt.controller;

import com.belajar.crudwithjwt.model.RegisterUser;
import com.belajar.crudwithjwt.repository.RegisterUserRepository;
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
        Optional<RegisterUser> registerUserList = registerUserRepository.findByUsernameOrNumberphoneOrEmailOrFullname(searchTerm, searchTerm, searchTerm, searchTerm);

        Map<String, Object> map = new HashMap<>();

        if (registerUserList.isPresent()){
            message = "pencarian ditemukan";
            status = "301";

            map.put("data", new HashMap<String, Object>() {
                {
                    put("username",registerUserList.get().getUsername());
                    put("numberphone", registerUserList.get().getNumberphone());
                    put("email", registerUserList.get().getEmail());
                    put("fullname", registerUserList.get().getFullname());
                }
            });
            map.put("status", status);
            map.put("message", message);
        } else {
            message = "pencarian tidak ditemukan";
            status = "404";

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
                            for (int j=0; j<4; j++){
                                if (j == 0){
                                    put("username", registerUserList.get(finalI).getUsername());
                                } else if (j == 1) {
                                    put("email", registerUserList.get(finalI).getEmail());
                                } else if (j == 2) {
                                    put("numberphone", registerUserList.get(finalI).getNumberphone());
                                } else if (j == 3) {
                                    put("fullname", registerUserList.get(finalI).getFullname());
                                }
                            }
                        }
                    });
                }
            }
        });
        map.put("status", "200");
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
        String fullname = body.get("fullname");

        String encodedPassword = new BCryptPasswordEncoder().encode(password);

        String status;
        String message;

        if ((!username.isEmpty()) && (!numberphone.isEmpty()) && (!email.isEmpty()) && (!password.isEmpty()) && (!fullname.isEmpty())){
            if (registerUserRepository.existsByUsername(username)){
                message = "username telah digunakan";
                status = "400";
            } else if (registerUserRepository.existsByNumberphone(numberphone)) {
                message = "number telah digunakan";
                status = "400";
            } else if (registerUserRepository.existsByEmail(email)) {
                message = "email telah digunakan";
                status = "400";
            } else {
                registerUserRepository.save(new RegisterUser(username, encodedPassword, email, numberphone, fullname));
                message = "Success create";
                status = "201";
            }
        } else {
            message = "please fill in the registration field";
            status = "400";
        }

        Map<String, Object> map = new HashMap<>();
        map.put("data", new HashMap<String, String>(){
            {
                put("username",username);
                put("numberphone",numberphone);
                put("email",email);
                put("fullname",fullname);
            }
        });
        map.put("status", status);
        map.put("message", message);

        return map;
    }

}
