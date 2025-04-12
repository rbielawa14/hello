/**
 * The main part of the calculator doing the calculations.
 * 
 * @author: Rachael Bielawa
 * @version 1.1
 */
public class CalcEngine
{
    // Put instance variables here.
    private int displayValue; //The current value being shown in the display.
    private int previousValue; //The last value entered.
    private String currentOperator; //The last operator entered.

    /**
     * Creates a new CalcEngine.
     */
    public CalcEngine()
    {
        displayValue = 0;
        previousValue = 0;
        currentOperator = "";
    }

    /**
     * @return The value that should currently be displayed
     * on the calculator display.
     */
    public int getDisplayValue()
    {
        return displayValue;
    }

    /**
     * A number button was pressed.
     * Either start a new operand, or incorporate this number as
     * the least significant digit of an existing one.
     * @param number The number pressed on the calculator.
     */
    public void numberPressed(int number)
    {
        //Builds numbers from digits pressed on the calculator display.
        displayValue = displayValue * 10 + number; 
    }
    
    /**
     * The 'plus' button was pressed. 
     */
    public void plus()
    {
        applyOperator("+");
    }

    /**
     * The 'minus' button was pressed.
     */
    public void minus()
    {
        applyOperator("-");
    }

    /**
     * The '=' button was pressed.
     */
    public void equals()
    {
        calculateResult(); 
        currentOperator = ""; //Resets the operator after calculation. 
    }
    
    /**
     * Calculates the results of different operations, called upon when "="
     * is pressed, in equals().
     */
    private void calculateResult() {
        //Determines, and then performs, the proper calculations.
        if (currentOperator.equals("+")) {
            //Addition, in response to the "+" being pressed.
            displayValue = previousValue + displayValue;
        }
        else if (currentOperator.equals("-")) {
            //Subtraction, in response to the "-" being pressed.
            displayValue = previousValue - displayValue;
        }
        previousValue = 0; //Resets the previousValue after calculation.
    }
    
    /**
     * Handles operators when pressed. 
     */
    private void applyOperator(String operator)
    {
        //Checks if an operator has already been stored.
        if (!currentOperator.isEmpty()) {
            calculateResult();
        }
        //Stores values and operator in the correct variables/state. 
        previousValue = displayValue; 
        displayValue = 0;
        currentOperator = operator;
    }

    /**
     * The 'C' (clear) button was pressed.
     */
    public void clear()
    {
        //Resets all variables.
        displayValue = 0;
        previousValue = 0;
        currentOperator = "";
    }

    /**
     * @return The title of this calculation engine.
     */
    public String getTitle()
    {
        return "Calculator with GUI";
    }

    /**
     * @return The author of this engine..
     */
    public String getAuthor()
    {
        return "Written by Rachael Bielawa";
    }

    /**
     * @return The version number of this engine. .
     */
    public String getVersion()
    {
        return "Version 1.1";
    }
}
