package daythree;



public class Phone {
	String name;
	String brand;
	int price;
	//三个属性
	
	void call(){
		System.out.println("打电话");
	}
	void sendMesage(){
		System.out.println("发短信");
	}
//新建的phone类

public static void main(String[] args){
	Phone p=new Phone();
	Phone phone=new Phone();
	phone.brand="oppo";
	phone.price=1999;
	phone.name="rx";
	System.out.println(phone.brand);
	System.out.println(phone.price);

}
}