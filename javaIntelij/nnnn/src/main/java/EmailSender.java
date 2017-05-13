import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Created by andre on 08.03.2017.
 */
public class EmailSender {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("endrju1704","43261314a"));
        email.setSSLOnConnect(true);
        email.setFrom("endrju1704@gmail.com");
        email.setSubject("test programu mailowego");
        email.setMsg("tresc wiadomosci");
        email.addTo("endrju1704@gmail.com");
        email.send();

    }


}
