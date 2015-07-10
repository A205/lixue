//练习：冒泡排序法
package ifandswith;

public class exe06 {
public static void main(String[] args)
{
	int a[]={8,3,6,9,2,7};
	int temp=0;
	for(int i=a.length-1;i>0;i--)
	{
		for(int j=0;j<i;j++)
		{
			if(a[j]>a[i])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
 for(int i=0;i<a.length;i++)
 {
	 System.out.println(a[i]);
 }
}
}
