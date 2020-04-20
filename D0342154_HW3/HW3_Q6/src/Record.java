
public class Record {
	
	private double Quizzes1 = 0;
	private double Quizzes2 = 0;
	private double Quizzes3 = 0;
	private int Midterm = 0;
	private int Final = 0;
	private double Average = 0; 
	private String Grade;
	
	
	public double getQuizzes1() {

		return Quizzes1;
	}

	public void setQuizzes1(double Quizzes1) {

		this.Quizzes1 = Quizzes1;
	}
	public double getQuizzes2() {

		return Quizzes2;
	}

	public void setQuizzes2(double Quizzes2) {

		this.Quizzes2 = Quizzes2;
	}
	
	public double getQuizzes3() {

		return Quizzes3;
	}

	public void setQuizzes3(double Quizzes3) {

		this.Quizzes3 = Quizzes3;
	}
	
	public int getMidterm() {

		return Midterm;
	}

	public void setMidterms(int Midterm) {

		this.Midterm = Midterm;
	}
	
	public int getFinal() {

		return Final;
	}

	public void setFinal(int Final) {

		this.Final = Final;
	}
	
	public double getAverage() {

		return Average;
	}

	public void setFinal(double Average) {

		this.Average = Average;
	}
	
	public void setScore(double Quizzes1,double Quizzes2,double Quizzes3,int Midterm,int Final){
		this.Quizzes1 = Quizzes1;
		this.Quizzes2 = Quizzes2;
		this.Quizzes3 = Quizzes3;
		this.Midterm = Midterm;
		this.Final = Final;
		this.Average =Math.round((Quizzes1+Quizzes2+Quizzes3)*(30/25))+(Midterm*0.35)+(Final*0.4)*100/100;
		
		
	}
	public void Grade(){
		if (Average>=90){
			 Grade ="A";			 
		}
		else if (Average>=80&&Average<90){
			 Grade ="B";			 
		}
		else if (Average>=70&&Average<80){
			 Grade ="C";			 
		}
		else if (Average>=60&&Average<70){
			 Grade ="D";			 
		}
		else {
			 Grade ="F";			 
		}
		
	}
	
	
	
    public String toString() {
		
		return ("Quizzes1: " + Quizzes1 + "\nQuizzes2: " + Quizzes2 + "\nQuizzes3:"+ Quizzes3 +"\nMidterm: " + Midterm + "\nFinal: " + Final + "\nAverage: "+Average+ "\nGrade: " +Grade );
	}
 
	
		
}