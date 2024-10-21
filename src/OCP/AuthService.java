package OCP;
public class AuthService {
	
	private AuthInterface authServiceImpl;
	
    public AuthService(AuthInterface authServiceImpl) {
        this.authServiceImpl = authServiceImpl;
    }
	
	public boolean signIn(String log, String pass) { 
		return authServiceImpl.signInAuthService(log, pass);
	}
}