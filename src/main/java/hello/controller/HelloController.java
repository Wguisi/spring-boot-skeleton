package hello.controller;

import hello.command.ListCarsCommand;
import hello.command.base.IBusinessCommand;
import hello.exception.business.base.BusinessCommandException;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

@RestController
public class HelloController {

    @Inject
    ListCarsCommand listCarsCommand;

    @RequestMapping("/ping")
    public String index() throws BusinessCommandException{
        this.listCarsCommand.execute(null);
        return "Greetings from Spring Boot ping em controller 2!";
    }

    @RequestMapping("/pong")
    public String pong() {
        return "Greetings from Spring Boot pong em controller 2!";
    }

    @RequestMapping("/converte")
    public String converte() {
        return ""+Integer.parseInt("beleza");
    }
    
}
