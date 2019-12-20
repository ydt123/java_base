package com.集合;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@SuppressWarnings("rawtypes")
class MyComparator3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String key1=(String) o1;
		String key2=(String) o2;
		/*return key1.compareTo(key2);//升序 */
		return key2.compareTo(key1);//降序	
	}
	
}
public class P243_T5_2 {

	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		Map<String,String> tm = new TreeMap<String,String>(new MyComparator3());
		// Map存储的元素是一个键key+值value=对entry
		tm.put("2", "John");
		tm.put("1", "Lucy");
		tm.put("4", "Aimee");
		tm.put("3", "Smith");
		tm.put("5", "Amanda");
		System.out.println(tm);
		
		System.out.println("遍历键集输出：");
		Set<String> jianji = tm.keySet();
		Iterator<String> diedai = jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value = tm.get(key);
			System.out.println(key + ":" + value);

	   }
	}

}
