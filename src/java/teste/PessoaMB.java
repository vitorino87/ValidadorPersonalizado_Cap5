/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tiago.lucas
 */
@ManagedBean
@RequestScoped
public class PessoaMB {

    /**
     * Creates a new instance of PessoaMB
     */
    public PessoaMB() {
    }
    private EmailValidator pessoa = new EmailValidator();

    public EmailValidator getPessoa() {
        return pessoa;
    }

    public void setPessoa(EmailValidator pessoa) {
        this.pessoa = pessoa;
    }
    
}
