package info2.gcd;

public class GCD {
	public int euclid1(int n1, int n2) {
		int m1 = n1;
		int m2 = n2;
		while (m1 != m2) {
			if (m1 > m2) {
				m1 = m1 - m2;
			} else {
				m2 = m2 - m1;
			}
		}
		return m1;
	}

	public int euclid2(int n1, int n2) {

		if (n1 > n2) {
			return euclid2(n1 - n2, n2);
		} else if (n2 > n1) {
			return euclid2(n1, n2 - n1);
		} else { // n1==n2
			return n1;
		}
	}

	public int gcd(int n1, int n2) {
		for (int i = Math.max(n1, n2); i > 0; i--) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				return i;
			}
		}
		return -1; 
	}

	public int strange(int n1, int n2) {
		int m1 = n1;
		int m2 = n2;
		while ((m1 != 0) && (m2 != 0)) {
			if (m1 > m2) {
				m1 = m1 % m2;
			} else {
				m2 = m2 % m1;
			}
		}
		return m1 + m2;
	}

	public int stranger(int n1, int n2) {
		int m1 = n1;
		int m2 = n2;
		while (m1 != m2) {
			if (m1 > m2) {
				while (m1 > m2) {
					m1 = m1 - m2;
				}
				;
			} else {
				while (m2 > m1) {
					m2 = m2 - m1;
				}
				;
			}
		}
		return m1;
	}
}
