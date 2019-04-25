package edu.xavier.csci.inclass.inclassservice;

import javassist.tools.rmi.Sample;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class SampleControler {

    JdbcTemplate jdbcTemplate;

    SampleControler(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @PostMapping("/addHero")
    public Response add(@RequestBody Hero hero) {

        Response r = new Response();
        List<Object[]> heros = Arrays.asList(
                hero
        ).stream().map(h -> {String[] ero = new String[2]; ero[0]= h.getId().toString(); ero[1]=h.getName(); return ero;}).collect(Collectors.toList());
        jdbcTemplate.batchUpdate("INSERT INTO CUSTOMER(first_name, last_name) VALUES (?,?)", heros);

        r.setCode(200);
        r.setType("Hero Added: " + hero.getId());

        return r;
    }
}
