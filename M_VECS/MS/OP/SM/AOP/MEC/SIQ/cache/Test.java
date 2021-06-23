package MS.OP.SM.AOP.MEC.SIQ.cache;

import PEU.P.cache.*;

public class Test {
	public static void main(String[] args) { 
		// Cache_M.putCache("abc", new Cache());
		Cache c= new Cache();
		c.I_Value("good");
		Cache_M.putCache("result", c);
		System.out.println(Cache_M.getCacheInfo("result").getValue().toString()); 
	} 
}