/** Name: Thanadon Boonkeard
 * StudentID: 5988073
 * Section:	1
 */

/* Student is a class that collect registered courses information and subject of interest.
 * The objective of this class is to allow a students to be able to do the following tasks 
 * 
 *  - Register on the course.
 *  - Set scores for a course based on course code
 *  - Calculate the accummulate GPA
 *  - Show the subject that students may fail after the midterm exam
 *  - Method to calculate how much score students need to do to get an A 
 * */

import java.util.ArrayList;

public class Student extends Person {
	
	private ArrayList<String> subjectInterest;
	private ArrayList<RegCourse> registeredCourses = new ArrayList<RegCourse>();
	
	// Constructor
	public Student(String firstName, String lastName, int age, char gender) {
		//CODE HERE
		super(firstName, lastName, age, gender);
	}
	
	//Printing Students basic information @Overriding
	public void printInfo(){
		//CODE HERE
		super.printInfo();
		System.out.println("\n[Registered Courses]");
		for(RegCourse i: registeredCourses){
			i.printCourseInfo();
		}
		
	}
	
	//Method for students to register course
	public void RegisterCourse(RegCourse a){
		//CODE HERE
		registeredCourses.add(a);
	}
	
	//Method for student to add RAW scores on particular course code 
	public void setAllScore(String cCode, int attScore, int quiScore, int proScore,int miScore, int fiScore) {
		//CODE HERE
		//cCode, attendance,quiz, project, midterm and final score
		for(RegCourse i: registeredCourses){
			if(i.getCourseCode().equals(cCode)){
				i.setAttendance(attScore);
				i.setQuiz(quiScore);
				i.setProjects(proScore);
				i.setMidScore(miScore);
				i.setFinalScore(fiScore);
			}
		}
		
	}
	
	//Method for converting accumulate score to an alphabet GRADE (e.g., A, B, C, D, F)
	// A=4.0, B=3.0, C=2.0, D=1.0, F=0.0
	public char Grading(RegCourse a){
		//CODE HERE
		char grade = 'N';
		switch((int)accumGPA()){
		case 4: grade = 'A'; break;
		case 3: grade = 'B'; break;
		case 2: grade = 'C'; break;
		case 1: grade = 'D'; break;
		case 0: grade = 'F'; break;
		}
		return grade;
	}
	
	// Method for calculating accumulate GPA (only applied for completed courses)
	// The Accumulate GPA is calculated by (1) multiply each numeric grade value 
	// by the number of credits the course was defined. (2) add these number together  
	// (3) Divided this number by total number of credit a student took (only the completed course)
	public double accumGPA(){	
		double finalgpa = 0.0;
		//CODE HERE
		
		return finalgpa;
	}
	
	// Method for checking and printing course that students may have problems
	// The severe subject is calculated by accumulate score < half of a current full score
	// E.g., Assume that  the Object-Oriented programming has grading criteria as attendance=10%, quiz=10%, project=20%, midterm=30%, final=30% 
	// Currently your score is attendance=50/100, quiz=4/10, project=45/100, midterm 48/100, finalexam = 0/100 (haven't done final exam) .
	// The accumulate score = (50*10)/100 + (4*10)/10 + (45*20)/100 + (48*30)/100 + 0 
	//	                    =  5 + 4 + 9 + 14.4 + 0  = 32.4
	// Therefore, the accumulate score (32.4) less than half of a current grading criteria score which is (35)
	// Student may have a problem with this subject at the end of the course (after final exam).
	public void severeSubject(){
		//CODE HERE
		for(RegCourse i: registeredCourses){
			
		}
	}

	// Method to calculate on how much score a student need to work on to get an A on a given course
	// To get an 'A', students must have score more than 80%
	public void howToGetASubject(String cCode){
		//CODE HERE
		
	}
	
	//Method to lists all instructors that teach the registered subjects
	public void relevantInstructor(ArrayList<Instructor> listINS){
		//CODE HERE
		System.out.println("[Relevant Instructor]");
		for(Instructor i: listINS){
			System.out.println(i.getFirstName()+" "+i.getLastName());
		}
	}

}
