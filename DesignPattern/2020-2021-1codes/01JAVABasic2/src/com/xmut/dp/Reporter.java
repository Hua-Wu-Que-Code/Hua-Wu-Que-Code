package com.xmut.dp;

public class Reporter {

	//开闭原则，对修改封闭，对扩展开放。
	public void interview(Talkable s) {//多态：在运行期间，s可能指向不同类型的对象。
		// TODO Auto-generated method stub
		s.talk();	
	}
}
