import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class demo_platform {
    // declaration and instantiation of objects/variables
    public WebDriver driver;

    @Test
    public void test(){

//        Options A
//        String pathDriver = System.getProperty("user.dir") + "\\drivers\\geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver", pathDriver );
//        driver = new FirefoxDriver();

//      Options B
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();


        driver.manage().window().maximize();

        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();


         //* compare the actual title of the page with the expected one and print
         //* the result as "Passed" or "Failed"

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //close Fire fox
        driver.close();

    }

}
