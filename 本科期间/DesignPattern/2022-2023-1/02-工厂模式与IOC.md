创建型模式的作用在于封装对象的创建，有时候对象的创建比较复杂专业且可能存在变化点。

比如模仿NumberFormat的使用。

```
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double TAX_RATE = 0.06; // 6% sales tax
        int quantity;
        double subtotal, tax, totalCost, unitPrice;

        Scanner scan = new Scanner(System.in);
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
        NumberFormat fmt2 = NumberFormat.getPercentInstance();
        System.out.print("Enter the quantity: ");
        quantity = scan.nextInt();
        System.out.print("Enter the unit price: ");

        unitPrice = scan.nextDouble();
        subtotal = quantity * unitPrice;
        tax = subtotal * TAX_RATE;
        totalCost = subtotal + tax;
        // Print output with appropriate formatting
        System.out.println("Subtotal: " + fmt1.format(subtotal));
        System.out.println("Tax: " + fmt1.format(tax) + " at " + fmt2.format(TAX_RATE));
        System.out.println("Total: " + fmt1.format(totalCost));
	}
}

运行结果为：
Enter the quantity: 45
Enter the unit price: 23.1
Subtotal: ￥1039.5
Tax: ￥62.37 at 6.0%
Total: ￥1101.87
```

注释掉NumberFormat类的导入语句，然后自行实现。明显format()方法是多态的，即多中类型的对象有不同的实现。所以定义一个抽象的父类。

```
package factorymethod;

public abstract class NumberFormat {

	public static NumberFormat getCurrencyInstance() {
		// TODO Auto-generated method stub
		return new CurrentNumberFormat();
	}

	public static NumberFormat getPercentInstance() {
		// TODO Auto-generated method stub
		return new PercentNumberFormat();
	}

	public abstract String format(double subtotal);

}
```

不同的子类有不同的format（）实现。


```
package factorymethod;

public class CurrentNumberFormat extends NumberFormat {

	@Override
	public String format(double subtotal) {
		// TODO Auto-generated method stub
		return "￥ " + subtotal;
	}

}

package factorymethod;

public class PercentNumberFormat extends NumberFormat {

	@Override
	public String format(double subtotal) {
		// TODO Auto-generated method stub
		return "" + subtotal * 100 + " %";
	}

}

```
OK 。


```
工厂模式详见网页：https://blog.csdn.net/qq_45867375/article/details/124597130
IOC控制反转：依赖注入与工厂方法：https://www.cnblogs.com/zwh0910/p/14616823.html


使用的工具类，BeanFactory用来读取配置文件，并利用反射机制实例化对应的类的对象。
package xmut.edu.ioc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {

	private static Properties pros = null;
	private static Map<String, Object> beans = null;
	
	static {
		pros = new Properties();
		InputStream in  = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
		try {
			pros.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		beans = new HashMap<String, Object>();
		Enumeration keys = pros.keys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement().toString();
			String className = pros.getProperty(key);
			Object value = null;
			try {
				value = Class.forName(className).newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			beans.put(key, value);
		}
		
	}
	
	public static Object getBean(String className)
	{
		return beans.get(className);
	}
}

其它代码分别如下所示（ **如果把下面的代码中的BeanFactory.getBean替换成new一个具体的对象，则view service dao不能真正的解耦，即无法单独编译成功** ）：
package xmut.edu.ioc;

public class Account {

}

package xmut.edu.ioc;

public interface IAccountService {
	void saveAccount(Account c);
}


package xmut.edu.ioc;

public interface IAccountDao {

	void saveAccount(Account c);

}

package xmut.edu.ioc;

public class AccountServiceImpl implements IAccountService {

	private IAccountDao dao = (IAccountDao) BeanFactory.getBean("accountdao");
	@Override
	public void saveAccount(Account c) {
		// TODO Auto-generated method stub
		dao.saveAccount(c);
	}
}

package xmut.edu.ioc;

public class AccountDaoImpl implements IAccountDao {

	@Override
	public void saveAccount(Account c) {
		// TODO Auto-generated method stub
		System.out.println("save account : " + c);
	}
}


package xmut.edu.ioc;

public class view { //模拟视图层

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAccountService service = (IAccountService) BeanFactory.getBean("serviceimpl");
		Account c = new Account();
		service.saveAccount(c);
	}

}
```






