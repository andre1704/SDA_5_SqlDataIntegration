import org.apache.commons.mail.*;

/**
 * Created by andre on 08.03.2017.
 */
public class MailAttachment {
    public static void main(String[] args) throws EmailException {
        EmailAttachment emailAttachment=new EmailAttachment();
        emailAttachment.setPath("C:\\Users\\andre\\Documents\\anna.jpg");
        emailAttachment.setDisposition(EmailAttachment.ATTACHMENT);
        emailAttachment.setDescription("anna");
        emailAttachment.setName("anna");

        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("endrju1704","43261314a"));
        email.setSSLOnConnect(true);
        email.setFrom("endrju1704@gmail.com");
        email.setSubject("anna zdjecie");
        email.setMsg("zdjecie anny");
        email.addTo("endrju1704@gmail.com");
        email.attach(emailAttachment);
        email.send();
    }

}
