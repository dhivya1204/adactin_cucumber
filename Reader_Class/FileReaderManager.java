package com.Reader_Class;

import java.io.IOException;

public class FileReaderManager {
	private FileReaderManager() {
		//private constructor to restrict the object creation in other class
}
public static FileReaderManager getInstanceFR() {
	FileReaderManager reader = new FileReaderManager();
	return reader;
}
public Configuration_Reader getInstanceCR() throws IOException{
	Configuration_Reader helper = new Configuration_Reader();
	return helper;
	
}
}
