import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException{
		BufferedReader scan = new BufferedReader(new FileReader("D://txtFile//BookData.txt"));
		String temp = "";
		int i = 1;
		while((temp=scan.readLine())!=null) {
			String [] data = temp.split("\t");
			System.out.println(i+". "+data[0]+"("+data[1]+"), Rating "+data[2]+" publish on "+data[5]);
			i++;
		}
		scan.close();
	}

}
