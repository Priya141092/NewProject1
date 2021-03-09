package Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Chaayos_Base.Basecl;
import Chaayos_Pages.Homepage;

public class HomepageTest extends Basecl {
	
	Homepage homepage;
	
	public HomepageTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void setup()
	{
		initialization();
		homepage = new Homepage();
	}
	
//	@Test(priority=1)
//	public void typeintest() throws InterruptedException
//	{
//		//Thread.sleep(3000);
//		homepage.typein();
//	}
//	
	
	@Test()
	public void cafeselectiontest() throws InterruptedException
	{
		homepage.typein();
		homepage.cafeselection();
		Thread.sleep(4000);
		//homepage.selectchai();
	}
	
	

}
