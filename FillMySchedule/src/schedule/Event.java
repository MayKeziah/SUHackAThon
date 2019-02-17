/**
 * 
 */
package schedule;

/**
 * @author E
 *
 */
public class Event {
	private String name;
	private String[] keyWords;
	private String description;
	private Time start;
	private Time end;
	private double cost;
	private int durationMins;
	private int frequencyCount;
	private TimeUnit frequencyUnit;
	private int advanceCount;
	private TimeUnit advanceUnit;
	
	public Event() {}
	public Event(String name, String[] keyWords, String description, 
			Time start, Time end,
			double cost, 
			int frequencyCount, TimeUnit frequencyUnit, 
			int advanceCount, TimeUnit advanceUnit) {
		this.name = name;
		this.keyWords = keyWords;
		this.description = description;
		this.start = start;
		this.end = end;
		setDurationMins();
		this.cost = cost;
		this.frequencyCount = frequencyCount;
		this.frequencyUnit = frequencyUnit;
		this.advanceCount = advanceCount;
		this.advanceUnit = advanceUnit;
	}
	public Event(String name, String description, 
			Time start, Time end,
			int frequencyCount, TimeUnit frequencyUnit, 
			int advanceCount, TimeUnit advanceUnit) {
		this(name, null, description,
				start, end, 0.0,
				frequencyCount, frequencyUnit, 
				advanceCount, advanceUnit);
	}
	public Event(String name, String description, 
			Time start, Time end,
			int advanceCount, TimeUnit advanceUnit) {
		this(name, null, description,
				start, end,
				0.0, 
				0, null, 
				advanceCount, advanceUnit);
	}
	public Event(String name, String description, 
			int durationMins, 
			int advanceCount, TimeUnit advanceUnit) {
		this(name, description,
				null, null, 
				advanceCount, advanceUnit);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the start
	 */
	public Time getStart() {
		return start;
	}
	/**
	 * @return the start
	 */
	public Time getEnd() {
		return end;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @return the keyWords
	 */
	public String[] getKeyWords() {
		return keyWords;
	}
	/**
	 * @return the durationMins
	 */
	public int getDurationMins() {
		return durationMins;
	}
	/**
	 * @return the frequencyCount
	 */
	public int getFrequencyCount() {
		return frequencyCount;
	}
	/**
	 * @return the frequencyUnit
	 */
	public TimeUnit getFrequencyUnit() {
		return frequencyUnit;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @return the advanceCount
	 */
	public int getAdvanceCount() {
		return advanceCount;
	}
	/**
	 * @return the advanceUnit
	 */
	public TimeUnit getAdvanceUnit() {
		return advanceUnit;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @param keyWords the keyWords to set
	 */
	public void setKeyWords(String[] keyWords) {
		this.keyWords = keyWords;
	}
	/**
	 * @param hour the hour to convert
	 */
	private int convertMilitaryTime(int hour) {
		if (end.getAmPm().equals(AmPm.PM)) {
			hour += 12;
		}
		return hour;
	}
	/**
	 * @param durationMins the durationMins to set
	 */
	private int setDurationMins() {
	    int tempMins = end.getMin() - start.getMin();
	    int tempHrs = convertMilitaryTime(end.getHour()) - convertMilitaryTime(start.getHour());
	    tempHrs *= 60;
	    tempMins += tempHrs;
	    return tempMins;
	}
	/**
	 * @param frequencyCount the frequencyCount to set
	 */
	public void setFrequencyCount(int frequencyCount) {
		this.frequencyCount = frequencyCount;
	}
	/**
	 * @param frequencyUnit the frequencyUnit to set
	 */
	public void setFrequencyUnit(TimeUnit frequencyUnit) {
		this.frequencyUnit = frequencyUnit;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @param advanceCount the advanceCount to set
	 */
	public void setAdvanceCount(int advanceCount) {
		this.advanceCount = advanceCount;
	}
	/**
	 * @param advanceUnit the advanceUnit to set
	 */
	public void setAdvanceUnit(TimeUnit advanceUnit) {
		this.advanceUnit = advanceUnit;
	}
	
}
