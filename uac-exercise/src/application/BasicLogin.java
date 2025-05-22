package application;

public class BasicLogin implements ILogin {
	String username;
	String password;
	
	public BasicLogin(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int authenticate(String authusername, String authpassword) {
		if (authusername.equals(username) && authpassword.equals(password)) {
			return 1;
		}
		return 0;
	}
}
