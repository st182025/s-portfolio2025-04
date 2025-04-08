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
    @GetMapping("/kanto")
    public String kantoPage() {
        return "kanto";
    }
    @GetMapping("/chubu")
    public String chubuPage() {
    	return "chubu";
    }
    @GetMapping("/niigata")
    public String niigataPage() {
    	return "niigata";
    }
    @GetMapping("/kinki")
    public String kinkiPage() {
    	return "kinki";
    }
    @GetMapping("/chugoku")
    public String chugokuPage() {
        return "chugoku"; 
    }
    @GetMapping("/shikoku")
    public String shikokuPage() {
        return "shikoku"; 
    }
    @GetMapping("/kyushu")
    public String kyushuPage() {
        return "kyushu";
    }
    //test2
    
}