import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

/**
 * Created by hp on 5/18/2018.
 */
public class FacebookNotifications {

    static String url = "https://www.facebook.com/";

    //Enter email or number here
    static String email = "";

    //Enter password here
    static String password = "";

    public FacebookNotifications() {

        getCredentials();

        WebDriver wd = new ChromeDriver();
        wd.get(url);
        WebElement emailElement = wd.findElement(By.id("email"));
        emailElement.sendKeys(email);
        WebElement pass = wd.findElement(By.id("pass"));
        pass.sendKeys(password);
        WebElement login = wd.findElement(By.id("loginbutton"));
        login.click();
        System.out.println("You have " + wd.findElement(By.id("notificationsCountValue")).getText() + " new notifications.");
        wd.close();
    }

    public void getCredentials() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        email = scanner.nextLine();
        System.out.print("Enter your password: ");
        password = scanner.nextLine();

    }

}
