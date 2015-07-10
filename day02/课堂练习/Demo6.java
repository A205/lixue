//switch语句的使用--枚举型
package ifandswith;

public class Demo6 {
	
	public enum day{monday,tuesda,wednesday,thursday,friday,saturday,sunday};
    
	public static void main(String[] args){
	int intDay=0;
	day day1=day.wednesday;
	switch(day1){//枚举类型
	case monday:intDay=1;break;
	case friday:intDay=5;break;
	case saturday:intDay=6;break;
	case sunday:intDay=7;break;
	case thursday:intDay=4;break;
	case tuesda:intDay=2;break;
	case wednesday:intDay=3;break;
	default:intDay=0;break;
	}
	if(intDay==0){
		System.out.println("输入有误");
	}
	else{
		System.out.println(intDay);
	}
}
}
