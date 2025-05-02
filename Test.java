public class Test
{
public Static void main(string[] args)
{
System.setProperty("webdriver.chrome.driver", "C:\Users\Desktop\Java\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.labcorp.com/");

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

WebElement careersLink = driver.findElement(By.Xpath("//div[@id="text-a63751913f"]/p/a"));

careersLink.click();

webElement SearchText=driver.findElement(By.id("//input[@id='typehead']"));

SearchText.sendkeys("Automation");

SearchText.sendKeys(Keys.ENTER);

WebElement Link = driver.findElement(By.Xpath("//span[contains(text(),'Automation Engineer ')]"));

Link.click();

String actualTitle=driver.getTitle();

String expectedTitle="Automation Engineer"

assert.assertEquals( actualTitle,expectedTitle);

String JobLocation=driver.findElement(By.class("//span[@class='au-target job-location']")).getText();

assert.assertEquals( JobLocation,"Bangalore,India");

WebElement ApplyNow = driver.findElement(By.cssSelector("body > div.ph-page > div.body-wrapper.ph-page-container > div > div.job-page-external > div > div > div.col-lg-8.col-md-8.col-sm-12 > section:nth-child(3) > div > div > div.job-description > div.job-bottom-action > a > ppc-content"));

ApplyNow.click();

String currentUrl = driver.getCurrentUrl();

System.out.println("Navigated to: " + currentUrl);

driver.quit();
}

}






