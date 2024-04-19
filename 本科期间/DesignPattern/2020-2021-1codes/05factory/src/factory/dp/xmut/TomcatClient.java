package factory.dp.xmut;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TomcatClient {

	public void handleRequest(String path,Request r,Response res )
	{
		Creator c = null; //封装变化点
		try {
			Scanner scan = new Scanner(new FileReader("./conf.md"));

			if (scan.hasNext()) {
				String creatorString = scan.nextLine();
				Class cl = null;
				try {
					cl = Class.forName(creatorString);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					c = (Creator) cl.newInstance();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				scan.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.handle(path, r, res); 
	}
}
