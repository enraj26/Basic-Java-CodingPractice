package com.codewithraju.practicefiles;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BUfferWriter {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fr = new FileWriter("E:\\RAJU\\TEST\\a.txt",true);
			BufferedWriter br = new BufferedWriter(fr);
			br.newLine();
			br.write("Hello Hiii");
			br.close();
			fr.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
