package decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("message.txt");
			BufferedReader br = new BufferedReader(fr)){
			
			/*while(true) {
				String str = br.readLine();  //1행 읽음
				if(str == null) break;
				System.out.println(str);
			}*/
			String str;
			//읽은 행이 없을 때까지 루프(반복)
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
