package schedule;

public class TestClient {

	public static void main(String[] args) {
		Time start = new Time(2019, 2, 2, 2, 29, AmPm.PM);
		Time end = new Time(2019, 2, 3, 10, 5, AmPm.AM);
		String[] keyWords = {"education", "comedy", "show"};
		String[] keyWords1 = {"trivia", "food", "social"};
		String[] keyWords2 = {"comedy", "show", "trivia", "food"};
		String[] keyWords3 = {"entertainment", "film", "travel"};
		String[] keyWords4 = {"play", "spectate"};
		String[] keyWords5 = {"night", "day", "lgbt", "local"};
		String[] keyWords6 = {"realty", "sing", "asia"};
		String[] keyWords7 = {"highclass", "sale", "morning"};
		

		Event test1 = new Event("Test number 1", keyWords, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test2 = new Event("Test number 1", keyWords1, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test3 = new Event("Test number 1", keyWords2, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test4 = new Event("Test number 1", keyWords3, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test5 = new Event("Test number 1", keyWords4, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test6 = new Event("Test number 1", keyWords5, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test7 = new Event("Test number 1", keyWords6, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test8 = new Event("Test number 1", keyWords7, start, end, 0.0, 1, TimeUnit.ONEOFF);
		int duration = test1.getDurationMins();
		System.out.println("Expected: 1176\nGot: " + duration);
		
		String[] topRank = {"trivia", "food", "social"};
	}

}
