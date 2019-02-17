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
	private Label label;
	private String[] keyWords;
	private String description;
	private int[] date = new int[7];
	private double cost;
	private int durationMins;
	private int frequencyCount;
	private TimeUnit frequencyUnit;
	private int advanceCount;
	private TimeUnit advanceUnit;
	
	public Event() {}
	public Event(String name, Label label, String[] keyWords, String description, 
			int yyyy, int mm, int dd, int sHr, int sMin, int eHr, int eMin,
			double cost, 
			int frequencyCount, TimeUnit frequencyUnit, 
			int advanceCount, TimeUnit advanceUnit) {
		this.name = name;
		this.label = label;
		this.keyWords = keyWords;
		this.description = description;
		setDate(yyyy, mm, dd, sHr, sMin, eHr, eMin);
		setDurationMins();
		this.cost = cost;
		this.frequencyCount = frequencyCount;
		this.frequencyUnit = frequencyUnit;
		this.advanceCount = advanceCount;
		this.advanceUnit = advanceUnit;
	}
	public Event(String name, Label label, String description, 
			int yyyy, int mm, int dd, int sHr, int sMin, int eHr, int eMin,
			int frequencyCount, TimeUnit frequencyUnit, 
			int advanceCount, TimeUnit advanceUnit) {
		this(name, label, null, description,
				yyyy, mm, dd, sHr, sMin, eHr, eMin,
				0.0, 
				frequencyCount, frequencyUnit, 
				advanceCount, advanceUnit);
	}
	public Event(String name, Label label, String description, 
			int yyyy, int mm, int dd, int sHr, int sMin, int eHr, int eMin,
			int advanceCount, TimeUnit advanceUnit) {
		this(name, label, null, description,
				yyyy, mm, dd, sHr, sMin, eHr, eMin,
				0.0, 
				0, null, 
				advanceCount, advanceUnit);
	}
	public Event(String name, Label label, String description, 
			int durationMins, 
			int advanceCount, TimeUnit advanceUnit) {
		this(name, label, description,
				0, 0, 0, 0, 0, 0, 0, 
				advanceCount, advanceUnit);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the date
	 */
	public int[] getDate() {
		return date;
	}
	/**
	 * @return the year
	 */
	public int year() {
		return date[0];
	}
	/**
	 * @return the month
	 */
	public int month() {
		return date[1];
	}
	/**
	 * @return the day
	 */
	public int day() {
		return date[2];
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @return the label
	 */
	public Label getLabel() {
		return label;
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
	 * @param date the date to set
	 */
	public void setDate(int[] date) {
		for(int i = 0; i < 7; i ++) {
			this.date[i] = date[i];
		}
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(int yyyy, int mm, int dd, int startHr, int startMin, int endHr, int endMin) {
		int[] date = {yyyy, mm, dd, startHr, startMin, endHr, endMin};
		for(int i = 0; i < 7; i ++) {
			this.date[i] = date[i];
		}
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(Label label) {
		this.label = label;
	}
	/**
	 * @param keyWords the keyWords to set
	 */
	public void setKeyWords(String[] keyWords) {
		this.keyWords = keyWords;
	}
	/**
	 * @param durationMins the durationMins to set
	 */
	private void setDurationMins() {
		//TODO:
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
