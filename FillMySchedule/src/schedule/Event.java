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
	private int[] date = new int[7];
	private double cost;
	private Label label;
	private String[] keyWords;
	private int durationMins;
	private int frequencyCount;
	private TimeUnit frequencyUnit;
	private String description;
	private int advanceCount;
	private TimeUnit advanceUnit;
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
		this.date = date;
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
	public void setDurationMins(int durationMins) {
		this.durationMins = durationMins;
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
