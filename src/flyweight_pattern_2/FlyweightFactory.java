package flyweight_pattern_2;

import java.util.Map;
import java.util.TreeMap;

public class FlyweightFactory {

	Map pool;

	public FlyweightFactory() {
		pool = new TreeMap();
	}

	public Flyweight getFlyweight(String key) {

		Flyweight flyweight = (Flyweight) pool.get(key);

		if (flyweight == null) {
			flyweight = new Flyweight(key);
			pool.put(key, flyweight);
			System.out.println("새로 생성 : " + key);
		}
		else {
			System.out.println("재사용 : " + key);
		}

		return flyweight;
	}
}
