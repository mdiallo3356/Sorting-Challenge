import java.util.Arrays;

/*Author: Mamadou Diallo
Project: In place Sorts
Date: 2/1/18 */
public class SearchAlgorithms
{
	public static void main(String[] args)
	{
	//testing Arrays
	int[]test1 = {1, 4, 4, 5, 2,4, 3, 17, 0};
	double[]test2= {1.1, 4.1, 4.2, 5.0, 2.0, 4.0, 3.0, 17.0, 0.0};
	String[]test3= {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
	
	//Insertion Sort Test
	long start = System.nanoTime();
	InsertionSort(test1);
	long end = System.nanoTime();
	long time = end - start;
	System.out.println("Test1 took: " + time + "nanoseconds");
	System.out.println(Arrays.toString(test1));
	
	//Selection Sort Test
	start = System.nanoTime();
	SelectionSort(test2);
	end = System.nanoTime();
	time = end - start;
	System.out.println("Test2 took: " + time + "nanoseconds");
	System.out.println(Arrays.toString(test2));
	
	//Bubble Sort Test
	start = System.nanoTime();
	BubbleSort(test3);
	end = System.nanoTime();
	time = end - start;
	System.out.println("Test3 took: " + time + "nanoseconds");
	System.out.println(Arrays.toString(test3));
	}
	public static void Swap(int[]nums, int index, int index1)
	{
		int temp = nums[index1];
		nums[index] = nums[index1];
		nums[index1] = temp;
	}
	public static void InsertionSort(int[]nums)
	{
		int n = nums.length;                    //initialize variable
		for(int j = 1; j < n; j++)               
		{//keep running the below until you reach the end of the array
			int key = nums[j];
			int i = j-1;
			while((i > -1) && (nums[i] > key))
			{
				nums[i+1] = nums[i];
				i--;
			}
			nums[i+1] = key;//repeat the above, excluding the value used previously
		}
	}
	public static void SelectionSort(double[]dubs)
	{
		int l = dubs.length;
		for(int i = 1; i < l-1; i++)
		{
			int min = i;
			for(int j = 0;j < i; j++)
			{
				if(dubs[j]<dubs[min])
				{
					min = j;
				}
				double temp = dubs[min];
	            dubs[min] = dubs[i];
	            dubs[i] = temp;
			}
		}
	}
	public static void BubbleSort(String[]words)//Starts from last index
	{
		for(int i = words.length-1; i >= 1;i--)
		{
			for(int j = i-1; j >= 0; j--)
			{
				if(words[i].compareTo(words[j]) < 0)
				{
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
	}
	/*public static void BubbleSort(String[]words) //Starts from first index
	{
		for(int i = 0; i <= words.length-2;i++)
		{
			for(int j = i+1; j <= words.length-1; j++)
			{
				if(words[i].compareTo(words[j]) > 0)
				{
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
	}*/
}

		
		

	
	



