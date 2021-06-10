package VPC.cache;
//package OSI.OSU.VPC.cache;
//import java.util.*;
//
////import org.lygFrontend.cache.Cache;
////refer javadoc-api/org/springframework/cache/CacheManager.html 这是spring 早期的缓存函数进行了2次修改。
////修改人 罗瑶光
////本人在2017年设计非nginx的数据包限流的时候, 设计了sync关键字函数进行 唯一化限流.
////最早是亚米王浩雷 介绍我2级缓存的时候 我在谷歌搜索上找到这个apache 2.0 , Spring 官方文件, 本人没有做任何修改仅仅引用. 见deta cache processor 源码
//public class CacheManager {
//	@SuppressWarnings("rawtypes")
//	private static HashMap cacheMap = new HashMap();
//	
//	private CacheManager() {
//		super();
//	}
//
//	public static boolean getSimpleFlag(String key) {
//		try {
//			return (Boolean) cacheMap.get(key);
//		} catch (NullPointerException e) {
//			return false;
//		}
//	}
//
//	public static long getServerStartdt(String key) {
//		try {
//			return (Long) cacheMap.get(key);
//		} catch (Exception ex) {
//			return 0;
//		}
//	}
//
//	@SuppressWarnings("unchecked")
//	public synchronized static boolean setSimpleFlag(String key, boolean flag) {
//		if (flag && getSimpleFlag(key)) {
//			return false;
//		} else {
//			cacheMap.put(key, flag);
//			return true;
//		}
//	}
//
//	@SuppressWarnings("unchecked")
//	public synchronized static boolean setSimpleFlag(String key, long serverbegrundt) {
//		if (cacheMap.get(key) == null) {
//			cacheMap.put(key, serverbegrundt);
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//
//	//private synchronized static Cache getCache(String key) {
//	private synchronized static Cache getCache(String key) {
//		return (Cache) cacheMap.get(key);
//	}
//
//	// private synchronized static boolean hasCache(String key) {
//	private synchronized static boolean hasCache(String key) {
//		return cacheMap.containsKey(key);
//	}
//
//	public synchronized static void clearAll() {
//		cacheMap.clear();
//	}
//
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public synchronized static void clearAll(String type) {
//		Iterator i = cacheMap.entrySet().iterator();
//		String key;
//		ArrayList arr = new ArrayList();
//		try {
//			while (i.hasNext()) {
//				java.util.Map.Entry entry = (java.util.Map.Entry) i.next();
//				key = (String) entry.getKey();
//				if (key.startsWith(type)) {
//					arr.add(key);
//				}
//			}
//			for (int k = 0; k < arr.size(); k++) {
//				clearOnly((String) arr.get(k));
//			}
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//	}
//
//	public synchronized static void clearOnly(String key) {
//		cacheMap.remove(key);
//	}
//
//	//public synchronized static void putCache(String key, Cache obj) {
//	@SuppressWarnings("unchecked")
//	public synchronized static void putCache(String key, Cache obj) {
//		cacheMap.put(key, obj);
//	}
//
//	public synchronized static Cache getCacheInfo(String key) {
//		if (hasCache(key)) {
//			Cache cache = getCache(key);
//			if (cacheExpired(cache)) {
//				cache.setExpired(true);
//			}
//			return cache;
//		} else
//			return null;
//	}
//
//	@SuppressWarnings("unchecked")
//	public static void putCacheInfo(String key, Cache obj, long dt, boolean expired) {
//		Cache cache = new Cache();
//		cache.setKey(key);
//		cache.setTimeOut(dt + System.currentTimeMillis());
//		cache.setValue(obj);
//		cache.setExpired(expired);
//		cacheMap.put(key, cache);
//	}
//
//	@SuppressWarnings("unchecked")
//	public static void putCacheInfo(String key, Cache obj, long dt) {
//		Cache cache = new Cache();
//		cache.setKey(key);
//		cache.setTimeOut(dt + System.currentTimeMillis());
//		cache.setValue(obj);
//		cache.setExpired(false);
//		cacheMap.put(key, cache);
//	}
//
//	public static boolean cacheExpired(Cache cache) {
//		if (null == cache) {
//			return false;
//		}
//		long nowDt = System.currentTimeMillis();
//		long cacheDt = cache.getTimeOut();
//		if (cacheDt <= 0 || cacheDt > nowDt) {
//			return false;
//		} else {
//			return true;
//		}
//	}
//
//	public synchronized static int getCacheSize() {
//		return cacheMap.size();
//	}
//
//	@SuppressWarnings("rawtypes")
//	public static int getCacheSize(String type) {
//		int k = 0;
//		Iterator i = cacheMap.entrySet().iterator();
//		String key;
//		try {
//			while (i.hasNext()) {
//				java.util.Map.Entry entry = (java.util.Map.Entry) i.next();
//				key = (String) entry.getKey();
//				if (key.indexOf(type) != -1) {
//					k++;
//				}
//			}
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
//		return k;
//	}
//
//	@SuppressWarnings({ "rawtypes", "unchecked", "finally" })
//	public static ArrayList getCacheAllkey() {
//		ArrayList a = new ArrayList();
//		try {
//			Iterator i = cacheMap.entrySet().iterator();
//			while (i.hasNext()) {
//				java.util.Map.Entry entry = (java.util.Map.Entry) i.next();
//				a.add((String) entry.getKey());
//			}
//		} catch (Exception ex) {
//		} finally {
//			return a;
//		}
//	}
//
//	@SuppressWarnings({ "rawtypes", "unchecked", "finally" })
//	public static ArrayList getCacheListkey(String type) {
//		ArrayList a = new ArrayList();
//		String key;
//		try {
//			Iterator i = cacheMap.entrySet().iterator();
//			while (i.hasNext()) {
//				java.util.Map.Entry entry = (java.util.Map.Entry) i.next();
//				key = (String) entry.getKey();
//				if (key.indexOf(type) != -1) {
//					a.add(key);
//				}
//			}
//		} catch (Exception ex) {
//		} finally {
//			return a;
//		}
//	}
//} 