package appium.Project;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;

import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.hc.core5.http.Message;
import org.openqa.selenium.virtualauthenticator.VirtualAuthenticatorOptions.Transport;
import org.testng.annotations.Test;

public class MailSending {
	@Test
	public void mailSend() {
//
//        // Set up mail server properties (replace placeholders with actual values)
//        Properties properties = new Properties();
//        properties.put("mail.smtp.host", "your-actual-smtp-server.com");
//        properties.put("mail.smtp.port", "587"); // Use the appropriate port
//        properties.put("mail.smtp.auth", "true");
//        properties.put("mail.smtp.starttls.enable", "true");
//
//        // Set up authentication
//        Authenticator authenticator = new Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//               // return new PasswordAuthentication("your-actual-email-address@gmail.com", "your-actual-password");
//            }
//        };
//
//        // Create a mail session
//        //Session session = Session.getInstance(properties, authenticator);
//
//        try {
//            // Create a message
//       //     MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("your-actual-email-address@gmail.com"));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("recipient-email-address"));
//            message.setSubject("Extent Report");
//            message.setText("Please find the attached Extent Report.");
//
//            // Attach the Extent Report HTML file (replace with the correct path)
//            MimeBodyPart messageBodyPart = new MimeBodyPart();
//            Multipart multipart = new MimeMultipart();
//            messageBodyPart.attachFile("correct/path/to/ExtentReport.html");
//            multipart.addBodyPart(messageBodyPart);
//
//            // Set the email content
//            message.setContent(multipart);
//
//            // Send the message
//            Transport.send(message);
//
//            System.out.println("Email sent successfully!");
//
//        } catch (MessagingException e) {
//            // Handle potential email sending errors
//            System.out.println("Error sending email: " + e.getMessage());
//            e.printStackTrace();
//        }
   }
}


