package fixed;

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
        String tempsign = "";
        String tempNumeric = origLetter;
        String tempchar = tempNumeric.substring(0, 1);
        try{
            tempsign = tempNumeric.substring(1, 2);
        } catch(Exception e) {
            ;
        }
		if (tempchar.equals("A")){
            newNumeric = 3.5;
        } else if (tempchar.equals("B")){
            newNumeric = 2.5;
        } else if (tempchar.equals("C")){
            newNumeric = 1.5;
        } else if (tempchar.equals("D")){
            newNumeric = 0.5;
        }
        if (tempsign == "+"){
            newNumeric += 0.35;
        } else if (tempsign == "-"){
            newNumeric -= 0.35;
        }

        System.out.println("\n\n\n\n\n" + tempchar + " " + tempsign + " " + newNumeric + "\n\n\n\n\n");

    }

      //Complete the other cases

	// Mutator method for new letter grade
	private void setNewLetter() {

        if (origNumeric <= 1){
            newLetter = "F";
        } else if (origNumeric <= 2){
            newLetter = "D";
        } else if (origNumeric <= 3){
            newLetter = "C";
        } else if (origNumeric <= 4){
            newLetter = "B";
        } else {
            newLetter = "A";
        }
        int tempNumeric = (int)(origNumeric*10);
        System.out.println(tempNumeric + " " + tempNumeric%100 + origNumeric);
        if (tempNumeric%100 <= 15){
            newLetter = (newLetter + "-");
        } else if (tempNumeric%100 >= 85){
            newLetter = (newLetter + "+");
        }
		  //Complete the other cases
    
    }

	// Accessor method for new numeric grade
	public double getNewNumeric() {
        return newNumeric;
	}

	// Accessor method for new letter grade
	public String getNewLetter()
	{
        return newLetter;


	}
}