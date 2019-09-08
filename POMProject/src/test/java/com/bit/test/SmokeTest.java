package com.bit.test;

import org.junit.Test;
  
import pages.HomePage;

public class SmokeTest extends BaseTest {
	
	HomePage homepage;
	@Test
	public void buyJeansPants() {
		homepage =new HomePage(driver); 
		homepage.hoverOverOnBackTOScholl();
		
	}

}
