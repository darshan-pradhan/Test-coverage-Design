package edu.depaul.se433.coverage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PositionFinderTest {

  private PositionFinder finder = new PositionFinder();

  /**
   * a = null
   */
  @Test
  @Disabled
  @DisplayName("expect an exception if list is null")
  public void null_should_throw_exception() {

    assertThrows( IllegalArgumentException.class, () -> finder.findPosition(null, 5));
  }

  /**
   * a = {}
   */
  @Test
  @DisplayName("expect an exception if list is empty")
  public void test_invalid_array() {
    int[] a = new int[] {};
    assertThrows( IllegalArgumentException.class, () -> finder.findPosition(a, 5));
  }

  /**
   * a = {2}
   */
  @Test
  @DisplayName("should return -1 when item not found")
  public void test_not_there_array() {
    int[] a = new int[] {2};
    int pos = finder.findPosition(a, 5);
    assertEquals(-1, pos);
  }

  /**
   * a = {5}
   */
  @Test
  @Disabled
  @DisplayName("should return correct index when only 1 item")
  public void test_is_there_array() {
    int[] a = new int[] {5};
    int pos = finder.findPosition(a, 5);
    assertEquals(0, pos);
  }

  /**
   * a = {7,0}
   */
  @Test
  //@Disabled("demonstrates boundary test detection")
  @DisplayName("should allow search for zero")
  public void test_zero() {
    int[] a = new int[] {7,0};
    int pos = finder.findPosition(a, 0);
    assertEquals(1, pos);
  }

  /**
   * a = {2, 5}
   */
  @Test
  @Disabled("Removed to demonstrate coverage tools")
  @DisplayName("should return correct position of found item")
  public void test_together_array() {
    int[] a = new int[] {2,5};
    int pos = finder.findPosition(a, 5);
    assertEquals(1, pos);
  }

  /**
   * a = {2, 5, -7}
   */
  @Test
  @Disabled("Removed to demonstrate coverage tools")
  @DisplayName("should return -1 even though item exists")
  public void test_negative_input_value() {
    int[] a = new int[] {2, 5, -7};
    int pos = finder.findPosition(a, -7);
    assertEquals(-1, pos);
  }

  @Test
  @DisplayName("Constructor test")
  public void constructor_works() {
    new PositionFinder();
  }
}
