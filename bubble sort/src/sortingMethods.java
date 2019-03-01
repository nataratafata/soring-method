

public class sortingMethods {
	private int temp;
	
	
	public void setBubbleSort(int[] ar)
	{
		for (int i = ar.length - 1; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(ar[j] > ar[j + 1])
				{
					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		getBubbleSort(ar);
	}
	
	
	
	
	
	public void getBubbleSort(int[] ar)
	{
		System.out.println("Bubble Sort: ");
		for (int i = 0; i < ar.length; i++)
		{
			System.out.println(ar[i] + ", ");
		}
		
	}

}
