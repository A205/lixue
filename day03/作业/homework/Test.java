//day03 作业  编写程序运行上述所有程序
package homework;

public class Test {
	 public static void main(String[] args) {
		 Army a = new Army(3);
		 a.addWeapon(new Tank());
		 a.addWeapon(new Flighter());
		 a.addWeapon(new WarShip());
		 a.attacAll();
		 a.moveAll();
}
}