package code;

import java.util.ArrayList;

public class PhDCourse implements Course{
	
	private int courseCode;
	private String courseName;
	private String courseArea;
	private String courseInstructor;
	private ArrayList<PhDProgram> phdp = new ArrayList<PhDProgram>();
	
	public String getCourseName() {
		return courseName;
	}
	
	public String getCourseInstructor() {
		return courseInstructor;
	}
	
	public boolean isInProgram(int dc) {
		return false;
	}

	@Override
	public void setInstructorName(String name) {
		// TODO Auto-generated method stub
		
	}
}
