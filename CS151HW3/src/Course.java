/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * Course class
 * <p>
 * 
 * This is the course class which
 * 
 * </p>
 * 
 */

public class Course implements Cloneable {

	//variables
	String coursename;
	String description;
	String department;
	String timestart;
	String weekday;
	
	public Course(String coursename, String description, String department, String timestart, String weekday) {
		
		this.coursename = coursename;
		this.department = department;
		this.description = description;
		this.timestart = timestart;
		this.weekday = weekday;
	}


	
	//getters setters
	public String getCoursename() {
		return coursename;
	}


	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getTimestart() {
		return timestart;
	}


	public void setTimestart(String timestart) {
		this.timestart = timestart;
	}


	public String getWeekday() {
		return weekday;
	}


	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}
	
	protected Object clone() throws CloneNotSupportedException{		
		return super.clone();
	}
	
}
