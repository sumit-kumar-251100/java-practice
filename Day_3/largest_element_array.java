import java.util.Scanner ;
public class Main {
	public static void main(String[] args) {
		System.out.print("Enter the size of array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() ;
		
		System.out.println("Enter array elements:");
		int[] arr = new int[n];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt() ;
		}
		
		int largest = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length ; i++){
			if (largest <= arr[i]) {
				largest = arr[i] ;
			}
		}
		
		System.out.print("Largest element in the array is: " + largest) ;
		sc.close() ;
	}
}
