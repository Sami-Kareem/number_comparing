import java.util.Scanner;
	class Com{
		public static void main (String[] args){
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter a number ");
		int num=obj.nextInt();
			System.out.println("Enter a number again ");
		int num1=obj.nextInt();
			System.out.println("Enter a number again for third time  ");
		int num2=obj.nextInt();
		
		if (num>num1&&num>num2){
			System.out.println("The very first enterd number is gretest "+num);}
		else if (num1>num&&num1>num2){
			System.out.println("The second enterd value is gretest  "+num1);}
		else 
			System.out.println("The third enterd value is gretest "+num2);}}
							