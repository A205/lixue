//四中访问修饰符的比较
package com.geminno.p2;

import com.geminno.p1.A;

public class B extends A{
public void methodB1(){
	A a=new A();
	a.methodA1();
  //a.methodA2(); //此方法private修饰，禁止访问；
  //a.methodA3();//不在同一个包中，禁止访问；，若改为同一个包，则可访问；
	
	methodA4();//子类可以访问，但要注意访问方式；
	}
public static void main(String[] args) {
	B b=new B();
	b.methodB1();
}
}
