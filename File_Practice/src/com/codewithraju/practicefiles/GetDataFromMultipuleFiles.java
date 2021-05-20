package com.codewithraju.practicefiles;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GetDataFromMultipuleFiles {

	public ArrayList<String> getData(String[] files) {
		ArrayList<String> list = new ArrayList<String>();
		try {
			for (int i = 0; i < files.length; i++) {
				FileReader fr = new FileReader(files[i]);
				BufferedReader br = new BufferedReader(fr);
				String readLine = br.readLine();
				while (readLine != null) {
					String[] split = readLine.split(",");
					list.add(split[1]);
					readLine = br.readLine();
				}
				br.close();
				fr.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
