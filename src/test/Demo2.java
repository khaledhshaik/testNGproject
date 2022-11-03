package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo2 {

@Test
public void demo(String urlname)
{
	System.out.println("Using TestNG");
	System.out.println(urlname);
}
@BeforeSuite
public void beforesiute()
{
	System.out.println("i am the no 1");
}
}
 