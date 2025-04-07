package One;

import org.testng.annotations.Test;

public class TestNgHW1 {
	
	@Test(groups = {"High Priority"})
	public void testa1() {
		System.out.println("This is test1");
	}
	
	@Test()
	public void testa2() {
		System.out.println("This is test2");
	}
	
	@Test()
	public void testa3() {
		System.out.println("This is test3");
	}

}
