/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author tiago.lucas
 */
@FacesValidator("emailValidator")
public class EmailValidator implements Validator{
    private String email;
    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        email = (String)value;
        Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
        Matcher m = p.matcher(email);
        if(!m.find()){
            FacesMessage fm = new FacesMessage("E-mail inválido");
            throw new ValidatorException(fm);
        }
    }    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
