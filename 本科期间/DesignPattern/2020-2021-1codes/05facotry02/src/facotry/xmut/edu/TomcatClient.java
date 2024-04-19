package facotry.xmut.edu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TomcatClient { //������WEB���󣬰�������������Ĵ����ࡣJSP SERVLET
	
	public void handleRequest(Request re, Response res)
	{
		//��path��Ӧ��Servlet�Ƿ���ڣ�������ڿ��Ƿ��Ѿ������˶���
		//���û�д�������������init(),service(),doPost
		/*Servlet s = new Servlet(); //Servlet�ض�Ҫ��չ������Ҫ�ѱ仯���װ����
		s.init(re,res);
		s.service(re,res);	*/
		//����ӿڱ�̣�����Ķ������á�
		Creator c = getCCreator(); //ֻ�ܴ���ServletA
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
		}; //���������������飬���ϣ�
		//����
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
