import java.util.HashMap;
import java.util.Map;

public class Abctest {

	public static void main(String[] args) {

		String s1 = "SauravS";
		String s2 = "Priyanka";
		// a 4 r 2
		int count = 0;
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch2.length; j++) {
				if (ch1[i] == ch2[j]) {
				//	ch2[j] = '1';
					ch2.
					if (m.containsKey(ch2[j])) {
						count = m.get(ch2[j]);
						m.put(ch2[j], count + 2);
					} else if(ch2[j] != '1'){
						m.put(ch2[j], 2);
					}
				}

			}
		}

		for (

		Map.Entry<Character, Integer> entry : m.entrySet()) {
			if (entry.getValue() > 1)
				System.out.println(entry.getKey() + " count = " + entry.getValue());
		}

	}

}
