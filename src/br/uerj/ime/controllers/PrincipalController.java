package br.uerj.ime.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrincipalController {

    @RequestMapping("/")
    public String execute() {
        return "index";
    }
}
