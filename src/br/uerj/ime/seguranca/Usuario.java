package br.uerj.ime.seguranca;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Usuario {

    @Id
    @GeneratedValue
    private Long codigo;

    private String login;
    private String senha;

    @OneToMany
    private Set<Permissao> permissoes;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Set<Permissao> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(Set<Permissao> permissoes) {
        this.permissoes = permissoes;
    }
}