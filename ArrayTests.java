import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input = {3,4,5};
    int[] reversedInput = {5,4,3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{5,4,3},reversedInput);
	}


  @Test
  public void testReversed() {
    int[] input1 = {4,3,2};
    System.out.print(ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{2,3,4}, ArrayExamples.reversed(input1));
  }
}
