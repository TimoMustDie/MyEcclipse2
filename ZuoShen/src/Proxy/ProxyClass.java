package Proxy;

public class ProxyClass implements TotalInterface{
	TotalInterface interface1;
	public ProxyClass(TotalInterface interface1) {
		this.interface1=interface1;
	}
	@Override
	public void testPringt() {
		// TODO Auto-generated method stub
		interface1.testPringt();
	}
}	
