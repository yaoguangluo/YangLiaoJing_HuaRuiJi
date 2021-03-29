package org.lygFrontend.cache;
import org.lygFrontend.cache.Cache;
import org.lygFrontend.cache.CacheManager;

public class test {
	public static void main(String[] args) { 
		// CacheManager.putCache("abc", new Cache());
		Cache c= new Cache();
		c.setValue("good");
		CacheManager.putCache("result", c);
		System.out.println(CacheManager.getCacheInfo("result").getValue().toString()); 
	} 
}