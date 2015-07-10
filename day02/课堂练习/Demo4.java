//switch语句的使用——整型
package ifandswith;

import java.util.Scanner;

public class Demo4 {
public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	int day=scanner.nextInt();
	String monthString="";
	switch(day){
	case 1:monthString="monday";break;
	case 2:monthString="tuesday";break;
	case 3:monthString="wednesday";break;
	case 4:monthString="thursday";break;
	case 5:monthString="friday";break;
	case 6:monthString="saturday";break;
	case 7:monthString="sundzy";break;
	default:monthString="error";
	}
	System.out.println(monthString);
//switch后面的类型为整型
	}

}
