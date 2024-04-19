package facotry.xmut.edu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TomcatClient { //接受了WEB请求，把请求分配给具体的处理类。JSP SERVLET
	
	public void handleRequest(Request re, Response res)
	{
		//找path对应的Servlet是否存在，如果存在看是否已经创建了对象。
		//如果没有创建，创建对象，init(),service(),doPost
		/*Servlet s = new Servlet(); //Servlet必定要扩展，必须要把变化点封装起来
		s.init(re,res);
		s.service(re,res);	*/
		//面向接口编程，抽象的对象引用。
		Creator c = getCCreator(); //只能创建ServletA
		c.handle(re,res);
	}

	private Creator getCCreator() {
		// TODO Auto-generated method stub
		Scanner s = null;
		String creatorName = null;
		Creator c = null;
		try {
			s = new Scanner(new FileReader("./conf.md"));
			if (s.hasNext()) {
				creatorName = s.nextLine();
				System.out.println(creatorName);
			}
			s.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}; //迭代器，遍历数组，集合，
		//反射
		try {
			Class creatorClass = Class.forName(creatorName);
			try {
				c = (Creator) creatorClass.newInstance();
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
		return c; 
	}

}
