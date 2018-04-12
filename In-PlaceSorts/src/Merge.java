import java.util.Arrays;
/*Author: Mamadou Diallo
Project: In place Sorts
Date: 4/11/2018 */
public class Merge
{
	public static void main(String[]args)
	{
		String[]test1={"In"," a"," void,"};
		String[]test2= {" one"," finds"," hope."};
		merge(test1,test2);
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
}
