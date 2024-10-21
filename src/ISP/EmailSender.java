package ISP;

public class EmailSender {
	public static void sendEmail(Emailable emailable, String message){
		//Envía un mensaje a la dirección de correo electrónico del
		System.out.println("Enviado a: " + emailable.getEmail() + ", con mensaje: " + message);
	}	
}