package Encode;
import java.util.Scanner;
public class Encode {

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
			if(s=='R')
			{
				s='E';
			}
			else if(s=='W')
			{
				s='R';
			}
			else if(s=='E')
			{
				s='W';
			}
			System.out.print(s);
		}

	}

}
