package stra.xmut;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class OneLineString2 {

	public static String readLine(String filePath)
	{
		// TODO Auto-generated method stub
				Scanner s = null;
				String creatorName = null;
				try {
					//"./conf.md"
					s = new Scanner(new FileReader(filePath));
					if (s.hasNext()) {
						//System.out.println(creatorName);
						creatorName = s.nextLine();
					}
					s.close();
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}; //迭代器，遍历数组，集合，
				//反射
				return creatorName;
	}
}
