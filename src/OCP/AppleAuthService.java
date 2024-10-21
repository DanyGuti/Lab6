package OCP;
public class AppleAuthService implements AuthInterface {
	@Override
	public boolean signInAuthService(String log, String pass) { //use the google api
		// AuthServiceImpl.signInWithApple(log, pass);
		return true; 
	}
}