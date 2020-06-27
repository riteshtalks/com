package naukri.com;

import java.io.IOException;
import org.testng.annotations.Test;

public class AppTestTest extends App {
	@Test
	public void AppTest() throws InterruptedException {
		try {
			App.runtest();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}