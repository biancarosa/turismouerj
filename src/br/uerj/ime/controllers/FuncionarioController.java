package br.uerj.ime.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FuncionarioController {

    @RequestMapping("/funcionario/criar")
    public String criar() {
        return "funcionario/criar";
    }
}
