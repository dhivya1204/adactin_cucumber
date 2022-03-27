package com.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Runner_Class extends Base_Class {
	public static void main(String[] args) {
		
		
			browserlaunch("chrome");
			get("https://www.facebook.com/");
			WebElement email = driver.findElement(By.name("email"));
			sendkeys(email, "Dhivya1204");
			WebElement password = driver.findElement(By.name("pass"));
			sendkeys(password, "Dhivya@121");
			WebElement login = driver.findElement(By.name("login"));
			click(login);
		}
		

		
	}


