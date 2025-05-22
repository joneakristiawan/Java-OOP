package application;

public class SMSMessage extends Message {

	public SMSMessage(ILogin smsLogin, String sender, String receipient, String content) {
		super(smsLogin, sender, receipient, content);
	}

	@Override
	protected void send(String username, String token) {
		login.authenticate(username, token);
		if (login.authenticate(username, token) == 1) {
			System.out.println("SMS sent from " + sender + " to " + receipient + ": " + content);
		}
		else {
			System.out.println("SMS authentication failed for user: " + username);
		}
		
	}

}
