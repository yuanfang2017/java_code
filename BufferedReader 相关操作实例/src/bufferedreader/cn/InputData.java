package bufferedreader.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.crypto.Data;

public class InputData {
	private BufferedReader  br = null;
	//通过构造方法实例化对象
	public InputData(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	//得到字符串信息的方法
	public String getString(String info){
		String temp = null;
		System.out.println(info);
		try {
			temp = this.br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
	//得到一个整数的输入类型
	public int getInt(String info ,String err){
		int temp = 0;
		String str = null;
		boolean flag =  true;
		while (flag) {
			str = this.getString(info);
			//"^\\d+$"　　//非负整数（正整数   +   0）  
			if (str.matches("^\\d+$")) {
				temp = Integer.parseInt(str);
				flag = false;			
			}
			else {
				System.out.println(err);
			}
			
		}
		return temp;
	}	
	//得到一个小数的输入数据
	public float getFloat(String info,String err){
		float temp = 0f;
		String str = null;
		boolean flag = true;
		while (flag) {
			str = this.getString(info);
			//^\d+(\.\d+)?$:非负浮点数
			if (str.matches("^\\d+$")){
				temp =Float.parseFloat(str);
				flag = false;		
			}
			else {
				System.out.println(err);
			}
			
			
		}
		return temp;
		
	}
	//日期的输入数据
	public Data getData(String info,String err){
		Data temp = null;
		String str = null;
		boolean flag = true;
		while (flag) {
			str = this.getString(info);
			//^\d{4}(\-|\/|\.)\d{1,2}\1\d{1,2}$:简单的日期判断
			if (str.matches("^\\d+$")){
				SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
				try {
					temp = (Data) sd.parse(str);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				flag = false;		
			}
			else {
				System.out.println(err);
			}
			
		}
		return temp;
		
	}
		
}
