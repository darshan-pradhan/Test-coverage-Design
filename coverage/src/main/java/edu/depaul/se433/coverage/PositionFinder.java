package edu.depaul.se433.coverage;

/**
 * Find the position of x in an array of non-negative
 * integers.  If the search value is negative, return
 * position as -1
 */
public class PositionFinder {
  
  public int findPosition(int[] a, int x) {
    if (a != null && a.length > 0) {
      int position = -1;
      for (int i = 0; i < a.length; i++) {
        if (matches(a[i], x)) {
          position = i;
          break;
        }
      }
      return position;
    }
    throw new IllegalArgumentException();
  }

  private boolean matches(int fromList, int target) {

    // Rule: item we're looking for must be non-negative
    if (target >= 0) {
      return fromList == target;
    } else {
      return false;
    }
  }
}
