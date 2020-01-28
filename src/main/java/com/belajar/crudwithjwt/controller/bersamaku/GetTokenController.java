package com.belajar.crudwithjwt.controller.bersamaku;

import com.belajar.crudwithjwt.repository.bersamaku.GetTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GetTokenController {

    final
    private GetTokenRepository getTokenRepository;

    public GetTokenController(GetTokenRepository getTokenRepository) {
        this.getTokenRepository = getTokenRepository;
    }

    @RequestMapping(value = "/bku/v1/oauth/token", method = RequestMethod.POST)
    public Map<String, Object> getToken(@RequestParam Map<String, String> body) throws Exception{

        Map<String, Object> map = new HashMap<>();

        try {

            map.put("access_token", "09161436170025D6E46");
            map.put("expires_in", "20190817T21:42:31+07:00");
        } catch (Exception e) {
            map.put("error_code", "TK01");
            map.put("error_description", "token invalid");
        }


        return map;
    }

}
