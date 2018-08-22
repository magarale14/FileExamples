import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

/* 
 * FileReader - reads character stream
 * BufferReader - Need to know what buffer means
 * Scanner - Reads line by line
 */
public class FileExample{
	
	public static void main(String[] args)throws IOException {
		
		File f = new File("C:\\Users\\u81245\\workspace\\FileReader\\src\\pigs.txt");
		FileReader reader = new FileReader(f);// haven't ask to read f yet,it says that file f is there and have to read it
		int read;
		//FileReader is usually useful when you have to read the file character by character
		int counter = 0;
		//reader.read();// returns -1 
		while((read = reader.read())!= -1){
			
			if(read == 'h'){
				counter++;
						}
//			//System.out.println((char)read); // read char 
		
				}	
		reader.close();
		//System.out.println("This character 'h' has occured " + counter); //filereader
		
		FileReader readerBuff = new FileReader(f);
		BufferedReader buff = new BufferedReader(readerBuff);
		String line;
		counter = 0;
//	    //int countLine = 0;
//		while((line = buff.readLine())!= null){
//			System.out.println(++counter + " : " + line);
//		}
		
		buff.close();
		//Reading a file using Scanner
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
			
		}
		sc.close();
	}
	}



