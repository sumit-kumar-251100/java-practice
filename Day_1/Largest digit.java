import java.util.Scanner;
public class main{
	public static void main(String[] args){
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem = 0;
		int largest = -1;
    
		while(n != 0){
			rem = n % 10;
			if(largest < rem){
				largest = rem;
			}
			n = n / 10;
		}
		System.out.print("Largest digit is: " + largest);
		sc.close();
	}
}
