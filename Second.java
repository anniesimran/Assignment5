import java.util.*; 
public class Second {
 
	public static void main(String[] args) {
 
		int arr[],temp;
                 arr = new int[20];
		int largest = arr[0];
		int secondLargest = arr[0];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of array" );
                 int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}for (int i = 0; i < n; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}
}