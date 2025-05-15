package com.prado.frist_spring.controller;


import com.prado.frist_spring.domain.User;
import com.prado.frist_spring.service.HelloWorldService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    //@Autowired
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWordService) {
        this.helloWorldService = helloWordService;
    }

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Davi Prado");
    }

    @PostMapping("/{id}")
    public String HelloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody User body) {
        return "Hello World " + body.getName() + id + filter;

    }

}
