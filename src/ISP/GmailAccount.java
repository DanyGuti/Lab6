package ISP;

public class GmailAccount implements Emailable {
	String name;
	String emailAddress;
	public GmailAccount(String name, String emailAddress) {
		this.name = name;
		this.emailAddress = emailAddress;
	}
	public void setName(String n) { name=n; }
	public String getName() { return name; }
	
	@Override
	public String getEmail() { return emailAddress; }
	
}