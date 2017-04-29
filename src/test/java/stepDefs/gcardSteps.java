package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by manzurelahi on 4/27/17.
 */
public class gcardSteps {
public static WebDriver driver;
  @BeforeClass


    @Given("^I am on gift card page$")
    public void i_am_on_gift_card_page() throws Throwable {
      System.setProperty("webdriver.chrome.driver","/Users/manzurelahi/Downloads/chromedriver");

        driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://vpc-staging-web-public.boxed.com/gift-cards");
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    }

    @When("^I tap on Gift Card drop down amount and select  amount$")
    public void i_tap_on_Gift_Card_drop_down_amount_and_select_amount() throws Throwable {
        driver.findElement(By.xpath("//*[@id='gift-card-form']/form/div[1]/div[1]/select")).click();

        Select selectList = new Select(driver.findElement(By.xpath("//*[@id='gift-card-form']/form/div[1]/div[1]/select")));
        selectList.selectByValue("25");

    }

    @When("^I select a card type$")
    public void i_select_a_card_type() throws Throwable {
        driver.findElement(By.xpath("//*[@id='gift-card-form']/form/div[1]/div[2]/div/ul/li[1]")).click();

    }

    @When("^I tap on Logn \\+Continue$")
    public void i_tap_on_Logn_Continue() throws Throwable {
        driver.findElement(By.xpath("//*[@id='gift-card-form']/form/div[2]/button")).click();

    }

    @Then("^a Sign In modal should pop up$")
    public void a_Sign_In_modal_should_pop_up() throws Throwable {
        driver.findElement(By.xpath("//*[@id='account-login']/form/span[1]/input")).clear();

    }

    @When("^I enter my valid \"([^\"]*)\" and \"([^\"]*)\" in the sign In modal$")
    public void i_enter_my_valid_and_in_the_sign_In_modal(String arg1, String arg2) throws Throwable {
        driver.findElement(By.xpath("//*[@id='account-login']/form/span[1]/input")).sendKeys("meshibli@yahoo.com");
        driver.findElement(By.xpath("//*[@id='account-login']/form/span[2]/input")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id='account-login']/form/button")).click();


    }

    @Then("^I should be landed on the Recipient Info section$")
    public void i_should_be_landed_on_the_Recipient_Info_section() throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='top-nav']/nav/div[1]/span/span[1]/span/span[1]")).isDisplayed());

    }


    @Given("^I am on the Recipient Info section$")
    public void i_am_on_the_Recipient_Info_section() throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='checkout-gift-card-recipient']/header/h2")).isDisplayed());

    }

    @When("^I enter Recipient name, email, sender's name$")
    public void i_enter_Recipient_name_email_sender_s_name() throws Throwable {
        driver.findElement(By.xpath("//*[@id='gift-card-form']/form/div[1]/div[1]/input")).sendKeys("AutomationSample");
        driver.findElement(By.xpath("//*[@id='gift-card-form']/form/div[1]/div[2]/input")).sendKeys("testm8260@gmail.com");
        driver.findElement(By.xpath("//*[@id='gift-card-form']/form/div[1]/div[4]/input")).sendKeys("ManzurAutomation");

    }

    @When("^tap on today's date$")
    public void tap_on_today_s_date() throws Throwable {
        driver.findElement(By.xpath("//*[@id='gift-card-form']/form/div[1]/div[5]/div[1]/div/input")).click();
        driver.findElement(By.xpath(".//*[@id='gift-card-form']/form/div[1]/div[5]/div[1]/div/div/div/div[2]/div[2]/div[3]/div[5]/div[6]")).click();

    }

    @When("^tap on time")
    public void tap_on_time() throws Throwable {
        driver.findElement(By.xpath("//*[@id='send-time']")).click();

        Select timeDropDown = new Select(driver.findElement(By.xpath("//*[@id='send-time']")));
        timeDropDown.selectByValue("17:00");

    }

    @When("^tap on Save\\+continue button$")
    public void tap_on_Save_continue_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id='gift-card-form']/form/div[2]/button")).click();


    }

    @Then("^I am in order review page$")
    public void i_am_in_order_review_page() throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='checkout-gift-card-confirm']/header/h2")).isDisplayed());


    }

    @Then("^I tap Place Order$")
    public void i_tap_Place_Order() throws Throwable {
        driver.findElement(By.xpath("//*[@id='gift-card-order-form']/div[3]/button")).click();

    }

    @Then("^the gift card Order will be placed$")
    public void the_gift_card_Order_will_be_placed() throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='gift-cards-confirmation']/header/h2")).isDisplayed());

    }

    @AfterClass
    public static void tearEnv(){
        driver.quit();
    }

}
