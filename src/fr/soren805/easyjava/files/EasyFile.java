package fr.soren805.easyjava.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

public class EasyFile {
	
	public void createFile(String fileDirectory) {
		File f = new File(fileDirectory);
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void createFolder(String folderDirectory) {
		File f = new File(folderDirectory);
		if(!f.exists()) {
			f.mkdir();
		}
	}
	
	public void writeInfoFile(String fileDirectory, String firstLine, String secondLine, String thirdLine) {
		File f = new File(fileDirectory);
		if(!f.exists()) {
			try {
				FileWriter writer = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(writer);
				
				bw.write(firstLine);
				bw.write(secondLine);
				bw.write(thirdLine);
				
				bw.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void copyFile(String fileToCopy, String toFolder) {
		File source = new File(fileToCopy);
		File dest = new File(toFolder + "/" + source.getName());
		
		try {
			Files.copy(source.toPath(), dest.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteFile(String fileToDelete) {
		File source = new File(fileToDelete);
		
		try {
			Files.delete(source.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void copyFileAndReplaceExisting(String fileToCopy, String toFolder) {
		File source = new File(fileToCopy);
		File dest = new File(toFolder + "/" + source.getName());
		
		try {
			Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void makeBasicHTMLFile(String fileDirectory) {
		File f = new File(fileDirectory);
		if(!f.exists()) {
			List<String> lines = Arrays.asList("<!DOCTYPE html>","<html>","<head>","<title>Simple Title</title>","<meta charset='utf-8'>","</head>","<body>","<h1>Simple Page Title</h1>","<p>Simple Text</p>","</body>","</html>");

			try {
				FileWriter writer = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(writer);
				
				for(String line : lines) {
					bw.write(line);
					bw.newLine();
				}
				
				bw.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
