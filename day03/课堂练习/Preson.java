package daythree;

 public class Preson {
	String name;
	int age;
	String add;
	
	Preson(String n,int m,String p){
		name=n;
		age=m;
		add=p;
		
	}
	
	void introduce(){
		System.out.println("大家好，我叫"+name+",今年"+age+"岁了，我在"+add+"");
	}
	
	
		
		
	public static void main(String[] args){
		Preson person=new Preson("张三",20,"北京");
		person.introduce();
}
}

