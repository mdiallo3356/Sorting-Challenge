import java.util.Arrays;
import java.util.Random;
/*Author: Mamadou Diallo
Project: In place Sorts
Date: 4/11/2018 */
public class MergePartition
{
	public static void main(String[]args)
	{
		String[]test1={"In"," a"," void,"};
		String[]test2= {" one"," finds"," hope."};
		merge(test1,test2);
		int[]test3= {8,7,2,3,16,9,1};
		partition(test3);
	}
	public static void merge(String[]words1,String[]words2)
	{
		int m = 0;
		String[]merged=new String[words1.length+words2.length];
		for(int i = 0; i<words1.length;i++)
		{
			merged[i]=words1[i];
			m++;
			}
		for(int j = 0;j<words2.length;j++)
		{
			merged[m++]=words2[j];
		}
		for(int k = 0;k<merged.length;k++)
		{
		System.out.print(merged[k]);
		}
	}
	public static int partition(int arr[])
    {
		int low = 0;
		int high = arr.length-1;
        int pivot = arr[low]; 
        int i = (high); // index of larger element
        for (int j=high; j>low; j--)
        {
            // If current element is larger than or
            // equal to pivot
            if (arr[j] >= pivot)
            {
                j--;
                SortAlgorithms.Swap(arr, i, j);
                // swap arr[i] and arr[j]
            }
        }
 
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;
 
        return i+1;
    }
}
		
		         