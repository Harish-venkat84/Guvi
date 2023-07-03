package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class File_Creation {

	public static void main(String[] args) throws Exception {
		
		String filePath = System.getProperty("user.dir")+"/src/file/input.txt";
		
		File file = new File(filePath);
		
		file.createNewFile();
		
		if (file.exists()) {
			
			BufferedWriter writes = new BufferedWriter(new FileWriter(file));
			
			writes.write("A newLine() method is provided, ");

			writes.newLine();
			
			writes.write("which uses the platform's own notion of line separator as defined by the system property line.separator.");
			
			writes.newLine();
			
			writes.write("Not all platforms use the newline character ('\\n') to terminate lines.");
			
			writes.newLine();
			
			writes.write("Calling this method to terminate each output line is therefore preferred to writing a newline character directly.");
			
			writes.close();
			
			Scanner scan = new Scanner(file);
			
			while (scan.hasNext()) {
				
				System.out.println(scan.nextLine());
			}

			scan.close();

			file.delete();
		}
		
	}

}
