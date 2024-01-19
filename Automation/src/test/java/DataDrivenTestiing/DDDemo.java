package DataDrivenTestiing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDDemo {
	@Test(dataProvider = "dsm")
	public void testlogin(String username,String password) {
		System.out.println("user has loggedin using username:"+username+" and password:"+password);
	}


	//ill supply multiple set of data to the above test method
	//im passing 3 set of data to the testng test method it will run 3times
	@DataProvider(name="dsm")
	public Object[][] dataSupplierMethod() {
		
		Object[][] data = {{"manju","1428"},{"Thor","2814"},{"manyogi","1824"}};
		return data;
		//it will return object array
	}
	
	
}
