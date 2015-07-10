//switch语句的使用-字符串
package ifandswith;

import java.util.Scanner;

public class Demo5 {
public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	String dayString=scanner.nextLine();
	int day=0;
	switch(dayString.toLowerCase()){//将输入内容全部转化为小写
	case "monday":day=1;break;
	case "tuesday":day=2;break;
	case "wednesday":day=3;break;
	case "thursday":day=4;break;
	case "friday":day=5;break;
	case "saturday":day=6;break;
	case "sunday":day=7;break;
	default:day=0;
	}
	if(day==0){
		System.out.println("无效输入");
	}
	else{
		System.out.println(day);
	}//类型为字符串
	}

}
