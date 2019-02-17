/**
 * 
 */
package schedule;

/**
 * @author E
 *
 */
public class RankMe {
	private Event[] allEvents;
	private Event[] topSuggestions;
	
	
	private int getEventRank(String[] eventKeywords, String[] topTags) {
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
	
	public Event[] getTopSuggestions(Event[] eventOptions, String[] topTags) { //ranks events and populates a top-suggestions Event[7]
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
	
	private int findMax(int[] list) {
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
