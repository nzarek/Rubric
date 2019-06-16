import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class rubricTest1 {

	@Test
	void testSetFormat() {
		rubric rubricBoundaryObject = new rubric(0, 0, 0);
		rubricBoundaryObject.setFormat(0);// Boundary value set to 0
		rubricBoundaryObject.setRelevance(3);
		rubricBoundaryObject.setSubstance(4);
		rubricBoundaryObject.getFormat();
		System.out.println("The Format value is on the boundary of the range and is set to " + rubricBoundaryObject.getFormat());
		assertEquals(rubricBoundaryObject.getFormat(), 0);
		//fail("Not yet implemented");
	}

	@Test
	void testSetRelevance() {
		rubric rubricErrorObject = new rubric(0, 0, 0);
		rubricErrorObject.setFormat(2);
		rubricErrorObject.setRelevance(8);// Error value out of range set to 8
		rubricErrorObject.setSubstance(6);
		rubricErrorObject.getRelevance();
		System.out.println("Error! The Relevance value is out of range and is set to  " + rubricErrorObject.getRelevance());
		assertEquals(rubricErrorObject.getRelevance(), 8);
		//fail("Not yet implemented");
	}

	@Test
	void testSetSubstance() {
		rubric rubricNormalObject = new rubric(0, 0, 0);
		rubricNormalObject.setFormat(3); 
		rubricNormalObject.setRelevance(3);
		rubricNormalObject.setSubstance(8); // Normal value within range set to 8
		rubricNormalObject.getSubstance();
		System.out.println("The Substance value is within acceptable range and is set to " + rubricNormalObject.getSubstance());
		assertEquals(rubricNormalObject.getSubstance(), 8);
		//fail("Not yet implemented");
	}

}
