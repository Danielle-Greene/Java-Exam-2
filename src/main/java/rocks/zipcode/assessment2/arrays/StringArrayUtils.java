package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        String[] array2 = new String[endingIndex - startingIndex];

        for(int i = 0; i < endingIndex - startingIndex; i++){

            array2[i] = arrayToBeSpliced[startingIndex + i];
        }

        return array2;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {


        return getSubArray(arrayToBeSpliced, startingIndex, arrayToBeSpliced.length);
    }
}
