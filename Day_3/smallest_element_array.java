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
		
		int min = Integer.MAX_VALUE ;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] <= min){
				min = arr[i] ;
			}
		}
		
		System.out.print("Smallest element in the array is: " + min) ;
		sc.close() ;
		
	}
}
