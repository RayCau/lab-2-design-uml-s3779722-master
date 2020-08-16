package code;

import java.util.ArrayList;

public class PhDProgram {
	
	private int deptCode;
	private PartTimeStudent pts;
	private ArrayList<FullTimeStudent> fts = new ArrayList<FullTimeStudent>();
	private ArrayList<PhDThesis> phdt = new ArrayList<PhDThesis>();
	private ArrayList<PhDCourse> phdc = new ArrayList<PhDCourse>(6);
	

	public void registerCourse(PhDCourse PhDCourse) {
		if(phdc.size() < 10) {
			phdc.add(PhDCourse);
		}else {
			//TODO
		}
	}
	
	public void registerThesis(PhDThesis PhDThesis) {
		//TODO 
	}
}
