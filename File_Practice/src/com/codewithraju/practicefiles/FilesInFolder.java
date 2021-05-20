package com.codewithraju.practicefiles;
import java.io.File;

public class FilesInFolder {

	public static void main(String[] args) {

		File file = new File("E:\\PERSONAL\\certficates");
		String[] list = file.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
