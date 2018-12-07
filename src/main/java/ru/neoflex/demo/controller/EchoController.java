package ru.neoflex.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EchoController {

    @GetMapping("/echo")
    public String echoGet(@RequestParam String text) {
        System.out.println(text);
        return "index.html";
    }

    @PostMapping("/echo")
    public String echoPost(
            @RequestParam String text,
            Model model
    ) {
        model.addAttribute("text",text);
        return "index.html";
    }

}
