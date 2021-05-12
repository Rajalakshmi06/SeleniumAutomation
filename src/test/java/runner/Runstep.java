package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/featureLayer/CreateLeadLogin.feature" ,glue="implementationLayer", monochrome=true) 
/*plugin= {"pretty","html:target/cucumber_report.html"}*/
/*,
dryRun=true,
snippets=SnippetType.CAMELCASE*/

public class Runstep extends AbstractTestNGCucumberTests{

}
