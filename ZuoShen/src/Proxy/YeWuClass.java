package Proxy;

public class YeWuClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalInterface class1=new JuTiClass();
		TotalInterface proxy=new ProxyClass(class1);
		proxy.testPringt();
		
	}

}
