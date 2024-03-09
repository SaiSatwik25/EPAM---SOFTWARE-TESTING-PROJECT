import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class SigninAutomation{
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
      //it is a new file to compare witrh older version
        driver.get("https://www.hackerrank.com/auth/login");
        driver.findElement(By.id("username")).sendKeys("2100031619@kluniversity.in");
        driver.findElement(By.id("password")).sendKeys("kavya8834");
        driver.findElement(By.id("loginbtn")).submit();
        driver.quit();
    }
}
