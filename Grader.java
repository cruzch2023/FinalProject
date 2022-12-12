@@ -0,0 +1,70 @@
/* This class accepts a letter grade A-F
   and a numeric grade 0 - 4 and converts
   the letter grade to a numeric grade and
   the numeric grade to a letter grade.
*/

public class Grade
{
	// Instance fields
	private String origLetter;
	private double newNumeric;

	private double origNumeric;
	private String newLetter;

	// Default constructor
	public Grade()
	{
		origLetter = "";
		origNumeric = 0;
		newLetter = "";
		newNumeric = 0;
	}

	// Parametric constructor
	public Grade(String oldLetter, double oldNumeric)
	{
		origLetter = oldLetter;
		origNumeric = oldNumeric;

		setNewNumeric();
		setNewLetter();
	}

	// Mutator method for new numeric grade
	private void setNewNumeric()
	{
		if (origLetter.substring(0, 1).equals("A"))
		{
			newNumeric = 4;
		}
		else if (origLetter.substring(0, 1).equals("B"))

      //Complete the other cases

	// Mutator method for new letter grade
	private void setNewLetter()
	{
		if (origNumeric == 4)
		{
			newLetter = "A+";
		}
		else if (origNumeric <= 3.99 && origNumeric >= 3.85)
		{
			newLetter = "A";
		}
		  //Complete the other cases

	// Accessor method for new numeric grade
	public double getNewNumeric()
	{
		//complete this method
	}

	// Accessor method for new letter grade
	public String getNewLetter()
	{
		//complete this method
	}
}
