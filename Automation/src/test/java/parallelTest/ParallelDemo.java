package parallelTest;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.Test;

public class ParallelDemo {
	WebDriver driver =null;
@Test
	public void test1() throws InterruptedException {
		System.out.println("Test1 Execution"+Thread.currentThread().getId());
		
		
	}
@Test
public void test2() throws InterruptedException {
	System.out.println("Test2 Execution"+Thread.currentThread().getId());
	
}
@Test
public void test3() throws InterruptedException {
	System.out.println("Test3 Execution"+Thread.currentThread().getId());
	
}
}
