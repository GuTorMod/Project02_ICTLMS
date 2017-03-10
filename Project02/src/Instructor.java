/** Name: Thanadon Boonkeard
 * StudentID: 5988073
 * Section:	1
 */

import java.util.*;

public class Instructor extends Person {

	private ArrayList<Integer> skill;
	private ArrayList<String> researchInterest;
	private ArrayList<RegCourse> teaching = new ArrayList<RegCourse>();;
	
	public Instructor(String firstName, String lastName, int age, char gender) {
	//CODE HERE
		super(firstName, lastName, age, gender);
	}
	
	//Other relevant methods should be defined here
	
	//add a teaching course
	public void setTeaching(RegCourse course) {
	//CODE HERE
		teaching.add(course);
	}
	
    //Printing Instructor information @Overridding
    public void printInfo(){
    //CODE HERE
    	super.printInfo();
    }
}
