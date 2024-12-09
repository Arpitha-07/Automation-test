package practice1;

class EvenArray {

	public static void main(String[] arg) {
	int[] ar= {10,20,30};
	int sum=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i]%2==0)
		{
			sum=sum+ar[i];
			System.out.println(sum);
		}
	}

	}

}
