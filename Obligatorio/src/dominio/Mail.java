/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Guillermo
 */
public class Mail {
    private final String usuario = "gralonsojude@gmail.com";
    private final String contraseña = "gralonsojude1";

     //Metodo que envia mail a un email especifico con el texto de que gano el sorteo
    //codigo copiado de " http://panamahitek.com/javamail-enviar-correos-electronicos-desde-java/"
    public boolean SendMail(String nombre, String email, String textoPremio) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(usuario, contraseña);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(usuario));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(email));
            message.setSubject("Tu reseña te trajo suerte!");
            message.setText(textoPremio);

            Transport.send(message);
            return true;

        } catch (MessagingException e) {
            return false;
        }
    }
}
