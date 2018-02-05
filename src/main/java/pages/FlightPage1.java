package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPage1 extends BasePage1  {
	
	@FindBy(id="primary-header-flight")
	private WebElement flight_tab;
	@FindBy(id="flight-origin")
	private WebElement flight_src;
	@FindBy(id="flight-destination")
	private WebElement flight_dest;
	@FindBy(id="flight-departing")
	private WebElement flight_depart;
	@FindBy(xpath=("//button[@class='datepicker-cal-date' and @data-year='2018' and @data-month='1' and @data-day='22']"))
	private WebElement departpickerdate;
	@FindBy(id="flight-returning")
	private WebElement flight_return;
	@FindBy(xpath=("//button[@class='datepicker-cal-date' and @data-year='2018' and @data-month='1' and @data-day='25']"))
	private WebElement returnpickerdate;
	@FindBy(id="search-button")
	private WebElement searchbutton;
	@FindBy(xpath=("//div[contains(.,'Pune, India')]"))
	private WebElement visiblepune;
	
	
	public FlightPage1()
	{
		PageFactory.initElements(driver, this);
	}
	public void flighttabOnclick()
	{
		flight_tab.click();
	}
	public void flightsrc(String name)
	{
		flight_src.sendKeys(name);
	}
	public void flightdest(String name)
	{
		flight_dest.sendKeys(name);
	}
	public void departing()
	{
		flight_depart.click();
	}
	public void returning()
	{
		flight_return.click();
	}
	public void departcalenderclick()
	{
		departpickerdate.click();
	}
	public void returncalenderclick()
	{
		returnpickerdate.click();
	}
	public void search()
	{
		searchbutton.click();
	}


}
