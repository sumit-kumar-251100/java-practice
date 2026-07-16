import java.util.Scanner ;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("Enter number of elements: ") ;
		int n = sc.nextInt() ;
		int[] arr = new int[n] ;
		System.out.println("Enter array elements:") ;
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt() ;
		}
		
		int evenCount = 0 ;
		int oddCount = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] % 2 == 0) {
				evenCount++ ;
			}
			else {
				oddCount++ ;
			}
		}
		
		System.out.println("Even elements: " + evenCount) ;
		System.out.println("Odd elements: " + oddCount) ;
		sc.close() ;
	}
}
