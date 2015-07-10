//day01 作业 第四题
package exe;

public class Exe03 {
 public static void main(String[] args){
	 int i=1,j=5;
	 float k=3.0f,h;
	 ++i;
	 j=j*i;
	 j++;
	 h=j%k;
	 k=i/k;
	System.out.println("运算结果为：");
	System.out.println("i="+i);
	System.out.println("j="+j);
	System.out.println("k="+k);
	System.out.println("h="+h);
	 //上述进行了整型与浮点型基本的加减乘除运算
	boolean flag=true;
	String flag1=((flag=true)&&((h--)>=0))?"true":"false";
	System.out.println("flag1="+flag);
	//进行了逻辑运算符与三木运算符的相关运算
	
	 }
}
