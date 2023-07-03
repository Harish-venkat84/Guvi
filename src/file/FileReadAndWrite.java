package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadAndWrite {
	
	public FileReadAndWrite() throws IOException {
		
		String filePath = System.getProperty("user.dir")+"/src/file/input.txt";
		
		File file = new File(filePath);
		
		file.createNewFile();
		
		if (file.exists()) {
			
			FileWriter wr = new FileWriter(file);
			
			wr.write("1  "+filePath);
			
			BufferedWriter buf = new BufferedWriter(wr);
			
			buf.write('\n');
			
			buf.write("\n2  "+filePath);
			
			buf.close();
			
			wr.close();
		}
		
		Scanner scan = new Scanner(file);
		
		while (scan.hasNext()) {
			
			System.out.println(scan.nextLine());
		}
		
		scan.close();
		
//		BufferedReader read = new BufferedReader(new FileReader(file));
//		
//		String str;
//		
//		while ((str = read.readLine()) != null) {
//
//			System.out.println(str);
//		}
//		
//		read.close();
		
		if (file.exists()) {
			
			file.delete();
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		FileReadAndWrite obj = new FileReadAndWrite();
		
	}

}
