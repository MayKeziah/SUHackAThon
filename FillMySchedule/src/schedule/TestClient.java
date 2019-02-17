package schedule;

import java.util.Arrays;

public class TestClient {

	public static void main(String[] args) {
		Time start = new Time(2019, 2, 2, 2, 29, AmPm.PM);
		Time end = new Time(2019, 2, 3, 10, 5, AmPm.AM);
		String[] keyWords = {"education", "comedy", "show"}; //0
		String[] keyWords1 = {"trivia", "food", "social"}; //3
		String[] keyWords2 = {"comedy", "show", "trivia", "food"}; //2
		String[] keyWords3 = {"entertainment", "film", "travel"}; //0
		String[] keyWords4 = {"play", "trivia"}; //1
		String[] keyWords5 = {"night", "day", "lgbt", "local"}; //0
		String[] keyWords6 = {"realty", "sing", "asia"}; //0
		String[] keyWords7 = {"highclass", "sale", "trivia"}; //1
		

		Event test1 = new Event("Test number 1", keyWords, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test2 = new Event("Test number 2", keyWords1, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test3 = new Event("Test number 3", keyWords2, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test4 = new Event("Test number 4", keyWords3, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test5 = new Event("Test number 5", keyWords4, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test6 = new Event("Test number 6", keyWords5, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test7 = new Event("Test number 7", keyWords6, start, end, 0.0, 1, TimeUnit.ONEOFF);
		Event test8 = new Event("Test number 8", keyWords7, start, end, 0.0, 1, TimeUnit.ONEOFF);
		int duration = test1.getDurationMins();
		System.out.println("Expected: 1176\nGot: " + duration);
		
		String[] topRank = {"trivia", "food", "social"};
		
		Event[] suggestions = {test1, test2, test3, test4, test5, test6, test7, test8};
		
		Event[] topSuggestions = getTopSuggestions(suggestions, topRank);
		System.out.println(Arrays.toString(topSuggestions));
	}
	
	
	public static int getEventRank(String[] eventKeywords, String[] topTags) {
		int countScore = 0;
		for (int i = 0; i < topTags.length; i++) { //i == index of user's topTags
			for (int j = 0; j < eventKeywords.length; j++) { //j == index of this events keywords
				if(eventKeywords[j].equals(topTags[i])) {
					countScore++;
				}
			}
		}
		
		return countScore;
	}
	
	public static Event[] getTopSuggestions(Event[] eventOptions, String[] topTags) { //ranks events and populates a top-suggestions Event[7]
		int[] eventIndexRank = new int[eventOptions.length];
		int topRankIndex = 0;
		int topRankValue = 0;
		Event[] suggestThese = new Event[7];
		for (int i = 0; i < eventOptions.length; i++) {
			eventIndexRank[i] = getEventRank(eventOptions[i].getKeyWords(), topTags);
			if (eventIndexRank[i] > topRankValue) {
				topRankValue = eventIndexRank[i];
				topRankIndex = i;
			}
		}
		suggestThese[0] = eventOptions[topRankIndex];
		eventIndexRank[topRankIndex] = 0;
		for (int j = 1; j < 7; j++) {
			int index = findMax(eventIndexRank);
			suggestThese[j] = eventOptions[index];
			eventIndexRank[index] = -1; //here
		}
		return suggestThese;
	}
	
	public static int findMax(int[] list) {
		int currentMax = list[0];
		int maxIndex = 0;
		for(int i = 0; i < list.length; i++) {
			if(list[i] >= currentMax) {
				currentMax = list[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}


}
