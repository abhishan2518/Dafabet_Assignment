package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;


@CucumberOptions
        (monochrome = true, strict = true, features = "classpath:features",
                glue = {"com.dafabet.automation"}, tags = {"@Test"}

)
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
