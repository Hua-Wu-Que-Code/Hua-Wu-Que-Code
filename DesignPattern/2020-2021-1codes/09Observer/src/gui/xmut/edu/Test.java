package gui.xmut.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JButton b = new JButton();
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("store log, ������ʵ��");
			}
		});
		ActionListener lis = new MyActionListener();
		b.addActionListener(lis);
		
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("store database, ������ʵ��");
			}
		});
		
		b.doClick();
		
		b.removeActionListener(lis);
		
		b.doClick();
		
	}

}

class MyActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("store log,��ʵ��");
	}
}
