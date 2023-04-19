import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testreverseInPlace1(){
    int[] input = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input);
  }

  @Test
  public void testreverseInPlace2(){
    int[] input = {1, 2, 3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{3, 2, 1}, input);
  }

  @Test
  public void testreverse1(){
    int[] input = {5, 6, 7};
    assertArrayEquals(new int[]{7, 6, 5}, ArrayExamples.reversed(input));
  }

  @Test 
  public void testreverse2(){
    int[] input = {5, 6, 7, 8};
    assertArrayEquals(new int[]{8, 7, 6, 5}, ArrayExamples.reversed(input));
  }

  @Test 
  public void testaverageWithoutLowest(){
    double[] input = {3.1, 2.1, 4.5, 5.2};
    assertArrayEquals((3.1+5.2+4.5)/3, ArrayExamples.averageWithoutLowest(input));
  }
}
