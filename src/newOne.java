package com.example.tests;

import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;
import static org.apache.commons.lang3.StringUtils.join;

public class newOne {
    private Selenium selenium;
    // This is a test comment. I'm practicing with Git!
	// yahoo
	// hwqgkweulgluweluhdwvhivd.vjhdvsb

    //THIS IS A NEW LINE. I'M NOT SHOUTING

    @Before
    public void setUp() throws Exception {
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://www.google.co.uk/";
        selenium = new WebDriverBackedSelenium(driver, baseUrl);
    }

    @Test
    public void testFirst_IDE_() throws Exception {
        selenium.open("/?gws_rd=ssl");
        selenium.click("link=×");
        selenium.type("id=lst-ib", "opobo");
        selenium.type("id=lst-ib", "opodo");
        selenium.click("link=Bosssok cheap holidays: flights, hotels and car hire - Opodo");
        selenium.click("//div[@id='flights-manager']/div[2]/div/ul/li");
        selenium.click("//div[@id='flights-manager']/div[2]/div/ul/li[2]/span[2]");
        selenium.click("css=button.od-cookiedsc-btn.accept_button");
        selenium.click("//div[@id='flights-manager']/div[2]/div/ul/li[3]/span[2]");
        selenium.click("//div[@id='flights-manager']/div[2]/div/ul/li[2]/span[2]");
        selenium.click("css=span.od-flightsManager-services-text");
        selenium.type("css=input.airportselector_input", "london");
        selenium.type("xpath=(//input[@value=''])[2]", "Lagos");
        selenium.click("//div[@id='destination-autocomplete0']/div[2]/div[3]/div[2]/div/div/ul/li/div[2]/span");
        selenium.click("css=div.od-ui-calendar-day.today");
        selenium.click("//div[@id='flights-manager']/div[2]/div[2]/div/div[3]/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]/div[4]/div[6]");
        selenium.click("css=span.od-flightsManager-services-text > a");
        selenium.waitForPageToLoad("30000");
        selenium.type("id=ss", "lagos");
        selenium.click("//button[@type='submit']");
        selenium.waitForPageToLoad("30000");
        selenium.click("css=span.b-button__text");
        selenium.click("css=span.b-button__text");
        selenium.click("css=span.b-button__text");
        assertEquals("Enter your check-in and check-out dates in the search box on the left to see the exact room prices for your stay and to be able to sort by price.", selenium.getAlert());
    }
//aDDED tHIS oN tHE rEPO
    @After
    public void tearDown() throws Exception {
        selenium.stop();
    }
}
