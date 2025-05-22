package application;

public abstract class Message {

	ILogin login;
	String sender;
	String receipient;
	String content;
	
	public Message(ILogin emailLogin, String sender, String receipient, String content) {
		this.login = emailLogin;
		this.sender = sender;
		this.receipient = receipient;
		this.content = content;
	}
	
	protected abstract void send(String username, String passtoken);
	
}
