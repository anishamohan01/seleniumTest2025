package One;

import org.testng.annotations.Test;

public class TestNgHW {
	
	@Test()
	public void test1() {
		System.out.println("This is test1");
	}
	
	@Test(groups = {"High Priority"})
	public void test2() {
		System.out.println("This is test2");
	}
	
	@Test()
	public void test3() {
		System.out.println("This is test3");
	}

}
