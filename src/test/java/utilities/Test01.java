package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.junit.Test;

public class Test01 {
	@Test
	public void test01() {
		Driver.getDriver();
		ReusableMethods.wait(5);
		Driver.quitDriver();

	}

	@Before
	public void setup(){
		//AppiumServerManager.startServer("android");
	}

	/*@After(order = 1)
	public void teardown1(Scenario scenario) {
		if (scenario.isFailed()) {
			AndroidDriverManager.quitDriver();
			AppiumServerManager.stopServer();
		}
	}
	@After(order = 2)
	public void teardown() {
		AppiumServerManager.stopServer();
	}*/

	@After
	public void teardown() {
		Driver.quitDriver();
	}
}
