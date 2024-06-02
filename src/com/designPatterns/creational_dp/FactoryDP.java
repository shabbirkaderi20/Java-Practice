package com.designPatterns.creational_dp;

/**
* 
* @author skaderi
* 
*
*/
 
interface OS {
	void spec();
}
 
class Android implements OS {
	public void spec() {
		System.out.println("Andriod...");
	}
}
 
class IOS implements OS {
 
	@Override
	public void spec() {
		System.out.println("IOS...");
 
	}
 
}
 
class Windows implements OS {
 
	@Override
	public void spec() {
		System.out.println("Windows..");
 
	}
 
}
 
class OperatingSystemFactory {
	public OS getInstance(String str) {
		if (str.equals("Open")) {
			return new Android();
		} else if (str.equals("Closed")) {
			return new IOS();
		} else {
			return new Windows();
		}
	}
}
 
public class FactoryDP {
 
	public static void main(String[] args) {
		OperatingSystemFactory op = new OperatingSystemFactory();
		OS obj =  op.getInstance("");
		obj.spec();

	}
 
}