 package adapter.xmut;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Client cl = new Client();
		int[] arr = {5,42,14,23,7,10};
		cl.doSort(arr);
		for(int index = 0; index <arr.length; index++)
		{
			System.out.println(arr[index]);
		}
	}
}
