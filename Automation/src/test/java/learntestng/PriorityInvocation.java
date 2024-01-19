package learntestng;

import org.testng.annotations.Test;

public class PriorityInvocation {

	@Test(priority = 1, invocationCount = 3)
	public void loginpage() {
		System.out.println("loginpage has been executed");
		
	}
	@Test(priority = 1,invocationCount = 3)
	
	public void homepage() {
		System.out.println("homepage has been executed");
	}
	@Test(priority = 1,invocationCount = 3)
	
	public void productpage() {
		System.out.println("productpage has been executed");
	}
	@Test(priority = 1,invocationCount = 2)
	
	public void addtocart() {
		System.out.println("addtocart has been executed");
	}
	@Test( priority = 1,invocationCount = 2)
	public void paymentpage() {
		System.out.println("paymentpage has been executed");
	}
}
