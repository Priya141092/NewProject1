package Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Chaayos_Base.Basecl;
import Chaayos_Pages.Homepage;
import Chaayos_Pages.SelectChai;
import Chaayos_Pages.SelectIcedTea;
import junit.framework.Assert;

public class SelectIcedTeaTest extends Basecl {
	
	SelectIcedTea sct;
	
	SelectIcedTeaTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		sct = new SelectIcedTea();
		
	}
	
//	@Test
//	public void icedteapanelTest() throws InterruptedException
//	{
//		
//		sct.icedteapanel();
//		String url2 = driver.getCurrentUrl();
//		System.out.println(url2);
//		//Assert.assertEquals("https://www.chaayos.com/menu#IcedTeas", url2);
//		Assert.assertEquals(prop.getProperty("urlnew"), url2);
//	}
	
	@Test
	public void AddAamPannaTest() throws InterruptedException
	{
		
		
		sct.AddAamPanna();
		//icedtea.click();
		//icedtea.click();
		//icedtea.click();
		
		
		
	}

}
