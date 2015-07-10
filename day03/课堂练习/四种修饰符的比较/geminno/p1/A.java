//四种访问修饰符的比较
package com.geminno.p1;

public class A {
	//public 修饰，所有都可访问
public void methodA1(){
	System.out.println("public methodA1");
}
//private修饰 ，表示私有
private void methodA2(){
	System.out.println("public methodAa");
}
//默认default修饰，只有在同一个包中，才可访问
void methodA3(){
	System.out.println("defaule methodA3");
	
}
//protected修饰，在同一个包或子类才可访问
protected void methodA4(){
	System.out.println("protected methodA4");
}
}
