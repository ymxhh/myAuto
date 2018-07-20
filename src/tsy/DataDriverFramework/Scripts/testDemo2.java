package tsy.DataDriverFramework.Scripts;

import org.testng.annotations.Test;

public class testDemo2 {

//	@Test(groups = {"a", "b"})
	@Test(dependsOnMethods = {"testb"})
//	@Test(dependsOnMethods = {"testb"}, alwaysRun = true)
	public void testab() {
		System.out.println("ab");
	}
	
	@Test(groups = "a")
	public void testa() {
		System.out.println("a");
	}
	
	@Test(groups = "b")
	public void testb() {
		System.out.println("b");
	}
}
