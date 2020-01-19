package tests;

import org.testng.annotations.Test;

import pages.Facebook;

public class FacebookTest {
	
	@Test
	public void facebookTest() {
		Facebook.loadLoaginPage();
	}

}
