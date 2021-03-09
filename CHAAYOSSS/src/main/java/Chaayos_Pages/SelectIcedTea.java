package Chaayos_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Chaayos_Base.Basecl;

public class SelectIcedTea extends Basecl {
	
	@FindBy(xpath="//a[contains(@href,'IcedTeas')]")
	WebElement icedtea;
	
	@FindBy(xpath="//*[@id='IcedTeas']/div[2]/div[2]/div[2]/div[2]/div[3]")
	WebElement aampanna;
	
	@FindBy(xpath=" //*[@class='modalBody']/div[2]/div[1]/div[2]/div[2]/div[1]")
	WebElement increment;
	
	@FindBy(xpath=" //*[@class='modalTitle']")
	WebElement title;
	
	@FindBy(xpath=" //*[@class='dimensionBtn']/span[@class='sizeDescription' and text()='300ml']")
	WebElement Full;
    //String actual1 = title.getText();

	Homepage hm = new Homepage();
	
	public SelectIcedTea()
	{
		PageFactory.initElements(driver, this);
		//hm.cafeselection();
	}
	
	
	public void icedteapanel() throws InterruptedException
	{
		hm.cafeselection();
		Thread.sleep(4000);
		icedtea.click();
	}
	
	public void AddAamPanna() throws InterruptedException
	{
		hm.cafeselection();
		Thread.sleep(4000);
		icedtea.click();
		Thread.sleep(3000);
		aampanna.click();
		Thread.sleep(3000);
		increment.click();
		Thread.sleep(3000);
		Full.click();
		
	}
	

}
