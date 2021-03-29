package org.lygbackend.cache;
import org.lygbackend.cache.Cache;
import org.lygbackend.cache.CacheManager;

public class test {
	public static void main(String[] args) { 
		// CacheManager.putCache("abc", new Cache());
		Cache c= new Cache();
		c.setValue("good");
		CacheManager.putCache("result", c);
		System.out.println(CacheManager.getCacheInfo("result").getValue().toString()); 
	} 
}