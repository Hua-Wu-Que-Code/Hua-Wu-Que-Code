package stra.xmut;

public class InsertSorting implements Sorting{
	public void sort (Comparable[] list)
	   {
	      for (int index = 1; index < list.length; index++)
	      {
	         Comparable key = list[index];
	         int position = index;

	         //  Shift larger values to the right
	         while (position > 0 && key.compareTo(list[position-1]) < 0)
	         {
	            list[position] = list[position-1];
	            position--;
	         }
	            
	         list[position] = key;
	      }
	   }


}
