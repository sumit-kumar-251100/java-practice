import java.util.Scanner;
public class Main {
	
	static boolean isEven(int n){
		return n% 2 == 0;
	}
	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print(isEven(n));
		sc.close() ;
	}
}
