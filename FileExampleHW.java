import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileExampleHW {
	
	public static void main(String[] args){
		
		try{
		File f = new File("C:\\Users\\u81245\\workspace\\FileReader\\src\\pigs.txt");
		//BufferedWriter write = new BufferedWriter(new FileWriter(f));
		//write.write("Write more");
		
		//write.close();
		
	   FileReader readerBuff = new FileReader(f);
	   BufferedReader buff = new BufferedReader(readerBuff);
			String Line;
			String Output = "";
		
			while ((Line = buff.readLine()) != null) {
				 Output += Line + "\n";}
			{
				
			}
			 System.out.println(Output);
			
		}		
		catch (Exception e){
			
		}
		
	}
	}
	

