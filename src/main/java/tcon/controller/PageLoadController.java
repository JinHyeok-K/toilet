package tcon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageLoadController {

    @GetMapping("/")
    public String main(){
        return "main";
    }


}
