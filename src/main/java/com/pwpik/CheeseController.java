package com.pwpik;

import com.pwpik.cheese.Cheese;
import com.pwpik.cheese.CheeseRepository;
import com.pwpik.cheese.CheeseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheeseController {

    private final CheeseService service;

    @Autowired
    CheeseController(CheeseService service) {
        this.service = service;
    }

    @RequestMapping(value = "/displayfirst")
    public Cheese displayFirst() {
        return service.getAllHiddenCheeses().iterator().next();
    }

}
