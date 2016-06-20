package com.inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputOutputExample5 {

	public static void main(String[] args) throws IOException {
		// Create a BufferedReader using System.in
		// Create a BufferedReader using System.in
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the name of File...");
				String fileName = br.readLine();
				String fileNameWithPath = "d:\\" + fileName+".txt";
				File file = new File(fileNameWithPath);
				if (!file.exists())
				{
					file.createNewFile();
					System.out.println("File has been created to the root directory");
				}
				else
				{
					file.delete();
					System.out.println("Existing File has been deleted from the root directory");
				}

				// Writing into the File
				FileWriter fileWriter = new FileWriter(fileNameWithPath);
				BufferedWriter out = new BufferedWriter(fileWriter);
				System.out.println("Write 'Quit' for Saving and Closing the File...");
				String fileLines;
				do
				{
					fileLines = (String)br.readLine(); // read characters
					if (!fileLines.equals("Quit")){
						out.write(fileLines+"\n");	
					}
				}
				while (!fileLines.equals("Quit"));
				out.close();

				// Reading from the File
				FileReader fileReader = new FileReader(fileNameWithPath);
				BufferedReader in = new BufferedReader(fileReader);
				while ((fileLines = in.readLine())!=null)
				{
					//fileLines = (String)in.readLine(); // read characters
					System.out.println(fileLines);
				}
				in.close();

	}

	
}
