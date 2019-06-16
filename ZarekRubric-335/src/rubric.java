import java.util.Scanner;

public class rubric {

	Scanner scnr = new Scanner(System.in);//Scanner to read user input
	
	//class variables to hold an pass user data
	private int format;
	private int relevance;
	private int substance;
	private int total;
	
	
	//constructor
	rubric(int format, int relevance, int substance) {
		setFormat(format);
		setRelevance(relevance);
		setSubstance(substance);
		total = this.format + this.relevance + this.substance;
	}
	
	//get and set methods
	public int getFormat() {
		return format;
	}

	public void setFormat(int format) {
		this.format = format;
	}

	public int getRelevance() {
		return relevance;
	}

	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}

	public int getSubstance() {
		return substance;
	}

	public void setSubstance(int substance) {
		this.substance = substance;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void rubricTotal() { //total summation 
		setTotal(getFormat()+getRelevance()+getSubstance());
	}
	public String toString(){  //to string buffer
		  return format + " " + relevance + " " + substance; 
	}
}
