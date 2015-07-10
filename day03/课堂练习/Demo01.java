//this 的使用，Person类举例
package daythree;

public class Demo01 {
	public static void main(String[] args) {
		Person person=new Person("张三",20,"中国");
		person.introduce();
	}
}
class Person {
String name;
int age;
String add;


public Person(){}
public Person(String name,int age){
	this.name=name;
	this.age=age;
	
}
public Person(String name,int age,String add){
	this(name,age);//避免引起重复冗余
	this.add=add;
	
}
void hello(){
	System.out.println("helle");
}
void introduce(){
	System.out.println("name:"+this.name+"\tage:"+this.age+"\tadd:"+this.add);
	this.hello();
}
}