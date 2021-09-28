package alarm.alarm1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import alarm.alarm1.App;

public class AppTest extends App{
	App almclk;
	   
	   @BeforeMethod
	   public void setup() throws Exception
	   {
		   App.initialization();
	   
	   }
		  @Test
			public void add() throws Exception
			{ 
			  App.Addalarm();
			  
			}
		  
		  @Test
			public void add1() throws Exception
			{ 
			  App.Addalarm1();
			  
			}
		
			@AfterMethod
			public void teardown()
			{
				AlarmClockSession.quit();
				
			} 

}
