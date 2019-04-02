package edu.xavier.csci.inclass.inclassservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CustomerController {
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    private Random random = new Random();
    private static Map<Integer, Hero> heros = new HashMap<>();

    static {
        heros.put(11, new Hero(11, "Mr. Nice"));
        heros.put(12, new Hero(12, "Narco"));
        heros.put(13, new Hero(13, "Bombasto"));
        heros.put(14, new Hero(14, "Celeritas"));
        heros.put(15, new Hero(15, "Magneta"));
        heros.put(15, new Hero(16, "RubberMan"));
        heros.put(17, new Hero(17, "Dynama"));
        heros.put(18, new Hero(18, "Dr. IQ"));
        heros.put(19, new Hero(19, "Tornado"));
        heros.put(20, new Hero(20, "Magma"));
    }

    @GetMapping("/")
    public Response root() {

        logger.info("Root Requested");
        logger.debug("Creating new Empty Response");
        Response response = new Response();
        logger.debug("Response Created");
        response.setType("Generic");
        logger.debug("Set response type generic");
        response.setCode(100);
        return response;
    }

    @PostMapping("/add")
    public Response add(@RequestBody Hero hero) {

        Response r = new Response();
        r.setCode(200);
        r.setType("Hero Added: " + hero.getId());

        return r;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/heros")
    public List<Hero> getHeros() {

        System.out.println("Getting heros");

        List<Hero> heros = new ArrayList<>(this.heros.values());


        return heros;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/hero/{id}")
    public Hero getHero(@PathVariable("id") Integer id) {

        System.out.println("Getting hero " + id);


        return heros.get(id);
    }

}
