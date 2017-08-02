public class Main {
    public static void main(String[] args) {
        Mail mail1=MailFactory.createMail("pop");
        mail1.recieveMail();
        Mail mail2=MailFactory.createMail("imap");
        mail2.recieveMail();
    }
}
