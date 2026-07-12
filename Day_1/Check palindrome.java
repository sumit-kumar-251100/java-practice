import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev=0;
		int temp=n;
    
		while(n!=0){
				rev=rev*10;
				rev=rev+n%10;
				n=n/10;
		}
    
		if(rev==temp){
			System.out.println("Palindrome number");
		}
		else{
			System.out.println("Not palindrome");
		}
    
		sc.close();
	}
}
