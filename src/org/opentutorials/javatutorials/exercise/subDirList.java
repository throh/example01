package org.opentutorials.javatutorials.exercise;

import java.io.File;
import java.io.IOException;

public class subDirList {

	public static void getFileList(String path) {
		
		File dir = new File(path);
		File[] fileList = dir.listFiles();

		for (int i = 0; i < fileList.length; i++) {
			File file = fileList[i];
			if (file.isFile()) {
				System.out.println("\t 파일이름 = " + file.getName());
			}
		}
	}

	public static void main(String[] args) {
		//File dir = new File("c:\\");
		//File[] fileList = dir.listFiles();

		//for (int i = 0; i < fileList.length; i++) {
		//	File file = fileList[i];
		//	if (file.isFile()) {
		//		System.out.println("\t 파일이름 = " + file.getName());
		//	}
		//}
		String path  = "C:\\" ;
		System.out.println("*** " +path + " result");
		getFileList(path);
		

	}
}
