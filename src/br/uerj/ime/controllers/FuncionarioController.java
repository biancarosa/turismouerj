package br.uerj.ime.controllers;

import br.uerj.ime.dados.Endereco;
import br.uerj.ime.interno.Funcionario;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FuncionarioController {

    @RequestMapping("/funcionario/criar")
    public String criar(Model model) {
        Funcionario funcionario = new Funcionario();
        model.addAttribute("funcionario", funcionario);
        return "funcionario/criar";
    }

    @RequestMapping(value = "/funcionario/salvar", method = RequestMethod.POST)
    public String salvar(Funcionario funcionario, Model model) {
        System.out.println("Hi");
        System.out.println(funcionario.getNome());
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
        System.out.println("Look");
        Long codigo = funcionario.getCodigo();
        return "redirect:/funcionario/visualizar?id="+codigo.toString();
    }



    @RequestMapping(value = "/funcionario/visualizar", method = RequestMethod.GET)
    public String visualizar(@RequestParam("id") Long id, Model model) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Funcionario funcionario;
        try {
            session.beginTransaction();
            funcionario = session.get(Funcionario.class, id);
            model.addAttribute("funcionario", funcionario);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "funcionario/visualizar";
    }


}
