package com.Reader_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
public Configuration_Reader() throws IOException {
	File f = new File("C:\\Users\\srk\\eclipse-workspace\\MavenProject\\src\\test\\java\\com\\Reader_Class\\Configurationproperties");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	p.load(fis);
}

public String getUrl() {
	String url = p.getProperty("url");
	return url;
}
public String getUsername() {
	String username = p.getProperty("username");
	return username;
}
public String getPassword() {
	String password = p.getProperty("password");
	return password;
}
public String getFirstname() {
	String fname = p.getProperty("fname");
	return fname;
}
public String getLastname() {
	String lname = p.getProperty("lname");
	return lname;
}
public String getAddress() {
	String addr = p.getProperty("addr");
	return addr;
}
public String getCCardno() {
	String ccno = p.getProperty("ccno");
	return ccno;
}
public String getCvv() {
	String cvv = p.getProperty("cvv");
	return cvv;
}
}