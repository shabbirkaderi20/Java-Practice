package com.designPatterns;

public class SingletonDCL {
	
	private SingletonDCL() {}
	
	private static volatile SingletonDCL instance;
	
	public SingletonDCL getInstace() {
		
		if(instance== null) {
			synchronized(instance) {
				if(instance== null) return new SingletonDCL();
			}
		}
		return instance;	
	}
}
