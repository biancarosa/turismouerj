package br.uerj.ime.controllers;

import br.uerj.ime.produtos.Pacote;
import br.uerj.ime.produtos.PacoteAereo;
import br.uerj.ime.produtos.PacoteRodoviario;
import br.uerj.ime.receita.Venda;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PacoteController {

    @RequestMapping(value = "/pacote/criar", method = RequestMethod.GET)
    public String criar(@RequestParam("tipo") String tipo, Model model) {
        Pacote pacote;
        if (tipo.equals("aereo")) {
            pacote = new PacoteAereo();
        } else {
            pacote = new PacoteRodoviario();
        }
        model.addAttribute("tipo", tipo);
        model.addAttribute("pacote", pacote);
        return "pacote/criar";
    }

    @RequestMapping(value = "/pacote/salvar-aereo", method = RequestMethod.POST)
    public String salvar(PacoteAereo pacote, Model model) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(pacote);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return "redirect:/pacote/listar";
    }

    @RequestMapping(value = "/pacote/salvar-rodoviario", method = RequestMethod.POST)
    public String salvar(PacoteRodoviario pacote, Model model) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(pacote);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return "redirect:/pacote/listar";
    }

    @RequestMapping(value = "/pacote/listar", method = RequestMethod.GET)
    public String listar(Model model) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            List<Pacote> pacotes = session.createCriteria(Pacote.class).list();
            model.addAttribute("pacotes", pacotes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "pacote/lista";
    }


    @RequestMapping(value = "/pacote/remover")
    public String remover(@RequestParam("pacoteId") Long pacoteId, Model model) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            Pacote pacote = session.get(Pacote.class, pacoteId);
            Long quantidade = (Long) session.createQuery("select count(*) from Venda venda where venda.pacote = :pacote").setParameter("pacote", pacote).uniqueResult();
            if (quantidade == 0) { // nao deleta pacotes vendidos
                session.delete(pacote);
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return "redirect:/pacote/listar";
    }

}