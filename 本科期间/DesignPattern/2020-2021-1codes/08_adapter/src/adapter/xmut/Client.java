package adapter.xmut;

import file.xmut.OneLineString;

public class Client {//Œ»∂® student a. 

	public void doSort(int[] arr)
	{
		OneLineString oneline = new OneLineString();
		String className = oneline.readLine();
		ArrayUtil util = getInstance(className);
		util.sort(arr);	
	}

	private ArrayUtil getInstance(String className) {
		// TODO Auto-generated method stub
		ArrayUtil util = null;
		try {
			Class cl = Class.forName(className);
			try {
				util = (ArrayUtil) cl.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return util;
	}
	
}
