package dongtai;

public class test {
	public static void main(String[] args) {
		/*
		 
		A a=new A();
		System.out.println(a.str);
		a.hello();
		
		 */
		/*
		  B b=new B();
	      System.out.println(b.str);
		  b.hello();
		 */
		A a= new B();//父类类型指向子类对象
		System.out.println(a.str);
		a.hello();
		//动态绑定；在运行时才能够确定调用哪个hello方法
	}


}
