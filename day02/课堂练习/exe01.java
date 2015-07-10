//练习1：输出0到50之间的所有质数
package ifandswith;

public class exe01 {
	public static void main(String[] args){
		for(int num=2;num<=50;num++){
			boolean flag=true;
			for(int i=2;i<num;i++){
				if(num%i==0){
					flag=false;
					break;
				}
			}
		
		if(flag){
			System.out.println(num);
	}

}
	}
}
