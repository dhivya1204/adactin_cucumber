package com.AdactinPoManager_Runner;
import org.openqa.selenium.WebDriver;
import com.MavenProject.Base_Class;
import com.PoManagerBase.Adactin_PoManager_Base;
public class Adactin_PomManager_Runner extends Base_Class {
	public static WebDriver driver;
	public static void main(String[] args) {
	driver=browserlaunch("chrome");
	get("https://adactinhotelapp.com/");
	Adactin_PoManager_Base pom = new Adactin_PoManager_Base(driver);//page obj manager
	sendkeys(pom.getInstancePomlogin().getUser(),"Dhivya1204");
	sendkeys(pom.getInstancePomlogin().getPass(),"8F7CXD");
	click(pom.getInstancePomlogin().getLoginbtn());//loginpage
	single_dropdown(pom.getInstancePomsearch().getLoc(), "Sydney", "value");
	single_dropdown(pom.getInstancePomsearch().getHotels(), "Hotel Creek", "value");
	single_dropdown(pom.getInstancePomsearch().getRoomtype(), "Standard", "value");
	single_dropdown(pom.getInstancePomsearch().getRoomnos(), "1", "value");
	single_dropdown(pom.getInstancePomsearch().getAdultroom(), "1", "value");
	single_dropdown(pom.getInstancePomsearch().getChildroom(), "1", "value");
	click(pom.getInstancePomsearch().getSubmit());//searchpage
	click(pom.getInstancePomcontinue().getRadio());
	click(pom.getInstancePomcontinue().getContinu());//continue page
	sendkeys(pom.getInstancePombooknow().getFirstname(),"Dhivya");
	sendkeys(pom.getInstancePombooknow().getLastname(),"Kumar");
	sendkeys(pom.getInstancePombooknow().getAddr(),"Melbourne");
	sendkeys(pom.getInstancePombooknow().getCcnum(),"1234567890123456");
	single_dropdown(pom.getInstancePombooknow().getCctype(), "AMEX", "value");
	single_dropdown(pom.getInstancePombooknow().getExpmonth(), "1", "value");
	single_dropdown(pom.getInstancePombooknow().getExpyear(), "2022", "value");
	sendkeys(pom.getInstancePombooknow().getCvv(),"1234");
	click(pom.getInstancePombooknow().getBooknow());//booknow
	Impwait(30);
	click(pom.getInstancePommyiter().getMyiter());//myiternary
	click(pom.getInstancePomlogout().getLogout());//logout
}
}
