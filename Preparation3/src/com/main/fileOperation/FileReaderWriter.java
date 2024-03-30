package com.main.fileOperation;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\Admin\\Desktop\\FileReadWriteOperation.txt");
		fw.write("my name is mayur \n and my village name is gondikuppi \n tal chikodi dist belgaum \n state karnataka");;
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader("C:\\Users\\Admin\\Desktop\\FileRead WriteOperation.txt");
		Scanner sc = new Scanner (fr);
		while(sc.hasNext()) {
		System.out.println(sc.nextLine());
			
		}
		fr.close();
	}

}
