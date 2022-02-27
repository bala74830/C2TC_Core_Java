package TNS;
public class ArrayRotation {
	
	public static void main(String[] args)
	{
		int[] arr=new int[] {10,20,30,40,50};
		int n=1;
		System.out.println("Array elements before right rotation......");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		
		System.out.println("rotating array 1 time");
		for(int i=0;i<n;i++)
		{
			int j,last;
			last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		
		System.out.println("-----------------");
		System.out.println("Array elements after right rotation......");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}

	}

}
