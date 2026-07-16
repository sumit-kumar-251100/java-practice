import java.util.Scanner ;
public class Main {
	public static void main(String[] args) {
		System.out.print("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ;
		
		System.out.println("Enter array elements:");
		int[] arr = new int[n];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++){
			sum = sum + arr[i] ;
		}
		
		System.out.print("Sum of array elements is: " + sum) ;
		sc.close() ;
	}
}
