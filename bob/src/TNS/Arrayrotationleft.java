package TNS;

public class Arrayrotationleft {

	public static void main(String[] args) {
		int[] arr=new int[] {10,20,30,40,50};
		int n=1;
		System.out.println("Array elements before right rotation......");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
		
		
		for(int i=0;i<n;i++)
		{
			int j,last;
			last=arr[0];
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=last;
		}
		
		System.out.println("-----------------");
		System.out.println("Array elements after right rotation......");
		for(int a:arr)
		{
			System.out.print(a+" ");
		}
	}

}
