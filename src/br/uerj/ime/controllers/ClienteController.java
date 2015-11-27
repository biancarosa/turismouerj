package br.uerj.ime.controllers;

import br.uerj.ime.clientes.Cliente;
import br.uerj.ime.interno.Funcionario;
import br.uerj.ime.receita.Venda;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClienteController {

    @RequestMapping(value = "/cliente/buscar", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody Cliente criar(@RequestParam("cpf") Long cpf, Model model) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Cliente cliente = null;
        try {
            session.beginTransaction();
            cliente = session.get(Cliente.class, cpf);
            model.addAttribute("cliente", cliente);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cliente;
    }


}