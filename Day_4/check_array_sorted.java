import java.util.Scanner ;
public class Main {
	public static void main(String[] args) {
		
		System.out.print("Enter number of elements: ") ;
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		int[] arr = new int[n] ;
		
		System.out.println("Enter array elements:") ;
    
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt() ;
		}
		
		boolean sort = false ;
    
		for(int i = 1 ; i < arr.length ; i++) {
			if (arr[i-1] <= arr[i]) {
				sort = true ;
			}
			else {
				sort = false;
				break ;
			}
		}
		
		if(sort == true) {
			System.out.println("Array is sorted.") ;
		}
		else {
			System.out.println("Array is not sorted.") ;
		}
		sc.close();
	}
}
