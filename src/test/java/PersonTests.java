import org.junit.Test;


import static org.junit.Assert.*;

public class PersonTests  {

	@Test
	public void ShouldWelcomePersonByName(){
		Person p =new Person();
		
		String welcomeMessage= p.WelcomPersonByName("Suncorp Customer");
		
		
		assertEquals("Hello Suncorp Customer",welcomeMessage);
		//assertSame("Failed","Hello Murali",welcomeMessage);
		
	}

     @Test
	public void ShouldWelcomePersonByName1(){
		Person p =new Person();
		
		String welcomeMessage= p.WelcomPersonByName("Suncorp Customer");
		
		
		assertEquals("Hello Suncorp Customer",welcomeMessage);
		//assertSame("Failed","Hello Murali",welcomeMessage);
		
	}
	
}
