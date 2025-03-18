
public class TernarySearch {

	public static int ternarySearch(int arr[],int low,int high,int key)
	{
		if(low<=high)
		{
			int mid1=low+(high-low)/2;
			int mid2=high-(high-low)/2;
			
			if(arr[mid1]==key) return mid1;
			if(arr[mid2]==key) return mid2;
			
			if(key<arr[mid1]) return ternarySearch(arr, low, mid1-1, key);
			if(key>arr[mid2]) return ternarySearch(arr, mid2+1, high, key);
			
			return ternarySearch(arr, mid1+1, mid2-1, key);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {14,67,94,345,876,976};
		int result=ternarySearch(arr,0,arr.length-1, 976);
		
		if(result==-1)
		{
			System.out.println("Element not found!");
		}
		else
		{
			System.out.println(result);
		}
		}
			
	

}
