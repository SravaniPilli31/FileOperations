import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FindingStringCatInTheFileGiven {

	public static void main(String[] args) throws IOException {
		//open file
		FileInputStream fis = new FileInputStream("findingString.txt");
		DataInputStream dis = new DataInputStream(fis);
		BufferedReader bis = new BufferedReader(new InputStreamReader(dis));
		Queue<String> q = new LinkedList<>();
		String str;
		//read lines from file
		while((str = bis.readLine())!=null) {
		//check if line has cat
			if(str.contains("cat")) {
		//check if the array size is >=5
		//if yes remove 1st inserted and insert new line
				if(q.size()<5) {
					q.add(str);
				}
		//else add
				else {
				//	System.out.println("inside else");
					q.remove();
					q.add(str);
				}
			}
		}
		//iterate and print
		Iterator it = q.iterator();
		while(it.hasNext()) {
			System.out.println((String)it.next());
		}
	}

}
