package com.example.ramen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ramen.model.Area;
import com.example.ramen.repository.AreaRepository;



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

    @Autowired
    private AreaRepository areaRepository;
    @GetMapping("/areas")
    public String listAreas(Model model) {
        List<Area> areas = areaRepository.findAll(); // 全件取得
        model.addAttribute("areas", areas);          // HTMLに渡す
        return "area-list";                          // area-list.html を表示
    }
}