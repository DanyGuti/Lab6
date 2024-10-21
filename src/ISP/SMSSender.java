package ISP;

public class SMSSender {
	public static void sendSMS(SMSendable smsSend, String message){
		//	Envía un mensaje SMS al teléfono del Contacto c.
		System.out.println("Mensaje SMS enviado al teléfono: " + smsSend.getTelephone() + message);
	}
}