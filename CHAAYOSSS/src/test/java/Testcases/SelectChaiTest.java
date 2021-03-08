package Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Chaayos_Base.Basecl;
import Chaayos_Pages.Homepage;
import Chaayos_Pages.SelectChai;
import junit.framework.Assert;


public class SelectChaiTest extends Basecl {
	
	SelectChai sc;
	
	
	public SelectChaiTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void setup()
	{
		initialization();
		sc = new SelectChai();
		
	}
	
//	@Test(priority=1)
//	public void selectchaitest() throws InterruptedException
//	{
//	  
//		sc.selectchai();
//		
//	}
//	
//	@Test(priority =2)
//	public void AddRegularTest() throws InterruptedException
//	{
//		sc.AddRegular();
//	}
	
	@Test()
	public void AddcartTest() throws InterruptedException
	{
		sc.Addcart();
	}

}
