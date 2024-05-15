package accenture;


public class MissingNumber {
	
	public static int missingNumber(int arr[],int n) {
		
		int N=n+1;
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		
		return ( N*(N+1)/2 ) - sum;
		
	}

	public static void main(String[] args) {
		
		
		int arr[]= {1,3,4,2};
		
		System.out.println(missingNumber(arr,arr.length)); 
		
		}
	
}

