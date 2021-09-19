package javat.Accounts;
public class AccountAlreadyPresentException extends Exception{
	AccountAlreadyPresentException(){
		super("Account is already present",this);
	}
}