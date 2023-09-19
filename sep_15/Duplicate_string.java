package sep_15;
import java.util.Scanner;
public class Duplicate_string {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		int count=0;
		char[] ch=str.toCharArray();
		System.out.println("Duplicate character is:");
	for(int i=0;i<str.length();i++)
	{
		for(int j=i+1;j<str.length();j++)
		{
		if(ch[i]==ch[j])
		{
			System.out.println(ch[j]);
			count++;
		}
		}
	}
System.out.println("Total duplicate character is:"+count);
	}

}
