package Chaayos_Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Chaayos_Base.Basecl;

public class Homepage extends Basecl {
	
	@FindBy(xpath= "//input[@type='radio' and @id='dinein']")
	WebElement dinein;
	
	@FindBy(xpath= "//*[@id='appRoot']/div[1]/div/div[3]/div[2]/label")
	WebElement dinein1;
	
	@FindBy(id="react-select-3--value")
	WebElement cafe1;
	
	@FindBy(xpath="//*[@id='react-select-3--value']")
	WebElement cafe;
//	
//	@FindBy(xpath= "//*[@id='MilkChai']/div[2]/div[1]/div[2]/div[2]/div[2]")
//	WebElement selectchai;
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void typein() 
	{
		
		dinein1.click();
	}
	
	public void cafeselection()
	{
		
		
		Actions builder = new Actions(driver);
		cafe.click();
		builder.sendKeys(Keys.DOWN).build().perform();
//		builder.sendKeys("World Mark 1");
	builder.sendKeys(Keys.ENTER).build().perform();
		
		
		//sb.selectByVisibleText("The Gallery On Mg");
	}

//	public void selectchai()
//	{
//		selectchai.click();
//	}

}
