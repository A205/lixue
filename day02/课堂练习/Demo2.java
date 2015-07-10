//else if 语句的使用
package ifandswith;

import java.util.Scanner;


 public class Demo2 {
public static void main(String[] args){
	System.out.println("请输入学生成绩");
	Scanner scanner=new Scanner(System.in);
	int score=scanner.nextInt();//使用scanner函数以及nextInt方法输入分数
	if(score>=90){
		System.out.println("等级为A");
	}
	else if(score>=80){
		System.out.println("等级为B");
	}
	else if(score>=70){
		System.out.println("等级为C");
	}
	else if(score>=60){
		System.out.println("等级为D");
	}
	else{
		System.out.println("等级为E");
	}//else if 的使用方法，每一级的else是对上一级条件的else
if(score>=60){
	System.out.println("成绩合格");
}
if(score<0||score>=100){
	System.out.println("输入错误");
}
else{
	System.out.println("成绩不合格");
}//else嵌套结构，是与最近的未配对的if进行配对，此处不符合逻辑
	}
}
