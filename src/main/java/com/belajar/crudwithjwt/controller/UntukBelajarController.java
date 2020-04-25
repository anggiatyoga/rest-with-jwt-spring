package com.belajar.crudwithjwt.controller;

import com.belajar.crudwithjwt.exceptions.ValidationException;
import com.belajar.crudwithjwt.model.UntukBelajar;
import com.belajar.crudwithjwt.repository.UntukBelajarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UntukBelajarController {

    @Autowired
    UntukBelajarRepository untukBelajarRepository;

    public UntukBelajarController(UntukBelajarRepository untukBelajarRepository) {
        this.untukBelajarRepository = untukBelajarRepository;
    }

    //read list
    @GetMapping("/untukbelajar/showall")
    public List<UntukBelajar> showAll() {
        return untukBelajarRepository.findAll();
    }

    //create
    @PostMapping("/untukbelajar/create")
    public Map<String, Object> create(@RequestBody Map<String, String> body) {

        String name = body.get("name");
        String email = body.get("email");
        String age = body.get("age");

        String message;
        String status;

        if ((name.isEmpty()) && (email.isEmpty()) && (age.isEmpty())) {
            message = "please fill in the field";
            status = "400";
        } else {
            untukBelajarRepository.save(new UntukBelajar(name, email, Integer.parseInt(age)));
            message = "succsess";
            status = "201";
        }

        Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        map.put("status", status);

        return map;
    }

    //delete
    @PostMapping("/untukbelajar/delete")
    public Map<String, Object> delete(@RequestBody Map<String, String> body) {
        String searchName = body.get("name");
        Map<String, Object> map = new HashMap<>();

        map.put("message", searchName+" deleted");
        map.put("status", "200");

        UntukBelajar untukBelajar = untukBelajarRepository.findByName(searchName).orElseThrow(()
        -> new ValidationException(""+searchName+" not found", "404", null));
        return map;
    }

    //update
    @PostMapping("/untukbelajar/update")
    public Map<String, Object> update(@RequestBody Map<String, String> body) {
        String searchName = body.get("name");

        Map<String, Object> map = new HashMap<>();

        if (untukBelajarRepository.existsByName(searchName)) {
            UntukBelajar untukBelajar = untukBelajarRepository.findByName(searchName).orElse(new UntukBelajar());
            untukBelajar.setName(body.get("name"));
            untukBelajar.setEmail(body.get("email"));
            untukBelajar.setAge(Integer.parseInt(body.get("age")));

            untukBelajarRepository.save(untukBelajar);
            map.put("message", "update success");
            map.put("status", "200");
        } else {
            map.put("message", "update failed "+searchName+" not found");
            map.put("status", "404");
        }
        return map;
    }

}
