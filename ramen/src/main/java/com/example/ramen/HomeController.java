package com.example.ramen;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        return "home"; // templates/index.html を返す
    }
    
    @GetMapping("/hokkaido")
    public String hokkaidoPage() {
        return "hokkaido";
    }
    @GetMapping("/tohoku")
    public String tohokuPage() {
        return "tohoku";
    }
    @GetMapping("/kyushu")
    public String kyushuPage() {
        return "kyushu";
    }

    @GetMapping("/kanto")
    public String kantoPage() {
        return "kanto";
    }
}