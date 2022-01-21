import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        int programComplete = 0;
        final double squareFeetPerGallons = 350.0;
        
        while (programComplete == 0) {
		    try {
		    	// Implement a do-while loop to ensure input is valid
		    	// Prompt user to input wall's height
		    	System.out.println("Enter wall height (feet): ");
		    	wallHeight = scnr.nextDouble();
		    	
		    	// Error-checking, wall height greater than 0
		    	if (!(wallHeight > 0)) {
		    		throw new Exception("Invalid height.");
		    	}
		    	
		    	
		    	// Implement a do-while loop to ensure input is valid
		    	// Prompt user to input wall's width
		    	System.out.println("Enter wall width (feet): ");
		    	wallWidth = scnr.nextDouble();
		    	
		    	// Error-checking, wall width greater than 0
		    	if (!(wallWidth > 0)) {
		    		throw new Exception("Invalid width.");
		    	}
		
		    	// Calculate and output wall area
		    	wallArea = wallHeight * wallWidth;
		    	System.out.println("Wall area: " + wallArea + " square feet");
		
		    	// Calculate and output the amount of paint (in gallons) needed to paint the wall
		    	gallonsPaintNeeded = wallArea/squareFeetPerGallons;
		    	System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
		    	programComplete++;
		
		    }
		    catch (Exception excpt) {
		    	// Prints the error message passed by throw statement
		    	System.out.println(excpt.getMessage());
		    	System.out.println("Please retry inputs.\n");
		    	scnr.nextLine(); // Needed to clear scanner
		    	continue;
		    }
        }
    }
}

