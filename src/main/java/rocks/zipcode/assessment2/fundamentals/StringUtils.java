package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        String left = "";

        for (int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            left += " ";
        }

        left += stringToBePadded;
        return left;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        String right = "";
        right += stringToBePadded;
        for (int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            right += " ";
        }

        return right;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

        StringBuilder repeat = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++) {
            repeat.append(stringToBeRepeated);
        }

    String string = repeat.toString();
        return string;
    }


    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {
        //int i = 0;
        //for (i = 0; i < string.length(); i++)
            //if char.isletter(string.charAt(i));
        return null;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        return null;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return null;
    }
}
