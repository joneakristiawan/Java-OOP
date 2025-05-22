package application;

public class OAuthLogin implements ILogin {
	String token;
	
	OAuthLogin(String token){
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public int authenticate(String authusername, String authtoken) {
		if (authtoken.equals(token)) {
			return 1;
		}
		return 0;
	}
}
