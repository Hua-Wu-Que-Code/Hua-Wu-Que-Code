package adapter.xmut;

import math.xmut.BubbleSort;

/***
 * 
 * @author tch
 *
 */
public class ArraySort2 implements ArrayUtil{

	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		math.xmut.BubbleSort uti = new BubbleSort(); //ί�еķ�ʽ
		uti.sort4IntArray(arr, true);
	}

}
