import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestCode {

	@Test
	public void testFormator() {
		List<String> dateList = Arrays.asList("2018-05-14","1754-12-31","2014-06-28");
		List<String> result = Arrays.asList(
				"14 ��� 2018 �����������"
				,"31 ������� 1754 �������"
				,"28 ���� 2014 �������"
				);
		assertEquals(result, Main.reformator(dateList));
	}
	@Test
	public void testFormatorSorted() {
		List<String> dateList = Arrays.asList("2018-05-14","1754-12-31","2014-06-28");
		List<String> result = Arrays.asList(
				"31 ������� 1754 �������"
				,"28 ���� 2014 �������",
				"14 ��� 2018 �����������"
				);
		assertEquals(result, Main.sortReformator(dateList));
	}
}
