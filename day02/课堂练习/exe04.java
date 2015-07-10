//练习：三角形图案2
package ifandswith;

import java.util.Scanner;

public class exe04 {
public static void main(String[] args){
	System.out.println("请输入行数");
	Scanner scanner=new Scanner(System.in);
int num=scanner.nextInt();
for(int i=1;i<=num;i++){
	for(int j=1;j<=num-i;j++){
		System.out.print(" ");
	}
for(int j=1;j<=i*2-1;j++){
System.out.print("*");	
}System.out.println();
}
}
}
