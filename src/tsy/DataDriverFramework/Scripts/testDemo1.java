package tsy.DataDriverFramework.Scripts;

import org.testng.annotations.Test;

public class testDemo1 {

	@Test(groups = {"A", "B"})
	public void testAB() {
		System.out.println("AB");
	}
	
	@Test(groups = "A")
	public void testA() {
		System.out.println("A");
	}
	
	@Test(groups = "B")
	public void testB() {
		System.out.println("B");
	}
}
