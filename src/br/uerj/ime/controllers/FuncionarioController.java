package br.uerj.ime.controllers;

import br.uerj.ime.dados.Endereco;
import br.uerj.ime.interno.Funcionario;
import br.uerj.ime.interno.Gerente;
import br.uerj.ime.receita.Venda;
import com.sun.org.apache.xpath.internal.functions.FuncId;
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

import javax.persistence.GeneratedValue;
import java.util.List;

@Controller
public class FuncionarioController {

    @RequestMapping("/funcionario/criar")
    public String criar(Model model) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            List <Gerente> gerentes = (List <Gerente>) session.createQuery("from Gerente").list();
            model.addAttribute("gerentes",gerentes);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Funcionario funcionario = new Funcionario();
        model.addAttribute("funcionario", funcionario);
        return "funcionario/criar";
    }

    @RequestMapping(value = "/funcionario/salvar", method = RequestMethod.POST)
    public String salvar(Funcionario funcionario, Model model) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(funcionario);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/funcionario/listar";
    }



    @RequestMapping(value = "/funcionario/listar", method = RequestMethod.GET)
    public String listar(Model model) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            List funcionarios = session.createQuery("from Funcionario").list();
            model.addAttribute("funcionarios", funcionarios);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "funcionario/lista";
    }

}
