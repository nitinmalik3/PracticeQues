import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s1=new String();
		String s2=new String();
		s1=sc.next();
		s2=sc.next();
		int flag=0;
		int []arr=new int[26];
		if(s1.length()==s2.length())
		{
			flag=1;
			for(int i=0;i<s1.length();i++)
		{
			arr[(int)s1.charAt(i)-97]++;
			
		}
		
		for(int i=0;i<s2.length();i++)
		{
			arr[(int)s2.charAt(i)-97]--;
			
		}
		
		int i;
		for(i=0;i<26;i++)
		{
		  if(arr[i]!=0)
			  break;
		}
		if(i!=26)
			System.out.println("Not anagram");
		else
			System.out.println("anagram");
	}
	
	else
		System.out.println("Not anagram");
		

}
}
