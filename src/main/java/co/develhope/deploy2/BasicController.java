package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class BasicController {

    private Random random;


    public BasicController () {
        this.random = new Random();
    }

    @GetMapping("/")
    public Integer getRandomSum () {
        return random.nextInt() + random.nextInt();
    }

}