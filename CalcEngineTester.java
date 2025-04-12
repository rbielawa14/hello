
/**
 * Test the CalcEngine class.
 * 
 * @author Rachael Bielawa 
 * @version 1.1
 */
public class CalcEngineTester
{
    // The engine to be tested.
    private CalcEngine engine; 

    /**
     * Constructor for objects of class CalcEngineTester
     */
    public CalcEngineTester()
    {
        engine = new CalcEngine();
    }
    
    /**
     * Test everything (both addition and subtraction).
     */
    public void testAll()
    {
        //Outputs the proper messages while testing:
        System.out.println("Testing the addition operation.");
        System.out.println("The result is: " + testPlus());
        System.out.println("Testing the subtraction operation.");
        System.out.println("The result is: " + testMinus());
        //Outputs the proper message after testing;
        if ((testPlus() == 7) && (testMinus() == 5)) { 
            //If both testPlus and testMinus return the correct value:
            System.out.println("All tests passed."); 
        }
        else if ((testPlus() != 7) && (testMinus() != 5)) {
            //If neither testPlus nor testMinus return the correct value:
            System.out.println("All operations failed in testing.");
        }
        else if ((testPlus() == 7) && (testMinus() != 5)) {
            //If testPlus returns the right value but testMinus doesn't:
            System.out.println("The subtraction operation test failed.");
        }
        else if ((testPlus() != 7) && (testMinus() == 5)) {
            //If testMinus returns the right value but testPlus doesn't:
            System.out.println("The addition operation test failed.");
        }
    }

    /**
     * Test the plus operation of the engine.
     * @return the result of calculating 3+4.
     */
    public int testPlus()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the presses: 3 + 4 =
        engine.numberPressed(3);
        engine.plus();
        engine.numberPressed(4);
        engine.equals();
        // Return the result, which should be 7.
        return engine.getDisplayValue(); 
    } 
    

    /**
     * Test the minus operation of the engine.
     * @return the result of calculating 9 - 4.
     */
    public int testMinus()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the presses: 9 - 4 =
        engine.numberPressed(9);
        engine.minus();
        engine.numberPressed(4);
        engine.equals();
        // Return the result, which should be 5.
        return engine.getDisplayValue();
    }
}
