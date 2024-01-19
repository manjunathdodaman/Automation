package groups;

import org.testng.annotations.Test;

public class group3 {
@Test(groups = "usability")

	public void g() {
		System.out.println("G has been executed");
	
	}
@Test(groups = "compabaility")
public void h() {
	System.out.println("H has been executed");
}
@Test(groups = "globalization")
public void i() {
	System.out.println("I has been executed");
}
}
