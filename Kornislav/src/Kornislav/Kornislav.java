package Kornislav;
import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		int Value_1,Value_2,Value_3,Value_4,TEMP;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Value 1 = ");
		Value_1=scan.nextInt();
		System.out.print("Input Value 2 = ");
		Value_2=scan.nextInt();
		System.out.print("Input Value 3 = ");
		Value_3=scan.nextInt();
		System.out.print("Input Value 4 = ");
		Value_4=scan.nextInt();
		if(Value_1>Value_2){
			TEMP=Value_1;
		Value_1=Value_2;
		Value_2=TEMP;
		}
		if(Value_1>Value_3){
			TEMP=Value_1;
		Value_1=Value_3;
		Value_3=TEMP;
		}
		if(Value_1>Value_4){
			TEMP=Value_1;
		Value_1=Value_4;
		Value_4=TEMP;
		}
		if(Value_2>Value_3){
			TEMP=Value_2;
		Value_2=Value_3;
		Value_3=TEMP;
		}
		if(Value_2>Value_4){
			TEMP=Value_2;
		Value_2=Value_4;
		Value_4=TEMP;
		}
		if(Value_3>Value_4){
			TEMP=Value_3;
		Value_3=Value_4;
		Value_4=TEMP;
		}
		System.out.print("\nRectangle Area = : "+""+Value_3+""+" * "+Value_1+" = "+Value_3*Value_1);

	}

}