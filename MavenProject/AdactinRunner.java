package com.MavenProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class AdactinRunner extends Base_Class {
	public static void main(String[] args) {
		browserlaunch("chrome");
		get("https://adactinhotelapp.com/");
		Impwait(20);
		WebElement user = driver.findElement(By.name("username"));
		sendkeys(user, "Dhivya1204");
		WebElement pass = driver.findElement(By.name("password"));
		sendkeys(pass, "Dhivya@121");
		WebElement login = driver.findElement(By.name("login"));
		click(login);
		WebElement location = driver.findElement(By.name("location"));
		single_dropdown(location, "Melbourne", "value");
		WebElement hotels = driver.findElement(By.name("hotels"));
		single_dropdown(hotels, "Hotel Creek", "value");
		WebElement roomtype = driver.findElement(By.name("room_type"));
		single_dropdown(roomtype, "Standard", "value");
		WebElement roomnos = driver.findElement(By.name("room_nos"));
		single_dropdown(roomnos, "1", "value");	
		WebElement adultroom = driver.findElement(By.name("adult_room"));
		single_dropdown(adultroom, "1", "value");
		WebElement childroom = driver.findElement(By.name("child_room"));
		single_dropdown(childroom, "1", "value");
		WebElement search = driver.findElement(By.name("Submit"));
		click(search);
		
		WebElement radio = driver.findElement(By.name("radiobutton_0"));
		click(radio);
		WebElement continue1 = driver.findElement(By.name("continue"));
		click(continue1);
		
		WebElement firstname = driver.findElement(By.name("first_name"));
		sendkeys(firstname, "Dhivya");
		WebElement lastname = driver.findElement(By.name("last_name"));
		sendkeys(lastname, "Kumar");
		WebElement billingaddress = driver.findElement(By.name("address"));
		sendkeys(billingaddress, "Melbourne");
		WebElement creditcard = driver.findElement(By.name("cc_num"));
		sendkeys(creditcard, "1234567890123456");
		WebElement cardtype = driver.findElement(By.name("cc_type"));
		single_dropdown(cardtype, "AMEX", "value");
		WebElement expirymonth = driver.findElement(By.name("cc_exp_month"));
		single_dropdown(expirymonth, "1", "value");
		WebElement expiryyear = driver.findElement(By.name("cc_exp_year"));
		single_dropdown(expiryyear, "2022", "value");
		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		sendkeys(cvv, "1234");
		WebElement booknow = driver.findElement(By.name("book_now"));
		click(booknow);
		
		WebElement myiter = driver.findElement(By.name("my_itinerary"));
		click(myiter);
		
		WebElement logout = driver.findElement(By.name("logout"));
		click(logout);
}
}
