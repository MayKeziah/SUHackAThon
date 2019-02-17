package schedule;

public class TestClient {

	public static void main(String[] args) {
		Time start = new Time(2019, 2, 2, 2, 29, AmPm.PM);
		Time end = new Time(2019, 2, 3, 10, 5, AmPm.AM);
		String[] keyWords = {"education", "comedy", "show"};
		Event test1 = new Event("Test number 1", keyWords, start, end, 0.0, 1, TimeUnit.ONEOFF);
	}

}
