package org.cases;

import java.awt.AWTException;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.Utility.Utility;
import org.test.Listenerss;
import org.test.POMClas;
import org.test.ReadXl;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

@Listeners(Listenerss.class)
public class TC_RF_003 extends POMClas{
	
	
	
	@Test(dataProvider="details", dataProviderClass=ReadXl.class, enabled=false)
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
	 
	 jClick(p.getNewsLetter());
	 
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
	
	

	@Test(dataProvider="details", dataProviderClass=ReadXl.class, enabled=false)
	public static void registration(String FirstName, String lastName, String Telephone) throws AWTException, IOException, InterruptedException {
	
	  browserLaunch("Chrome");
	  
	  getURL("https://tutorialsninja.com/demo/");
	  
	  POMClas p = new POMClas();
	  
	  SoftAssert s = new SoftAssert();
	  
	 jClick(p.getAccount());
	 
	 jClick(p.getLogin());
	 
	 jClick(p.getRcontinue());
	 
	 jSendKeys(p.getFirstName(), FirstName);
	 
	 jSendKeys(p.getLastname(), lastName);
	 
	 
	 jSendKeys(p.getEmail(), Utility.email());
	 
	 
	 jSendKeys(p.getTelephone(), Telephone);
	 
	 jSendKeys(p.getPassword(), Utility.password());
	 
	 jSendKeys(p.getConfirm(), Utility.password());
	 
	 jClick(p.getNewsLetter());
	 
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
	
	
	@Test(enabled= false)
	private void loginTest() {
		
		browserLaunch("Chrome");
		  
		  getURL("https://tutorialsninja.com/demo/");
		  
		  POMClas p = new POMClas();
		  
		  SoftAssert s = new SoftAssert();
		  
		 jClick(p.getAccount());
		 
		 jClick(p.getRegister());
		 
		 jClick(p.getContinues());
		 
		 String text1 = "First Name must be between 1 and 32 characters!";
		 
		 String text2 = "Last Name must be between 1 and 32 characters!";
		 
		 String text3 = "E-Mail Address does not appear to be valid!";
		 
		 String text4 ="Telephone must be between 3 and 32 characters!";
		 
		 String text5 ="Password must be between 4 and 20 characters!";
		 
		 String text6 ="Warning: You must agree to the Privacy Policy!";
		 
		 
		 s.assertTrue(getText(p.getValidFirst()).contains(text1));
		 
		 s.assertTrue(getText(p.getValidLast()).contains(text2));
		 
		 s.assertTrue(getText(p.getValidEmail()).contains(text3));
		 
		 s.assertTrue(getText(p.getValidPhone()).contains(text4));
		 
		 s.assertTrue(getText(p.getValidPass()).contains(text5));
		 
		 s.assertTrue(getText(p.getValidTandC()).contains(text6));
		 
		
		 
		 s.assertAll();
	 
		 quit();
		 
		
		
	}
	
	
	@Test(dataProvider="details", dataProviderClass=ReadXl.class, enabled=false)
	public static void verifyPass(String FirstName, String lastName, String Telephone) throws AWTException, IOException, InterruptedException {
	
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
	 
	 jSendKeys(p.getConfirm(), "Arun");
	 
	 jClick(p.getNewsLetter());
	 
	 jClick(p.getTandC());
	 
	 jClick(p.getContinues());
		
     String text1 = "Password confirmation does not match password!";
 
	 s.assertTrue(getText(p.getIncorrectPass()).contains(text1));
	 

	 s.assertAll();
 
	 quit();
	 
	}
	

	@Test(dataProvider="details", dataProviderClass=ReadXl.class)
	public static void invalidEmail(String firstName, String lastName, String Telephone,String Email) throws AWTException, IOException, InterruptedException {
	
	  browserLaunch("Chrome");
	  
	  getURL("https://tutorialsninja.com/demo/");
	  
	  POMClas p = new POMClas();
	  
	  SoftAssert s = new SoftAssert();
	  
	 jClick(p.getAccount());
	 
	 jClick(p.getRegister());
	 
	 jSendKeys(p.getFirstName(), firstName);
	 
	 jSendKeys(p.getLastname(), lastName);
	 
	 
	 jSendKeys(p.getEmail(), Email);
	 
	 
	 jSendKeys(p.getTelephone(), Telephone);
	 
	 jSendKeys(p.getPassword(), Utility.password());
	 
	 jSendKeys(p.getConfirm(), Utility.password());
	 
	 jClick(p.getNewsLetter());
	 
	 jClick(p.getTandC());
	 
	 jClick(p.getContinues());
	 
	 sleep(5);
	  
	 takeScreenShots(lastName);
	 
	 if(firstName.equalsIgnoreCase("Kevin")) {
	 
	   
		 
		 String text ="E-Mail Address does not appear to be valid!";

		 s.assertTrue(getText(p.getIncorrectEmail()).contains(text));

	 }
	    
		 else {
				
			 s.assertFalse(compare("C:\\Users\\Arun\\eclipse-workspace\\TestNGGamil\\Screenshots\\"+firstName+".png", "C:\\Users\\Arun\\eclipse-workspace\\TestNGGamil\\Screenshots\\"+lastName+".png"));

		 }
	 
	 
	 
//    	System.out.println(hasDiff);
//    	
//    	s.assertTrue(hasDiff);
   
	 s.assertAll();
 
	 quit();
	 
	}
	
	   public static boolean compare(String expected, String actual ) throws IOException{
			
		  	    BufferedImage expectedImg = ImageIO.read(Utility.file(expected));
		  	 
		    	BufferedImage actualImg = ImageIO.read(Utility.file(actual));
		    			
		    	ImageDiffer differ = new ImageDiffer();
		    	
		    	ImageDiff makeDiff = differ.makeDiff(expectedImg, actualImg);
		    	
		    	boolean hasDiff = makeDiff.hasDiff();
		    	
		    	return hasDiff;
		    	
			}

}
