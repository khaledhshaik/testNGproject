package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;



public class Demo3 {
	
@Test(dependsOnMethods ={"loginAPIcarloan"})
public void Weblogincarloan()
{
	System.out.println("Weblogincar");
}
@Test
public void propertyloan()
{
	System.out.println("property loan");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("Before executing any methods in the class");
}
@BeforeMethod
public void beforemethod()
{
	System.out.println("i wll execute before every test method in Demo3 class");
}
@Parameters({"URL","APIkey/username"})
@Test
public void onlycarloan(String urlname,String username)
{
	System.out.println("get only carloan");
	System.out.println(urlname);
	System.out.println(username);
}
@Test(dataProvider="getData")
public void Mobilelogincarloan(String username,String password)
{
	System.out.println("Mobilelogincar");
	System.out.println(username);
	System.out.println(password);
	
}
@Test(groups= {"Smoke"})
public void loginAPIcarloan()
{
	System.out.println("APIlogincar");
}
@DataProvider
public Object[][] getData()
{
	//1st combination - username password-good credit history
	//2nd combination - username password-no credit history
	//2nd combination - fraudulent  credit history
	Object[][] data=new Object[3][2];
	//1st set
	data[0][0]="first username";
	data[0][1]="first password";
	//2nd set
	data[1][0]="second username";
	data[1][1]="second password";
	//3rd set
	data[2][0]="third username";
	data[2][1]="third password";
	return data;	
}
}
 


