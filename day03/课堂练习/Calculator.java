package daythree;

public class Calculator {
	
		int num1,num2;
		
	public Calculator(int n1,int n2){
			num1=n1;
			num2=n2;
		}
		void add(){
			System.out.println("num1+num2="+num1+num2);
		}
		public static void main(String[] args){
			Calculator c =new Calculator(2,8);
			c.add();
		}
}
