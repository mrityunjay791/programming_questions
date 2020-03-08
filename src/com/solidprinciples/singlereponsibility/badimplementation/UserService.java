package com.solidprinciples.singlereponsibility.badimplementation;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;

public class UserService implements IUserService {

    public void registerUser(User user) {
        // save user to database
        // send mail to user for verfication

        final String fromEmail = user.getEmail(); // requires valid gmail             // id
        final String password = "xxxxxxx"; // correct password for gmail id
        final String toEmail = "myemail@yahoo.com"; // can be any email id

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP Host
        props.put("mail.smtp.port", "587"); // TLS Port
        props.put("mail.smtp.auth", "true"); // enable authentication
        props.put("mail.smtp.starttls.enable", "true"); // enable STARTTLS

        // create Authenticator object to pass in Session.getInstance argument
        Authenticator auth = new Authenticator() {
            // override the getPasswordAuthentication method
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password.toCharArray());
            }
        };
//        Session session = Session.getInstance(props, auth);
        sendEmail("here need to pass session", toEmail, "TLSEmail Testing Subject", "TLSEmail Testing Body");
   }

    private void sendEmail(Object session, String toEmail, String subject, String body) {
     try {
//            MimeMessage msg = new MimeMessage(session);
            // set message headers
//            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
//            msg.addHeader("format", "flowed");
//            msg.addHeader("Content-Transfer-Encoding", "8bit");

//            msg.setFrom(new InternetAddress("no_reply@gmail.com", "NoReply-JD"));
//
//            msg.setReplyTo(InternetAddress.parse("no_reply@gmail.com", false));

//            msg.setSubject(subject, "UTF-8");
//
//            msg.setText(body, "UTF-8");
//
//            msg.setSentDate(new Date());

//            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            System.out.println("Message is ready");
//            Transport.send(msg);

            System.out.println("EMail Sent Successfully!!");
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
}