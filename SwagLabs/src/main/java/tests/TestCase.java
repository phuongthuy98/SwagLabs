package tests;

import common.Configuration;
import org.testng.annotations.BeforeMethod;

import common.TestBase;
import org.testng.annotations.Parameters;

public class TestCase {
	public TestBase testBase = new TestBase();
	public static Configuration config = new Configuration(
			System.getProperty("user.dir")+ "/config/" + "config.properties");

	@Parameters({"browser"})
	@BeforeMethod
	public void openBrowser(String browser) {
		String url = config.getConfigValueByKey("URL");
		testBase.openSingerBrowser(url, browser);
	}

}
