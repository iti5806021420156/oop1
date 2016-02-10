package Trik;
import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		
		int LEFT=1,CENTER=0,RIGHT=0,SWAP,i;
		String swap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value : ");
		swap = scan.next();
		for(i=0;i<swap.length();i++){
		if(swap.charAt(i) == 'a' || swap.charAt(i) == 'A'){
		SWAP=LEFT;
		LEFT=CENTER;
		CENTER=SWAP;
		}
		
		else if(swap.charAt(i) == 'b' || swap.charAt(i) == 'B')
		{
		SWAP=CENTER;
		CENTER=RIGHT;
		RIGHT=SWAP;
		}
		
		else
		{
		SWAP=LEFT;
		LEFT=RIGHT;
		RIGHT=SWAP;
		}
		}
		if(LEFT == 1) System.out.println("COIN IS In LEFT GLASS : ");
		else if(CENTER == 1) System.out.println("COIN IS In CENTERer GLASS :");
		else System.out.println("COIN IS In RIGHT GLASS :");
	}

}