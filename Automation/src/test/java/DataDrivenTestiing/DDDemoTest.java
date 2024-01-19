package DataDrivenTestiing;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDDemoTest {
	
	@Test(dataProvider = "dsm")
	public void testLogin(String username, String password) {
		System.out.println("user has loggedin username:"+username+"and pssword:"+password);
		
		
	}
	@DataProvider(name="dsm")
	public Object[][] DataSupplierMethod() {
		Object[][] data= {{"manju","1428"},{"thor","8241"},{"manyogi","2814"}};
		return data;
	}

}
