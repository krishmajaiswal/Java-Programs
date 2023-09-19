package sep_15;
import java.util.Scanner;
public class Sort {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to sort the data:");
		String str=sc.nextLine();
		System.out.println("The original value before sorting:"+str);
		char[] ch=str.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length-1;j++)
			{
				if(ch[j]>ch[j+1])
				{
					temp=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=temp;
				}
			}
		}
		System.out.println();
		String result=new String(ch);
		System.out.println("After sorting:"+result.toString());
		
	}

}
