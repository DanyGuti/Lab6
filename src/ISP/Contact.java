package ISP;

public class Contact implements Emailable, SMSendable {
	String name, address, emailAddress, telephone;
	public void setName(String n) { name=n; }
	public String getName() { return name; }
	public void setAddress(String a) { address=a; }
	public String getAddress() { return address; }
	public void setEmailAddress(String ea) { emailAddress=ea; }
	public void setTelephone(String t) { telephone=t; }
	
	@Override
	public String getEmail() { return emailAddress; }
	
	@Override
	public String getTelephone() { return telephone; }
	
}