package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo4 {
@AfterSuite
public void lastsuite()
{
	System.out.println("i am the last one in suite");
}
@Test
public void Webloginhomeloan(String urlname,String key)
{
	System.out.println("Webloginhome");
	System.out.println(urlname);
	System.out.println(key);
}
@AfterMethod
public void aftermethod()
{
	System.out.println("i will execute after every test method of the Demo4 class");
}
@Test(groups= {"Smoke"})
public void Mobileloginhomeloan()
{
	System.out.println("Mobileloginhome");
}@AfterTest
public void loginAPIhomeloan()
{
	System.out.println("i will execute last");
}

}
 