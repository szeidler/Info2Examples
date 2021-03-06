package info2.staticsearching;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class SearchElementTest {
	SearchElement<Integer> searcher = new SearchElement<Integer>();

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { -1, 0, new Integer[] { 1, 2 } },
				{ 0, 1, new Integer[] { 1, 2 } },
				{ 1, 2, new Integer[] { 1, 2 } },
				{ 2, 5, new Integer[] { 1, 2, 5, 4, 3, 2 } },
				{ -1, 5, new Integer[] { 2 } }, { 0, 2, new Integer[] { 2 } },
				{ -1, 5, new Integer[] {} } };
		return Arrays.asList(data);
	}

	int expectedIndex = 0;
	Integer x = 0;
	Integer[] a;

	public SearchElementTest(int expectedIndex, int x, Integer[] a) {
		this.expectedIndex = expectedIndex;
		this.x = x;
		this.a = a;
	}

	@Test
	public void testBruteForce() {
		assertEquals(expectedIndex, searcher.bruteForce(x, a));
	}

	@Test
	public void testBinarySearch() {
		assertEquals(expectedIndex, searcher.bruteForce(x, a));
	}

}
