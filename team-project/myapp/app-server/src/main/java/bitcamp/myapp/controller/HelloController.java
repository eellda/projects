package bitcamp.myapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {

  @GetMapping("/api/hello")
  @CrossOrigin(origins = "http://localhost:3000")
  public String test() {
    return "Hello, world!";
  }

}
