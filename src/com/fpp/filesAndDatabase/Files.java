package com.fpp.filesAndDatabase;

import java.io.File;
import java.io.FileWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Files {
	public static void main(String[] args) {
		try {
			String str = readFromFile();
			
			try {
				writeFileContents(str);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		} catch (Exception e) {
//			System.out.println(e.getMessage());
		}
	}

	private static String readFromFile() throws NoSuchElementException{

		File f = new File("filesAndDatabase.txt");// file location has been set to just outside of bin directory

		try {
			Scanner s = new Scanner(f);
			String word = null;
			StringBuffer strBfr = new StringBuffer();
			try {
				while ((word = s.next()) != null) {
					//System.out.println(word);
					strBfr.append(word+" ");
				}
			}
			catch (NoSuchElementException e) {
				s.close();
				return strBfr.toString();
//			throw new NoSuchElementException(e.getMessage());
			}
			
		} catch (Exception e) {
			
			throw new NoSuchElementException(e.getMessage());
		}
		return null;
	}
	private static void writeFileContents(String str) throws NoSuchElementException {

        try {
        	FileWriter fileWriter = new FileWriter("MyCopy.txt");
        	
            fileWriter.write(str);
            fileWriter.close();
            
        }catch (Exception e) {
			// TODO: handle exception
        	throw new NoSuchElementException(e.getMessage());
		}
    }

}
