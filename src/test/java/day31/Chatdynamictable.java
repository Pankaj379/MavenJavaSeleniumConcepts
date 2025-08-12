package day31;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chatdynamictable {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Count total pages from pagination
        int totalPages = driver.findElements(By.xpath("//ul[@class='pagination']//li")).size();
        System.out.println("Total pages: " + totalPages);

        // Loop through all pages
        for (int p = 1; p <= totalPages; p++) {
            if (p > 1) { // Click next page if not on first page
                WebElement pageLink = driver.findElement(By.xpath("//ul[@class='pagination']//li[" + p + "]"));
                pageLink.click();
                Thread.sleep(2000); // wait for table to load
            }

            // Find total rows (excluding header)
            int rowCount = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();

            // Loop through each row
            for (int r = 1; r <= rowCount; r++) {
                String id = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[1]")).getText();
                String name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[2]")).getText();
                String price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[3]")).getText();
               // String select = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[4]")).getText();
                System.out.println(id + "\t" + name + "\t" + price);
            }
        }

        driver.quit();
    }
}
