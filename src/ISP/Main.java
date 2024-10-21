package ISP;

public class Main {
    public static void main(String[] args) {
    	// Iniciar las clases que implementan la interfaz
    	// Sea GmailAccount o Contact
    	// En este caso, será GmailAccount
    	
    	// Crear cuenta de gmail
    	GmailAccount gmailAccount = new GmailAccount("Daniel", "danyguti2001@gmail.com");
    	EmailSender.sendEmail(gmailAccount, "Hello world");
    }
}