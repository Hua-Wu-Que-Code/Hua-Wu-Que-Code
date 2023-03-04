package compos.xmut.edu;

public class JWC {  //client 客户程序相对稳定

	public void startExam(Component s) //变化点， 抽象，依赖抽象就可以应对变化
	{
		s.takeExam();//组合模式：管理树状的数据结构，统一了不同子树的接口
	}
}
