package com.belajar.crudwithjwt.controller;

import com.belajar.crudwithjwt.config.JwtToken;
import com.belajar.crudwithjwt.exceptions.ValidationException;
import com.belajar.crudwithjwt.model.*;
import com.belajar.crudwithjwt.repository.AuthenticateRepository;
import com.belajar.crudwithjwt.repository.RegisterUserRepository;
import com.belajar.crudwithjwt.service.JwtUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtToken jwtToken;

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;

    @Autowired
    private RegisterUserRepository registerUserRepository;

    final
    private AuthenticateRepository authenticateRepository;

    public AuthController(AuthenticateRepository authenticateRepository) {
        this.authenticateRepository = authenticateRepository;
    }



//    @PostMapping("/biodata/search/nama")
//    public Map<String, Object> search(@RequestParam Map<String, String> body) {

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
//    public Map<String, Object> createAuthenticationToken(@RequestParam JwtRequest authenticationRequest) throws Exception {
    public Map<String, Object> createAuthenticationToken(@RequestParam Map<String, String> body) throws Exception {
//        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

//        final UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(authenticationRequest.getUsername());
//        final String token = jwtToken.generateToken(userDetails);
//        String dataUsername = authenticationRequest.getUsername();
//        String dataPassword = authenticationRequest.getPassword();

        Map<String, Object> map = new HashMap<>();

        String message;
        String status;

        String searchUsername = body.get("username");
        Optional<RegisterUser> registerUserList = registerUserRepository.findByUsernameOrNumberphoneOrEmail(searchUsername, searchUsername, searchUsername);

        if (registerUserList.isPresent()) {
            String dataUsername = registerUserList.get().getUsername();
            String dataPassword = body.get("password");
            authenticate(dataUsername, dataPassword);
            final UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(dataUsername);
            final String token = jwtToken.generateToken(userDetails);



            if (authenticateRepository.existsByUsername(dataUsername)){
                //update
                Authenticate authenticate = authenticateRepository.findByUsername(dataUsername).orElse(new Authenticate());
                authenticate.setUsername(dataUsername);
                authenticate.setToken(token);
                authenticateRepository.save(authenticate);
                message = "berhasil login";
                status = "200(Ok)";
            } else {
                //save
                authenticateRepository.save(new Authenticate(dataUsername, token));
                message = "berhasil login";
                status = "202(Accepted)";
            }

            map.put("data", new HashMap<String, Object>() {
                {
                    put("username", dataUsername);
                    put("email",registerUserList.get().getEmail());
                    put("number_phone",registerUserList.get().getNumberphone());
                    put("token", token);
                }
            });
            map.put("status", status);
            map.put("message", message);
        } else {
            map.put("message","account tidak ditemukan");
            map.put("status","404(Not Found)");
            map.put("data",null);
        }

//        String dataUsername = body.get("username");


        return map;
    }

    private void authenticate(String username, String password) throws Exception {
        String message = "";
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        }catch (DisabledException e) {
            throw new ValidationException(""+e+"","401(Unauthorised)","data "+e);
        } catch (BadCredentialsException e) {
            throw new ValidationException("username atau password salah!","401(Unauthorised)",null);
        }

    }

}
