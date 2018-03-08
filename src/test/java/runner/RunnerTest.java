package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Subrahmanyam on 1/Nov/2017
 */

/*Un-comment the format if you are running the Runner through surefire plugin*/
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/", //You can use src/test/resources/features
                 //format = {"pretty", "html:target/cucumber" },
                 glue = {"steps","hooks"})
public class RunnerTest {

}
