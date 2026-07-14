import java.util.Scanner ;
public class Main {
	static int largest(int a ,int b) {
		if(a > b) {
			return a;
		}
		else{
			return b;
		}
	}
	public static void main(String[] args) {
		
		System.out.print("Enter two distinct numbers:");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int largest = largest(a , b);
		System.out.print("Largest number is: " + largest);
		sc.close();
	}
}
