package Chaayos_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Chaayos_Base.Basecl;

public class SelectChai extends Basecl {
	
	Homepage hm = new Homepage();
	
	
	@FindBy(xpath= "//*[@id='MilkChai']/div[2]/div[1]/div[2]/div[2]/div[2]")
	WebElement selectchai;
	
	@FindBy(xpath= "//*[@class='customizationWrapper']/div[2]/div[1]")
	WebElement AddRegular;
	
	@FindBy(xpath= "//*[@class='headerBtn rel']")
	WebElement carbutton;
	
	
	public SelectChai()
	{
		PageFactory.initElements(driver, this);
	}

	public void selectchai() throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		
		hm.cafeselection();
		Thread.sleep(4000);
		selectchai.click();
		
	}
	
	public void AddRegular() throws InterruptedException
	{  
		hm.cafeselection();
		Thread.sleep(4000);
		selectchai.click();
		Thread.sleep(3000);
		AddRegular.click();
	}
	
	
	public void Addcart() throws InterruptedException
	{
		hm.cafeselection();
		Thread.sleep(4000);
		selectchai.click();
		Thread.sleep(3000);
		AddRegular.click();
		carbutton.click();
	}
}
