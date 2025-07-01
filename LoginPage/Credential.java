package LoginPage;

public class Credential {
	private String loginId;
	private String password;
	
	public Credential( String loginID, String password)
	{
		this.loginId = loginID;
		this.password = password;
	}

	public String GetLoginID() 
	{
		return loginId;
	}
	
	public String GetPassword() {
		return password;
	}
}


