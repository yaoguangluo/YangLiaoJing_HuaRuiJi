package org.lyg.backend.cache;
import org.lyg.backend.cache.Cache;
import org.lyg.backend.cache.CacheManager;

public class test {
	public static void main(String[] args) { 
		// CacheManager.putCache("abc", new Cache());
		Cache c= new Cache();
		c.setValue("good");
		CacheManager.putCache("result", c);
		System.out.println(CacheManager.getCacheInfo("result").getValue().toString()); 
	} 
}