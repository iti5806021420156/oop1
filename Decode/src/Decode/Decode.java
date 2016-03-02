package Decode;
import java.util.Scanner;
public class Decode {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		char s;
		int i=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter text : ");
		s1=scan.nextLine();
		s2=s1.toUpperCase();
		for(i=s2.length()-1;i>=0;i--)
		{
			s=s2.charAt(i);
			if(s=='E')
			{
				s='R';
			}
			else if(s=='R')
			{
				s='W';
			}
			else if(s=='W')
			{
				s='E';
			}
			
			System.out.print(s);
		}
	}
}