package OCP;

public class Main {
	public static void main(String[] args) {
		AuthService twitterAuthService = new AuthService(new TwitterAuthService());
		boolean twService = twitterAuthService.signIn("user1", "password1");
        
        AuthService facebookAuthService = new AuthService(new FacebookAuthService());
        boolean facService = facebookAuthService.signIn("user2", "password2");
        
        AuthService googleAuthService = new AuthService(new GoogleAuthService());
        boolean gooService = googleAuthService.signIn("user3", "password3");
        
        AuthService appleAuthService = new AuthService(new AppleAuthService());
        boolean appService = appleAuthService.signIn("user4", "password4");
        
        System.out.println(twService);
        System.out.println(appService);
        System.out.println(gooService);
        System.out.println(facService);
	}
}