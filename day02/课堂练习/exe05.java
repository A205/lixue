//练习：三角形图案二
package ifandswith;

import java.util.Scanner;

public class exe05 {
public static void main(String[] args){
	System.out.println("请输入行数");
	Scanner scanner=new Scanner(System.in);
	int num=scanner.nextInt();
    for(int i=1;i<=num;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
	System.out.println();
	}
}
}
