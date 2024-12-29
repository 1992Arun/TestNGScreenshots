package org.cases;

import java.awt.AWTException;
import java.io.IOException;

import org.Utility.Utility;
import org.test.Listenerss;
import org.test.POMClas;
import org.test.ReadXl;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(Listenerss.class)
public class TestCases extends POMClas {
	
	
	
	
	
	
	
	@Test(dataProvider="details", dataProviderClass=ReadXl.class)
	public static void test1(String FirstName, String lastName, String Telephone) throws AWTException, IOException, InterruptedException {
	
	  browserLaunch("Chrome");
	  
	  getURL("https://tutorialsninja.com/demo/");
	  
	  POMClas p = new POMClas();
	  
	  SoftAssert s = new SoftAssert();
	  
	 jClick(p.getAccount());
	 
	 jClick(p.getRegister());
	 
	 jSendKeys(p.getFirstName(), FirstName);
	 
	 jSendKeys(p.getLastname(), lastName);
	 
	 
	 jSendKeys(p.getEmail(), Utility.email());
	 
	 
	 jSendKeys(p.getTelephone(), Telephone);
	 
	 jSendKeys(p.getPassword(), Utility.password());
	 
	 jSendKeys(p.getConfirm(), Utility.password());
	 
	 jClick(p.getTandC());
	 
	 
	 jClick(p.getContinues());
	 
	 sleep(2);
	 
	 getText(p.getText());
	
	 s.assertTrue(p.getLogout().isDisplayed());
	 
	 String text1 = "Congratulations! Your new account has been successfully created!";
	 
	 String text2 = "You can now take advantage of member privileges to enhance your online shopping experience with us.";
	 
	 String text3 = "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
	 
	 String text4 ="A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.";
	
	 s.assertTrue(getText(p.getText()).contains(text1));
	 
	 s.assertTrue(getText(p.getText()).contains(text2));
	 
	 s.assertTrue(getText(p.getText()).contains(text3));
	 
	 s.assertTrue(getText(p.getText()).contains(text4));
	 
	 jClick(p.getaContinue());
	 
	 s.assertTrue(getText(p.getMyAccount()).contains("My Account"));
	 
	 s.assertAll();
 
	 quit();
	 
	
	}

}
