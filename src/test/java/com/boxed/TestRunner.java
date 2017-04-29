package com.boxed;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by manzurelahi on 4/23/17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@Smoke"},
        format = {"pretty","html:target/html-report"},
        features = {"src/test/java/resources/giftcard.feature"},
        glue = {"stepDefs"}

                )
public class TestRunner {

}
