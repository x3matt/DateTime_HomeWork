import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestCode {

	@Test
	public void testFormator() {
		List<String> dateList = Arrays.asList("2018-05-14","1754-12-31","2014-06-28");
		List<String> result = Arrays.asList(
				"14 мая 2018 понедельник"
				,"31 декабря 1754 вторник"
				,"28 июня 2014 суббота"
				);
		assertEquals(result, Main.reformator(dateList));
	}
	@Test
	public void testFormatorSorted() {
		List<String> dateList = Arrays.asList("2018-05-14","1754-12-31","2014-06-28");
		List<String> result = Arrays.asList(
				"31 декабря 1754 вторник"
				,"28 июня 2014 суббота",
				"14 мая 2018 понедельник"
				);
		assertEquals(result, Main.sortReformator(dateList));
	}
}
