package livingfantasy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

  @GetMapping("/login")
  public String login() {
    return "login";
  }

    @GetMapping("/success")
    public String loginSuccessHandler() {
        return "success";
    }

}