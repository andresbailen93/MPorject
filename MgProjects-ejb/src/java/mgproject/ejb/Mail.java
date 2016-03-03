/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgproject.ejb;

import java.util.Date;
import java.util.Properties;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Paloma
 */
@Stateless
public class Mail {
    String servidorSMTP = "smtp.gmail.com";
    String puerto = "587";
    String usuario = "xiiiinftel@gmail.com";
    String password = "inftelinftel";
    
    String destiny = null;
    String subject = null;
    String mensaje = null;

    public Mail() {
    }

    public Mail(String destiny, String subject, String message) {
        this.destiny = destiny;
        this.subject = subject;
        this.mensaje = message;
    }

    public String getServidorSMTP() {
        return servidorSMTP;
    }

    public void setServidorSMTP(String servidorSMTP) {
        this.servidorSMTP = servidorSMTP;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
   
    
}


