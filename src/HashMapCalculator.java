import java.util.ArrayList;
import java.util.HashMap;

public class HashMapCalculator {
	int amountEqual;
	int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		ArrayList<String> values1 = new ArrayList<String>();
		ArrayList<String> values2 = new ArrayList<String>();
		ArrayList<String> keys1 = new ArrayList<String>();
		ArrayList<String> keys2 = new ArrayList<String>();
		values1.addAll(hashmap1.values());
		values2.addAll(hashmap2.values());
		keys1.addAll(hashmap1.keySet());
		keys2.addAll(hashmap2.keySet());
		for (int i = 0; i < values1.size() - 1; i++) {
			for (int j = 0; j < values2.size() - 2; j++) {
				for (int h = 0; h < keys1.size() - 2; h++) {
					for (int k = 0; k < keys2.size() - 2; k++) {
						if (values1.get(i).equals(values2.get(j)) && keys1.get(h).equals(keys2.get(k))) {
							amountEqual++;
						}
					}
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(values1.get(i));
			System.out.println(values2.get(i));
			System.out.println(keys1.get(i));
			System.out.println(keys2.get(i));
		}
		return amountEqual;
	}
}
