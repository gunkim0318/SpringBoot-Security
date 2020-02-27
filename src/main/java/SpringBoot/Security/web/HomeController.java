package SpringBoot.Security.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/list")
    public void list(){
    }
    @GetMapping("/security/guest1")
    public void guest1(){
    }
    @GetMapping("/security/guest2")
    public void guest2(){
    }
    @GetMapping("/security/user1")
    public void user1(){
    }
    @GetMapping("/security/admin1")
    public void admin1(){
    }
    @GetMapping("/security/admin2")
    public void admin2(){
    }
}