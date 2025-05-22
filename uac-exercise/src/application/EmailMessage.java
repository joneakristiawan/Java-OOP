package application;

public class EmailMessage extends Message {
	
	public EmailMessage(ILogin emailLogin, String sender, String receipient, String content) {
		super(emailLogin, sender, receipient, content);
	}

	@Override
	protected void send(String username, String pass) {
		login.authenticate(username, pass);
		if (login.authenticate(username, pass) == 1) {
			System.out.println("Email sent from " + sender + " to " + receipient + ": " + content);
		}
		else {
			System.out.println("Email authentication failed for user: " + username);
		}
	}

}
