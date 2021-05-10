package programmingConstructs;

import java.util.Arrays;

public class usingForEachLoop {
    /*
     *this is a special type of for each loop; used for iterating through each element of array or collections
     * can only be used for reading the data not writing
     * it's considered to be more easier than for loop
     */

    public static void main(String[] args) {
        int[] numbersList = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbersList));
        int sumOfNumbers = 0;

        numberList.forEach(e -> sumOfNumbers + e);
        System.out.println("Sum of numbers = " + sumOfNumbers);
    }
}
