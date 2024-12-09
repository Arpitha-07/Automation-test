package practice1;

public class Arraycount {
public static void main(String[]args)
{
	int[] ar={1,0,0,0,1,1,1};
	int count=0;
	for(int i=0;i<ar.length;i++)
	{
	if(ar[i]==0||ar[i]==1)
	{
		count++;
	}
		System.out.println(count);
	}
}

}
