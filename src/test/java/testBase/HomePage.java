package testBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility_info.ExtentReport;

public class HomePage  extends ExtentReport{
	@Test
	public  void demo() {
		test=extent.createTest("Testing demo");
		System.out.println("Executed");
}
	@Test
	public  void demo2() {
		test=extent.createTest("login page");
		Assert.assertTrue(false);
	}}
