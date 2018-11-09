package userBooking;

import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.HotelBookingPageFactory;

public class StepDefsBooking {

	private WebDriver driver;
	private HotelBookingPageFactory hbpf;
	 
	@Given("^User is on hotel booking page$")
	public void user_is_on_hotel_booking_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		hbpf=new HotelBookingPageFactory(driver);
		driver.get("file:///D:/Softwares/hotelBooking/hotelbooking.html");
	
	}

	@When("^user enters all valid details$")
	public void user_enters_all_valid_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Rishabh");Thread.sleep(2000);
		hbpf.setPflname("Sinha");Thread.sleep(2000);
		hbpf.setPfemail("rishabh.sinha@capgemini.com");Thread.sleep(2000);
		hbpf.setPfphone("9910309269");Thread.sleep(2000);
		hbpf.setPfcity("Pune");Thread.sleep(2000);
		hbpf.setPfstate("Maharashtra");Thread.sleep(2000);
		hbpf.setPfguests("2");Thread.sleep(2000);
		hbpf.setPfcardholdername("Rishabh");Thread.sleep(2000);
		hbpf.setPfdebitnumber("8956741200034576");Thread.sleep(2000);
		hbpf.setPfcvv("847");Thread.sleep(2000);
		hbpf.setPfmonth("12");Thread.sleep(2000);
		hbpf.setPfyear("2021");Thread.sleep(2000);
		hbpf.setPfsubmit();	}

	@Then("^navigate to welcome page$")
	public void navigate_to_welcome_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("file:///D:/Softwares/hotelBooking/success.html");
		Thread.sleep(2000);
	}

	@When("^user leaves first name blank$")
	public void user_leaves_first_name_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}

	@Then("^display alert message$")
	public void display_alert_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String str=driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept();
	}

	@When("^user leaves last name blank$")
	public void user_leaves_last_name_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Rishabh");Thread.sleep(1000);
		hbpf.setPflname("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}

	@When("^user enters all data$")
	public void user_enters_all_data() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user enters wrong email and click button$")
	public void user_enters_wrong_email_and_click_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Rishabh");Thread.sleep(1000);
		hbpf.setPflname("Sinha");Thread.sleep(1000);
		hbpf.setPfemail("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}

	@When("^user leaves mobile number empty$")
	public void user_leaves_mobile_number_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Rishabh");Thread.sleep(1000);
		hbpf.setPflname("Sinha");Thread.sleep(1000);
		hbpf.setPfemail("sinharishabh140796@gmail.com");Thread.sleep(1000);
		hbpf.setPfphone("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}

	@When("^user enters incoorect mobile format$")
	public void user_enters_incoorect_mobile_format(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		hbpf.setPffname("Rishabh");Thread.sleep(1000);
		hbpf.setPflname("Sinha");Thread.sleep(1000);
		hbpf.setPfemail("sinharishabh140796@gmail.com");Thread.sleep(1000);
		List<String> list=arg1.asList(String.class);Thread.sleep(1000);
		hbpf.setPfsubmit();
		for(int i=0;i<list.size();i++) {
			if(Pattern.matches("", list.get(i))) {
				System.out.println("matched" +list.get(i) );
			}
			else {
				System.out.println("not matched" +list.get(i));
			}
		}
	}

	@Then("^display the alert message$")
	public void display_the_alert_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String str=driver.switchTo().alert().getText();
		System.out.println(str);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^user leaves the city name blank$")
	public void user_leaves_the_city_name_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Rishabh");Thread.sleep(1000);
		hbpf.setPflname("Sinha");Thread.sleep(1000);
		hbpf.setPfemail("sinharishabh140796@capgemini.com");Thread.sleep(1000);
		hbpf.setPfphone("9910309269");Thread.sleep(1000);
	//	hbpf.setPfguests("2");Thread.sleep(2000);
		hbpf.setPfcity("");Thread.sleep(1000);
	
		hbpf.setPfsubmit();
	}

	@When("^user leaves the state name blank$")
	public void user_leaves_the_state_name_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Rishabh");Thread.sleep(1000);
		hbpf.setPflname("Sinha");Thread.sleep(1000);
		hbpf.setPfemail("sinharishabh140796@gmail.com");Thread.sleep(1000);
		hbpf.setPfphone("9910309269");Thread.sleep(1000);
		hbpf.setPfcity("Pune");Thread.sleep(1000);
		hbpf.setPfstate("");Thread.sleep(1000);
		//hbpf.setPfguests("2");Thread.sleep(2000);
		hbpf.setPfsubmit();
	}

	@When("^user leaves card holder name empty$")
	public void user_leaves_card_holder_name_empty() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Rishabh");Thread.sleep(1000);
		hbpf.setPflname("Sinha");Thread.sleep(1000);
		hbpf.setPfemail("sinharishabh140796@gmail.com");Thread.sleep(1000);
		hbpf.setPfphone("9910309269");Thread.sleep(1000);
		hbpf.setPfcity("Pune");Thread.sleep(2000);
		hbpf.setPfstate("Maharashtra");Thread.sleep(2000);
		hbpf.setPfcardholdername("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}

	@When("^user leaves the debit card number blank$")
	public void user_leaves_the_debit_card_number_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Rishabh");Thread.sleep(1000);
		hbpf.setPflname("Sinha");Thread.sleep(1000);
		hbpf.setPfemail("sinharishabh140796@gmail.com");Thread.sleep(1000);
		hbpf.setPfphone("9910309269");Thread.sleep(1000);
		hbpf.setPfcity("Pune");Thread.sleep(2000);
		hbpf.setPfstate("Maharashtra");Thread.sleep(2000);
		hbpf.setPfcardholdername("Rishabh");Thread.sleep(1000);
		hbpf.setPfdebitnumber("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}

	@When("^user leaves the cvv blank$")
	public void user_leaves_the_cvv_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Rishabh");Thread.sleep(1000);
		hbpf.setPflname("Sinha");Thread.sleep(1000);
		hbpf.setPfemail("sinharishabh140796@gmail.com");Thread.sleep(1000);
		hbpf.setPfphone("9910309269");Thread.sleep(1000);
		hbpf.setPfcity("Pune");Thread.sleep(2000);
		hbpf.setPfstate("Maharashtra");Thread.sleep(2000);
		hbpf.setPfcardholdername("Rishabh");Thread.sleep(1000);
		hbpf.setPfdebitnumber("8956741200034576");Thread.sleep(1000);
		hbpf.setPfcvv("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}

	@When("^user leaves the card expiration month blank$")
	public void user_leaves_the_card_expiration_month_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Rishabh");Thread.sleep(1000);
		hbpf.setPflname("Sinha");Thread.sleep(1000);
		hbpf.setPfemail("sinharishabh140796@gmail.com");Thread.sleep(1000);
		hbpf.setPfphone("9910309269");Thread.sleep(1000);
		hbpf.setPfcity("Pune");Thread.sleep(2000);
		hbpf.setPfstate("Maharashtra");Thread.sleep(2000);
		hbpf.setPfcardholdername("Rishabh");Thread.sleep(1000);
		hbpf.setPfdebitnumber("8956741200034576");Thread.sleep(1000);
		hbpf.setPfcvv("847");Thread.sleep(1000);
		hbpf.setPfmonth("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}

	@When("^user leaves the card expiration year blank$")
	public void user_leaves_the_card_expiration_year_blank() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Rishabh");Thread.sleep(1000);
		hbpf.setPflname("Sinha");Thread.sleep(1000);
		hbpf.setPfemail("sinharishabh140796@gmail.com");Thread.sleep(1000);
		hbpf.setPfphone("9910309269");Thread.sleep(1000);
		hbpf.setPfcity("Pune");Thread.sleep(2000);
		hbpf.setPfstate("Maharashtra");Thread.sleep(2000);
		hbpf.setPfcardholdername("Rishabh");Thread.sleep(1000);
		hbpf.setPfdebitnumber("8956741200034576");Thread.sleep(1000);
		hbpf.setPfcvv("847");Thread.sleep(1000);
		hbpf.setPfmonth("12");Thread.sleep(1000);
		hbpf.setPfyear("");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}

	@When("^user clicks on the navigation button$")
	public void user_clicks_on_the_navigation_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		hbpf.setPffname("Rishabh");Thread.sleep(1000);
		hbpf.setPflname("Sinha");Thread.sleep(1000);
		hbpf.setPfemail("sinharishabh140796@gmail.com");Thread.sleep(1000);
		hbpf.setPfphone("9910309269");Thread.sleep(1000);
		hbpf.setPfcity("Pune");Thread.sleep(2000);
		hbpf.setPfstate("Maharashtra");Thread.sleep(2000);
		hbpf.setPfcardholdername("Rishabh");Thread.sleep(1000);
		hbpf.setPfdebitnumber("8956741200034576");Thread.sleep(1000);
		hbpf.setPfcvv("847");Thread.sleep(1000);
		hbpf.setPfmonth("12");Thread.sleep(1000);
		hbpf.setPfyear("2021");Thread.sleep(1000);
		hbpf.setPfsubmit();
	}

	@Then("^redirects to the success page$")
	public void redirects_to_the_success_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.navigate().to("file:///D:/Softwares/hotelBooking/success.html");
		Thread.sleep(2000);
	}


}