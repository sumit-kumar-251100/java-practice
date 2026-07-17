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

		System.out.print("Enter element to search: ") ;
		int x = sc.nextInt() ;
		boolean present = false ;
		
		for(int i = 0 ; i < arr.length; i++) {
			if (arr[i] == x) {
			present = true ;
			break ;
			}
		}
		
		if (present == true) {
			System.out.println("Present.");
		}
		else {
			System.out.println("Not present.");
		}
		
		sc.close();
	}
}
