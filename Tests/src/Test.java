import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

	
	public static void main(String[] args) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("ÇëÊäÈëÄÚÈİ£º");
			String str =null;
			str= br.readLine();
			System.out.println(str);
		} catch (Exception e) {
		
		}
	}
}
