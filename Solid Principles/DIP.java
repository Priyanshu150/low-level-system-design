// Violation of DIP
public class AlertService {
    private SmsSender sms = new SmsSender();
    private EmailSender email = new EmailSender();

    public void sendSms(String message) { sms.send(message); }
    public void sendEmail(String message) { email.send(message); }
}

// Use of DIP principle 
public interface NotificationSender {
    void send(String message);
}

public class SmsSender implements NotificationSender {
    public void send(String message) { /* send SMS logic */ }
}

public class EmailSender implements NotificationSender {
    public void send(String message) { /* send Email logic */ }
}
