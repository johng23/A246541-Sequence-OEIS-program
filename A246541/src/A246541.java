import java.util.TreeSet;

public class A246541 {
	public static void main(String[] args) {
		int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43 };

		for (int z = 1; z < 10; z++) {
			int n = z;
			long integerLength = 1;
			for (int i = 0; i < n + 1; i++) {
				integerLength *= primes[i];
			}
			TreeSet<Long> numResults = new TreeSet<Long>();
			for (int i = 1; i < integerLength / 2; i += 2) {
				boolean isInList = true;
				for (int j = 1; j < n + 1; j++) {
					if (i % primes[j] == 0) {
						isInList = false;
					}
				}
				if (isInList) {
					long k = i % integerLength;
					if (k != 0) {
						long l = (k * k) % integerLength;
						if (!numResults.contains(l)) {
							numResults.add(l);
						}
					}
				}
			}
			System.out.println(numResults.size());
		}
	}
}
