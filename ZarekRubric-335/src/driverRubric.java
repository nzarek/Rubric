import java.util.Scanner;

/**************************************************************/
/*Program:  Rubric                                            */
/*CSCV 335                                                    */
/*Nicholas Zarek                                              */
/*03/23/2019                                                  */
/*This program totals and validates rubric score entries      */
/**************************************************************/
public class driverRubric {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in); //Scanner to read user input

		//class variables to hold user entered data and pass to rubric class
		int userFormat;
		int userRelevance;
		int userSubstance;
		boolean flag = false;

		rubric rubric1, rubric2, rubric3; //rubric objects
		
	
		System.out.println("Please enter Format Score for Rubric1: ");
		userFormat = scnr.nextInt();

		if (userFormat >= 0 && userFormat <= 5) { //entry validation
			flag = true;
        } else {
        	while (flag == false) {
        		System.out.println("ERROR! Please enter a valid Format Score between 0 and 5: ");
        		userFormat = scnr.nextInt();
        			if (userFormat >= 0 && userFormat <= 5) {
        				flag = true;
        		}
        	}
        }
		
		System.out.println("Please enter Relevance Score for Rubric1: ");
		userRelevance = scnr.nextInt();
		
		flag = false;
		if (userRelevance >= 0 && userRelevance <= 5) { //entry validation
			flag = true;
        } else {
        	while (flag == false) {
        		System.out.println("ERROR! Please enter a valid Relevance Score between 0 and 5: ");
        		userRelevance = scnr.nextInt();
        			if (userRelevance >= 0 && userRelevance <= 5) {
        				flag = true;
        		}
        	}
        }
		
		System.out.println("Please enter Substance Score for Rubric1: ");
		userSubstance = scnr.nextInt();

		flag = false;
		if (userSubstance >= 0 && userSubstance <= 10) { //entry validation
			flag = true;
        } else {
        	while (flag == false) {
        		System.out.println("ERROR! Please enter a valid Substance Score between 0 and 10: ");
        		userSubstance = scnr.nextInt();
        			if (userSubstance >= 0 && userSubstance <= 10) {
        				flag = true;
        		}
        	}
        }

		rubric1 = new rubric(userFormat, userRelevance, userSubstance);
		
		System.out.println("Rubric1 Entries: " + rubric1); //print rubric entries
		System.out.println("Rubric1 Total: " + rubric1.getTotal()); //print rubric total
		
		Thread.sleep(3000); //delay to allow for a break between entering scores for different rubrics
		
		System.out.println("Please enter Format Score for Rubric2: ");
		userFormat = scnr.nextInt();

		flag = false;
		if (userFormat >= 0 && userFormat <= 5) { //entry validation
			flag = true;
        } else {
        	while (flag == false) {
        		System.out.println("ERROR! Please enter a valid Format Score between 0 and 5: ");
        		userFormat = scnr.nextInt();
        			if (userFormat >= 0 && userFormat <= 5) {
        				flag = true;
        		}
        	}
        }
				
		System.out.println("Please enter Relevance Score for Rubric2: ");
		userRelevance = scnr.nextInt();
		
		flag = false;
		if (userRelevance >= 0 && userRelevance <= 5) { //entry validation
			flag = true;
        } else {
        	while (flag == false) {
        		System.out.println("ERROR! Please enter a valid Relevance Score between 0 and 5: ");
        		userRelevance = scnr.nextInt();
        			if (userRelevance >= 0 && userRelevance <= 5) {
        				flag = true;
        		}
        	}
        }
				
		System.out.println("Please enter Substance Score for Rubric2: ");
		userSubstance = scnr.nextInt();

		flag = false;
		if (userSubstance >= 0 && userSubstance <= 10) { //entry validation
			flag = true;
        } else {
        	while (flag == false) {
        		System.out.println("ERROR! Please enter a valid Substance Score between 0 and 10: ");
        		userSubstance = scnr.nextInt();
        			if (userSubstance >= 0 && userSubstance <= 10) {
        				flag = true;
        		}
        	}
        }

		rubric2 = new rubric(userFormat, userRelevance, userSubstance);
		
		System.out.println("Rubric2 Entries: " + rubric2);
		System.out.println("Rubric2 Total: " + rubric2.getTotal());

		Thread.sleep(3000);
		
		System.out.println("Please enter Format Score for Rubric3: ");
		userFormat = scnr.nextInt();
		
		flag = false;
		if (userFormat >= 0 && userFormat <= 5) { //entry validation
			flag = true;
        } else {
        	while (flag == false) {
        		System.out.println("ERROR! Please enter a valid Format Score between 0 and 5: ");
        		userFormat = scnr.nextInt();
        			if (userFormat >= 0 && userFormat <= 5) {
        				flag = true;
        		}
        	}
        }
				
		System.out.println("Please enter Relevance Score for Rubric3: ");
		userRelevance = scnr.nextInt();
		
		flag = false;
		if (userRelevance >= 0 && userRelevance <= 5) { //entry validation
			flag = true;
        } else {
        	while (flag == false) {
        		System.out.println("ERROR! Please enter a valid Relevance Score between 0 and 5: ");
        		userRelevance = scnr.nextInt();
        			if (userRelevance >= 0 && userRelevance <= 5) {
        				flag = true;
        		}
        	}
        }
				
		System.out.println("Please enter Substance Score for Rubric3: ");
		userSubstance = scnr.nextInt();

		flag = false;
		if (userSubstance >= 0 && userSubstance <= 10) { //entry validation
			flag = true;
        } else {
        	while (flag == false) {
        		System.out.println("ERROR! Please enter a valid Substance Score between 0 and 10: ");
        		userSubstance = scnr.nextInt();
        			if (userSubstance >= 0 && userSubstance <= 10) {
        				flag = true;
        		}
        	}
        }

		rubric3 = new rubric(userFormat, userRelevance, userSubstance);
		
		System.out.println("Rubric3 Entries: " + rubric3);
		System.out.println("Rubric3 Total: " + rubric3.getTotal());		
		
			
		
		scnr.close(); //close scanner
		System.out.println("Goodbye!");
	}

}
