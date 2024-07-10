package exp11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Filehandling {
	public static void main(String[] argv) throws Exception 
	{
	    System.out.println("Enter your name:Thorat Yogesh Santosh");
	    System.out.println("Enter your roll no:3256");
	    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\thora\\OneDrive\\Desktop\\readfile.txt"));
	    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\thora\\OneDrive\\Desktop\\writefile.txt"));
	    int i;
	    do {
	      i = br.read();
	      if (i != -1) 
	      bw.write((char) i);
	       } while (i != -1);
	    br.close();
	    bw.close();
	}


}
