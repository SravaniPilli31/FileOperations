import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileImport {
	
	public static void main(String[] args) throws IOException {
			//open the file
			FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis);
			BufferedReader br = new BufferedReader(new InputStreamReader(dis));
			String str;
			//read the file
			while((str=br.readLine())!=null) {
				//print the file
				System.out.println(str);
			}
			//close the file
			dis.close();	
	}
}
