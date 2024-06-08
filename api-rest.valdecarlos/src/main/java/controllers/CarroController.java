package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarroController {

    @RequestMapping(value = "/Carros" , method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }
}
