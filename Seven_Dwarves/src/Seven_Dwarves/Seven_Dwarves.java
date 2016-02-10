package Seven_Dwarves;
import java.util.Scanner;
public class Seven_Dwarves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,number3,number4,number5,number6,number7,number8,number9,total;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number 1 : ");
		number1 = scan.nextInt();
		System.out.print("Enter Number 2 : ");
		number2 = scan.nextInt();
		System.out.print("Enter Number 3 : ");
		number3 = scan.nextInt();
		System.out.print("Enter Number 4 : ");
		number4 = scan.nextInt();
		System.out.print("Enter Number 5 : ");
		number5 = scan.nextInt();
		System.out.print("Enter Number 6 : ");
		number6 = scan.nextInt();
		System.out.print("Enter Number 7 : ");
		number7 = scan.nextInt();
		System.out.print("Enter Number 8 : ");
		number8 = scan.nextInt();
		System.out.print("Enter Number 9 : ");
		number9 = scan.nextInt();
		total = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9;
		if(total-(number9+number8)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number7);
		}else if(total-(number9+number7)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number8);
		}else if(total-(number9+number6)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number7+"\n"+number8);
		}else if(total-(number9+number5)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4+"\n"+number6+"\n"+number7+"\n"+number8);
		}else if(total-(number9+number4)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number8);
		}else if(total-(number9+number3)==100){
		System.out.println(number1+"\n"+number2+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number8);
		}else if(total-(number9+number2)==100){
		System.out.println(number1+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number8);
		}else if(total-(number9+number1)==100){
			System.out.println(number2+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number8);
		}else if(total-(number8+number7)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number9);
		}else if(total-(number8+number6)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number8+"\n"+number9);
		}else if(total-(number8+number5)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4+"\n"+number6+"\n"+number7+"\n"+number9);
		}else if(total-(number8+number4)==100){
		System.out.println(number1+"\n"
		+number2+"\n"+number3+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number9);
		}else if(total-(number8+number3)==100){
		System.out.println(number1+"\n"
		+number2+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number9);
		}else if(total-(number8+number2)==100){
		System.out.println(number1+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number9);
		}else if(total-(number8+number1)==100){
		System.out.println(number2+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number9);
		}else if(total-(number7+number6)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number8+"\n"+number9);
		}else if(total-(number7+number5)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4+"\n"+number6+"\n"+number8+"\n"+number9);
		}else if(total-(number7+number4)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number5+"\n"+number6+"\n"+number8+"\n"+number9);
		}else if(total-(number7+number3)==100){
		System.out.println(number1+"\n"+number2+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number8+"\n"+number9);
		}else if(total-(number7+number2)==100){
		System.out.println(number1+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number8+"\n"+number9);
		}else if(total-(number7+number1)==100){
		System.out.println(number2+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number8+"\n"+number9);
		}else if(total-(number6+number5)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number4+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number6+number4)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number5+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number6+number3)==100){
		System.out.println(number1+"\n"+number2+"\n"+number4+"\n"+number5+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number6+number2)==100){
		System.out.println(number1+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number6+number1)==100){
		System.out.println(number2+"\n"+number3+"\n"+number4+"\n"+number5+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number5+number4)==100){
		System.out.println(number1+"\n"+number2+"\n"+number3+"\n"+number6+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number5+number3)==100){
		System.out.println(number1+"\n"+number2+"\n"+number4+"\n"+number6+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number5+number2)==100){
		System.out.println(number1+"\n"+number3+"\n"+number4+"\n"+number6+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number5+number1)==100){
		System.out.println(number2+"\n"+number3+"\n"+number4+"\n"+number6+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number4+number3)==100){
		System.out.println(number1+"\n"+number2+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number4+number2)==100){
		System.out.println(number1+"\n"+number3+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number4+number1)==100){
		System.out.println(number2+"\n"+number3+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number3+number2)==100){
		System.out.println(number1+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number3+number1)==100){
		System.out.println(number2+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number8+"\n"+number9);
		}else if(total-(number2+number1)==100){
		System.out.println(number3+"\n"+number4+"\n"+number5+"\n"+number6+"\n"+number7+"\n"+number8+"\n"+number9);
		}
		else{
		System.out.println("Error");
	}

}
}
