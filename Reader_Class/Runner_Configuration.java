package com.Reader_Class;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.MavenProject.Base_Class;
import com.PoManagerBase.Adactin_PoManager_Base;

public class Runner_Configuration extends Base_Class {
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		driver=browserlaunch("chrome");
		get(FileReaderManager.getInstanceFR().getInstanceCR().getUrl());
		Adactin_PoManager_Base pom = new Adactin_PoManager_Base(driver);
		sendkeys(pom.getInstancePomlogin().getUser(),FileReaderManager.getInstanceFR().getInstanceCR().getUsername());
		sendkeys(pom.getInstancePomlogin().getPass(),FileReaderManager.getInstanceFR().getInstanceCR().getPassword());
		click(pom.getInstancePomlogin().getLoginbtn());
		single_dropdown(pom.getInstancePomsearch().getLoc(), "Sydney","value");
		single_dropdown(pom.getInstancePomsearch().getHotels(), "Hotel Creek","value");
		single_dropdown(pom.getInstancePomsearch().getRoomtype(), "Deluxe","value");
		single_dropdown(pom.getInstancePomsearch().getRoomnos(), "1","value");
		single_dropdown(pom.getInstancePomsearch().getAdultroom(), "1","value");
		single_dropdown(pom.getInstancePomsearch().getChildroom(), "1","value");
		click(pom.getInstancePomsearch().getSubmit());
		click(pom.getInstancePomcontinue().getRadio());
		click(pom.getInstancePomcontinue().getContinu());
		sendkeys(pom.getInstancePombooknow().getFirstname(),FileReaderManager.getInstanceFR().getInstanceCR().getFirstname());
		sendkeys(pom.getInstancePombooknow().getLastname(),FileReaderManager.getInstanceFR().getInstanceCR().getLastname());
		sendkeys(pom.getInstancePombooknow().getAddr(),FileReaderManager.getInstanceFR().getInstanceCR().getAddress());
		sendkeys(pom.getInstancePombooknow().getCcnum(),FileReaderManager.getInstanceFR().getInstanceCR().getCCardno());
		single_dropdown(pom.getInstancePombooknow().getCctype(),"AMEX" , "value");
		single_dropdown(pom.getInstancePombooknow().getExpmonth(),"1" , "value");
		single_dropdown(pom.getInstancePombooknow().getExpyear(),"2022" , "value");
		sendkeys(pom.getInstancePombooknow().getCvv(),FileReaderManager.getInstanceFR().getInstanceCR().getCvv());
		click(pom.getInstancePombooknow().getBooknow());
		Impwait(30);
		click(pom.getInstancePommyiter().getMyiter());
		click(pom.getInstancePomlogout().getLogout());	

		}
}
