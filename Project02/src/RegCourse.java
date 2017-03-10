/** Name: Thanadon Boonkeard
 * StudentID: 5988073
 * Section:	1
 */

/* RegCourse is a class that collect information about registered course of each student.
 * This class extends from the class Course which contain basic course information
 * that are courseCode, courseName, courseCredit, Percentage of grading criteria
 * and Full score of each criteria.
 * 
 * The RegCourse need to collect more specific information about the scores of each student regarding
 * the grading criteria which are quiz, attendance, projects, midScore, finalScore. The detail of these information
 * are provided below.
 * */
public class RegCourse extends Course {
	
	private double quiz;
	private double attendance;
	private double projects;
	private double midScore;
	private double finalScore;
	
	private double accumScore; 
	private double totalFullScore;
	private boolean completedCourse;
	//Store the attendance[0],quiz[1], project[2], midterm[3] and final[4] score
	private double[] n = new double[5];
	//Constructor to setup an object of a registered course
	RegCourse(String code, String cname, boolean core, int cCredit)
	{
		//CODE HERE
		super(code, cname, core, cCredit);
		accumScore = 0.0;
		totalFullScore = 0.0;
	}
	
	//Other relevant methods should be defined here
	
	//Printing Course Information 
	public void printCourseInfo()
	{
		//CODE HERE
		System.out.println(super.getCourseCode()+" - "+super.getCourseName());
	}

	public double getQuiz() 
	{
		return quiz;
	}

	public void setQuiz(double quiz) 
	{
		this.quiz = quiz;
	}

	public double getAttendance() 
	{
		return attendance;
	}

	public void setAttendance(double attendance)
	{
		this.attendance = attendance;
	}

	public double getProjects() 
	{
		return projects;
	}

	public void setProjects(double projects) 
	{
		this.projects = projects;
	}

	public double getMidScore() 
	{
		return midScore;
	}

	public void setMidScore(double midScore) 
	{
		this.midScore = midScore;
	}

	public double getFinalScore() 
	{
		return finalScore;
	}

	public void setFinalScore(double finalScore)
	{
		this.finalScore = finalScore;
	}

	public double getAccumScore() 
	{
		return accumScore;
	}

	public void setAccumScore(double accumScore) 
	{
		this.accumScore = accumScore;
	}
	
	public void setFullScore(double full_score_attendance, double full_score_quiz, double  full_score_projects, double full_score_midScore, double full_score_finalScore)
	{
		super.setFullScore(full_score_attendance, full_score_quiz, full_score_projects, full_score_midScore, full_score_finalScore);
		this.n[0] = full_score_attendance;
		this.n[1] = full_score_quiz;
		this.n[2] = full_score_projects;
		this.n[3] = full_score_midScore;
		this.n[4] = full_score_finalScore;
	}
	
	public void setCourseGrading(int attendancePercent, int quizPercent, int projPercent, int midtermPercent, int finalPercent)
	{
		super.setCourseGrading(attendancePercent, quizPercent, projPercent, midtermPercent, finalPercent);
	}
	
	public boolean checkCompleteCourse(){
		for(int i = 0 ; i < n.length ; i++){
			if(n[i]==0){
				this.completedCourse = false;
			}
		}
		return completedCourse;
	}
}
