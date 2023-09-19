package sep_15;

public class Remove_character 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str="java";
		StringBuffer s = new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!='a')
			{
				s=s.append(str.charAt(i));
			}
		}
System.out.println(s);
	}

}
