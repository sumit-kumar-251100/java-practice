import java.util.Scanner ;
public class Main {
	public static void main(String[] args) {
		
		System.out.print("Enter number of elements: ") ;
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		int[] arr = new int[n] ;
		
		System.out.println("Enter array elements: ") ;
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt() ;
		}
		
		System.out.println("Reverse of array is: ") ;
		for(int i = n-1 ; i >= 0 ; i--){
			System.out.print(arr[i] + " ") ;
		}
		sc.close();
	}
}
