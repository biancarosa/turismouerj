package br.uerj.ime.controllers;

import br.uerj.ime.interno.Funcionario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FuncionarioController {

    @RequestMapping("/funcionario/criar")
    public String criar() {

        return "funcionario/criar";
    }

    @RequestMapping("/funcionario/salvar")
    public String salvar(@ModelAttribute("funcionario") Funcionario funcionario, BindingResult result, Model model) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(funcionario);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return "funcionario/visualizar?id=1";
    }



    @RequestMapping("/funcionario/visualizar")
    public String visualizar(@RequestParam("id") int id, Model model) {
        System.out.println(id);

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Funcionario funcionario =  (Funcionario) session.get(Funcionario.class, id);

        model.addAttribute("funcionario", funcionario);

        return "funcionario/visualizar";
    }


}
