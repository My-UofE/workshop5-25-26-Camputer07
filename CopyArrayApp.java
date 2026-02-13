import java.util.Arrays;
import java.util.ArrayList;

public class CopyArrayApp {
  public static void main(String[] args) {
    int nVals = args.length;

    // to create a new array of ints
    int[] myVals = new int[nVals];

    for (int i = 0; i < nVals; i++) {
        int item = Integer.parseInt(args[i]);
        // to allocate a value into the created array at index i
        myVals[i] = item;
    }

    // Output the contents of the array
    System.out.println("original values: " + Arrays.toString(myVals));

    // Filter out the unique elements in the array
    // Create an ArrayList to hold the unique elements
    ArrayList<Integer> uniqueVals = new ArrayList<>();

    // Loop through the array
    for (int i = 0; i < nVals; i++) {
      if (uniqueVals.contains(myVals[i]) == false) {
        uniqueVals.add(myVals[i]);
      }
    }

    // Output the unique values
    System.out.println("unique values: " + uniqueVals);
  }
}