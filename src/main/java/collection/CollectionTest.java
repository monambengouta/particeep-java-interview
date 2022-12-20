package collection;

import java.util.List;
import java.util.stream.*;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {

    // safe input
    if (input.isEmpty()) {
      return input.stream()
                  .map(i -> Double.valueOf(i))
                  .collect(Collectors.toList());
    }
    return input.stream()
                .map(x -> Math.pow(((x * 2) + 3), 5))
                .map(i -> Double.valueOf(i))
                .collect(Collectors.toList());
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    //safe input
    if (input.isEmpty()) {
      return input;
    }
    
    return input.stream()
                .map( x -> (x.length() == 0) ? x : (String)x.substring(0, 1).toUpperCase() + x.substring(1) + x.substring(0, 1).toUpperCase() + x.substring(1))
                .collect(Collectors.toList());
  }

}
