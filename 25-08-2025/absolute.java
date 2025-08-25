import java.util.Scanner;

public class absolute{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int absolute=Math.abs(n);
	System.out.println(absolute);
	sc.close();
}
}
