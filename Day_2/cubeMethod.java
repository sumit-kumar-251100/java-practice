import java.util.Scanner ;
public class Main {
	static int cube( int n ) {
		return n*n*n;
	}
	public static void main(String[] args) {
		
		System.out.print("Enter a number: ") ;
		
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		
		int cube = cube(n);      //method calling
		
		System.out.print("Cube is: " + cube);
		
		sc.close() ;
	}
}
