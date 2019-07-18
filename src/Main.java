import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> dateList = Arrays.asList("2019-02-25","2011-08-30","2014-07-13");
		System.out.println(reformator(dateList));
	}
	public static List<String> reformator(List<String> dateList){
		return dateList
				.stream()
				.map(a -> LocalDate.parse(a))
				.map(a -> a.format

(DateTimeFormatter.ofPattern("dd MMMM yyyy EEEE")))
				.collect(Collectors.toList());
	}
}
