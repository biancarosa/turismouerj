package br.uerj.ime.controllers;

import br.uerj.ime.clientes.Cliente;
import br.uerj.ime.dados.Endereco;
import br.uerj.ime.interno.Funcionario;
import br.uerj.ime.produtos.Pacote;
import br.uerj.ime.produtos.PacoteAereo;
import br.uerj.ime.produtos.PacoteRodoviario;
import br.uerj.ime.receita.Venda;
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
public class VendaController {

    @RequestMapping(value = "/venda/criar", method = RequestMethod.GET)
    public String criar(@RequestParam("pacoteId") Long pacoteId, Model model) {
        Venda venda = new Venda();
        Cliente cliente = new Cliente();
        cliente.setEndereco(new Endereco());
        venda.setCliente(cliente);
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            Pacote pacote = session.get(Pacote.class, pacoteId);
            venda.setPacote(pacote);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        model.addAttribute("venda", venda);
        return "venda/criar";
    }

    @RequestMapping(value = "/venda/salvar", method = RequestMethod.POST)
    public String salvar(Venda venda, Model model) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            Funcionario funcionario = session.get(Funcionario.class, Long.parseLong("3"));
            venda.setFuncionario(funcionario);

            Pacote pacote = session.get(Pacote.class, venda.getPacote().getCodigo());
            venda.setPacote(pacote);

            session.save(venda);

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return "redirect:/pacote/listar";
    }

}