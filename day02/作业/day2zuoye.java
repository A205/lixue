//day2课后作业  建立二维成绩表并计算总分与平均值
package ifandswith;

public class day2zuoye {
	public static void main(String[] args){
		
		int arr[][]={{1,80,59,87,45,78},{2,87,60,89,45,78},{3,87,69,80,45,78},
				 {4,87,69,89,40,77},{5,87,69,89,45,75},{6,80,69,79,45,76},
				 {7,81,60,79,45,78},{8,87,69,80,45,78},{9,87,61,89,40,78},
				 {10,87,65,89,45,70},{11,87,69,89,40,78},{12,83,69,69,45,78},
				 {13,81,60,69,45,78},{14,80,69,89,45,78},{15,84,69,89,40,78},
				 {16,80,69,79,45,78},{17,84,69,89,45,78},{18,85,69,89,45,70},
				 {19,87,69,59,40,78},{20,85,69,80,45,78}};
		//手动输入每个学生的五门成绩
		
		
		int a[]=new int[20]; //用来存放每个学生的总成绩
		int b[]=new int[5];//用来存放五门课每门的平均分
		
		String cname[]={"C++ ","Java","Servlet","Jsp","EJB"};
		System.out.print("序号"+"\t");
		for(int i=0;i<5;i++)
		{
			System.out.print(cname[i]+"\t");
			
		}
		System.out.println();//生成成绩表的表头
		
		for(int j=0;j<20;j++)
		{
			for(int k=0;k<6;k++)
			{
				System.out.print(arr[j][k]+"\t");
				
			}
			System.out.println();//将每个学生的五门成绩进行输出
			for(int k=1;k<6;k++)
			{
				
				 a[j]+=arr[j][k]-j;
			}
			
			
			System.out.println();//计算每个同学的总分
			
		}
		System.out.println("每个同学的总成绩为；");
		for(int j=0;j<20;j++)
		{
			System.out.print(a[j]+"\t");
		}
		System.out.println();//计算每个同学的总分
		
		for(int j=1;j<5;j++)
		{
			
			for(int i=0;i<arr.length;i++)
			{
				
				
				b[j]=b[j]+arr[i][j];
			}
			b[j]=b[j]/20;
			
			
		}
		
		System.out.println("五门课的平均成绩分别为:");
		for(int j=0;j<5;j++)
		{
			System.out.println(b[j]);
		}
	
	}
}
