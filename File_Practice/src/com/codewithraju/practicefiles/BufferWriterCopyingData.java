package com.codewithraju.practicefiles;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferWriterCopyingData {
	
	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("E:\\RAJU\\TEST\\a.txt");
		FileWriter fw = new FileWriter("E:\\RAJU\\TEST\\b.txt",true);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String readLine = br.readLine();
		while(readLine !=null) {
			bw.write(readLine);
			bw.newLine();
			readLine = br.readLine();
		}
		bw.close();
		br.close();
		fw.close();
		fr.close();
		System.out.println("coming");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
