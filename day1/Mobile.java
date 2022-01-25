package week1.day1;

public class Mobile 
{
	public void saveContact(String name) 
	{
		System.out.println("saveContact:" + name);	
	}
public void sendMessage(String message)
{
		System.out.println("Message send:" + message);	
	}

public void makeCall(long mobileNumber)
{
	System.out.println("Call number:" +  mobileNumber);	
}
public static void main(String[] args)
{
	Mobile ms = new Mobile();
	ms.saveContact(" ms dhoni");
	ms.makeCall(9789878045L);
	ms.sendMessage("hi dhoni how are you");
	}

}
