package com.designPatterns.creational_dp;

// Classic Implementation
public class SingletonDP {

	private static SingletonDP object;
	
	private SingletonDP() {}
	
	public static SingletonDP getInstance() {
		
		if(object== null) 
			object= new SingletonDP();
		
		return object;
	}

}

// Synchronized
class Singleton
{
    private static Singleton obj;
    private Singleton() {}
 
    // Only one thread can execute this at a time
    public static synchronized Singleton getInstance()
    {
        if (obj==null)
            obj = new Singleton();
        return obj;
    }
}

// Eager
class SingletonEager
{
    private static SingletonEager obj = new SingletonEager();
    private SingletonEager() {}
 
    public static SingletonEager getInstance()
    {
        return obj;
    }
}

// Double Checked Locking
class SingletonDCL
{
    private static volatile SingletonDCL obj  = null;
    private SingletonDCL() {}
 
    public static SingletonDCL getInstance()
    {
        if (obj == null)
        {
            // To make thread safe
            synchronized (SingletonDCL.class)
            {
                // check again as multiple threads
                // can reach above step
                if (obj==null)
                    obj = new SingletonDCL();
            }
        }
        return obj;
    }
}