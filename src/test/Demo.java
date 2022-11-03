package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
@Test (groups= {"Smoke"})
public void demo()
{
	System.out.println("Hello TestNG");
}
@BeforeTest
public void secondtest()
{
	System.out.println("First me");
}
}
