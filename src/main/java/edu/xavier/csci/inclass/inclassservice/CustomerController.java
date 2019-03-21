package edu.xavier.csci.inclass.inclassservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {


    @GetMapping("/")
    public Response root() {

        return new Response();
    }

    @PostMapping("/add")
    public Response add(@RequestBody Hero hero) {

        Response r = new Response();
        r.setCode(200);
        r.setType("Hero Added: " + hero.getId());

        return r;
    }

}
