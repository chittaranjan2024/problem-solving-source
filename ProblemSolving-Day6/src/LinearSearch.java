
public class LinearSearch {

	public static int linearSearch(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {38,27,43,3,9,82,10};
		int result=linearSearch(arr, 82);
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
