/**
 * The main part of the calculator doing the calculations.
 * 
 * @author: Rachael Bielawa
 * @version 1.1
 */
public class CalcEngine
{
    // Put instance variables here.
    private int displayValue;
    private int previousValue;
    private String currentOperator;

    /**
     * Create a CalcEngine.
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
        if (currentOperator.isEmpty()) {
            displayValue = displayValue * 10 + number;
        } 
        else {
            previousValue = displayValue;
            displayValue = number;
            currentOperator = ""; 
        }
    }
    
    private void applyOperator()
    {
        if (currentOperator.equals("+")) {
            displayValue = previousValue + displayValue;
        }
        else if (currentOperator.equals("-")) {
            displayValue = previousValue - displayValue;
        }
    }
    /**
     * The 'plus' button was pressed. 
     */
    public void plus()
    {
        applyOperator();
        currentOperator = "+";
        previousValue = displayValue;
        displayValue = 0;
    }

    /**
     * The 'minus' button was pressed.
     */
    public void minus()
    {
        applyOperator();
        currentOperator = "-";
        previousValue = displayValue;
        displayValue = 0;
    }

    /**
     * The '=' button was pressed.
     */
    public void equals()
    {
        applyOperator();
        currentOperator = "";
    }

    /**
     * The 'C' (clear) button was pressed.
     */
    public void clear()
    {
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
     * @return The author of this engine. This string is displayed as it is,
     * so it should say something like "Written by H. Simpson".
     */
    public String getAuthor()
    {
        return "Written by Rachael Bielawa";
    }

    /**
     * @return The version number of this engine. This string is displayed as 
     * it is, so it should say something like "Version 1.1".
     */
    public String getVersion()
    {
        return "Version 1.1";
    }
}
