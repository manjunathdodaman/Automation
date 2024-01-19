package groups;

import org.testng.annotations.Test;

public class group1 {
@Test(groups = "functional")
	public void a() {
		System.out.println("A has been executed");
	
	}
@Test(groups = "integration")
public void b() {
	System.out.println("B has been executed");
}
@Test(groups = "smoke")
public void c() {
	System.out.println("C has been executed");
}

}

