import java.util.Scanner;
public class main{
	public static void main(String[] args){
		System.out.print("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rem = 0;
		int Armstrong = 0;
		int temp = n;
    
		while(n != 0){
			rem = n % 10;
			Armstrong = Armstrong + (rem*rem*rem);
			n=n/10;
		}
		if(temp == Armstrong){
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("Not Armstrong number");
		}
		sc.close();
	}
}
