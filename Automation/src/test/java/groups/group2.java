package groups;

import org.testng.annotations.Test;

public class group2 {
@Test(groups = "regression")
	public void d() {
		System.out.println("D has been executed");
	
	}
@Test(groups = "performance")
public void e() {
	System.out.println("E has been executed");
}
@Test(groups = "unit")
public void f() {
	System.out.println("F has been executed");
}
}
