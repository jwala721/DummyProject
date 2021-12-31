package com.crm.autodesk.contactTest;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups ="smokeTest")
	
	public void createContactTest() {
		System.out.println("create contact");
	
	}
	@Test(groups ="smokeTest")
	public void updateContactTest() {
		System.out.println("contact updated");
	}

}
