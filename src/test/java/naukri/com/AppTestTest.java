package naukri.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTestTest extends App {

  @Test
  public void AppTest() throws InterruptedException {
    App.runtest();
    //Assert.assertTrue(App.runtest().today_updated_message.isDisplayed(), "Profile Updated Today");
  }
}
