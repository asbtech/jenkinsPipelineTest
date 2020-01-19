package tests;

import org.testng.annotations.Test;

import pages.Google;

public class GoogleTest {

	@Test
	public void googleSearch()
	{
		Google.search();
	}
	
}
