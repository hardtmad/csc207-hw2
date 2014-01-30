package hardtStrainDewey;

import static org.junit.Assert.*;
import hardtStrainDewey.TwoA;

import org.junit.Test;


public class TestTwoA
{
  @Test
  public void
    test_isMultiple ()
  {
    for (int i = -1000; i < 1000; i += 10)
      {
        for (int j = -1000; j < 1000; j += 10)
          {
            assertEquals("isMulitiple " + (i*j) + j, true, TwoA.isMultiple(i*j, j));
          }
      }
    
    for (int i = -1000; i < 1000; i += 10)
      {
        assertEquals("is Multiple test 2", false, TwoA.isMultiple(i+1, 2));
      }
  }//isMultiple test
  
  @Test
  public void 
    test_isOdd ()
  {
    for (int i = -10000; i < 10000; i += 10)
      {
        assertEquals("isOdd test " + i, false, TwoA.isOdd(i));
      }
    for (int j = -10001; j < 9999; j += 10)
      {
        assertEquals("isOdd test 2", true, TwoA.isOdd(j));
      }
  }//isOdd test
  
  @Test
  public void 
    test_oddSumTo ()
  {
    int sum = 0;
    int numAdded = 1;
    for (int i = 0; i < 1000; i+=2)
      { 
        assertEquals("oddSumTo test " + i, sum, TwoA.oddSumTo(i));
        assertEquals("oddSumTo test " + i, sum, TwoA.oddSumTo(i+1));
        sum += numAdded;
        numAdded += 2; 
      }
  }//oddSumTo test
  
  @Test
  public void 
    test_isOddProd ()
  {
    //three odd
    assertEquals("isOddProd test", true, TwoA.isOddProd(new int[] {3241, 45423, 7}));
    //two odd, two even
    assertEquals("isOddProd test", true, TwoA.isOddProd(new int[] {1, 2, 3, 4}));
    //three odd, five even
    assertEquals("isOddProd test", true, TwoA.isOddProd(new int[] {59837, 4902, 0, 3247, 28937432, 492, 42 ,1763}));
    //four odd
    assertEquals("isOddProd test", true, TwoA.isOddProd(new int[] {7541, 628420981, 5, 903}));
    //one odd, three even
    assertEquals("isOddProd test", false, TwoA.isOddProd(new int[] {523, 90582, 356, 84}));
    //six even
    assertEquals("isOddProd test", false, TwoA.isOddProd(new int[] {50, 902, 592, 50820598, 424, 34}));
  
      }//isOddProd test
  
  @Test
  public void
    test_allDistinct ()
  {
    assertEquals("allDistinct test 1", true, TwoA.allDistinct(new int[] {563, -2432, 61, 742, -523}));
    assertEquals("allDistinct test 2", true, TwoA.allDistinct(new int[] {5, 50, 500, 5000}));
    assertEquals("allDistinct test 3", true, TwoA.allDistinct(new int[] {9999999, 9999998, 9223373, 9223372}));
    assertEquals("allDistinct test 4", true, TwoA.allDistinct(new int[] {0, 598, -598}));
    assertEquals("allDistinct test 5", false, TwoA.allDistinct(new int[] {0, 324, -52, 25, 6, 0}));
    assertEquals("allDistinct test 6", false, TwoA.allDistinct(new int[] {52, 52, -52, 92, 53, 1256445, 52}));
  }//allDistinct test

  @Test 
  public void
    test_reverseInts ()
  {
    //4 positive
    assertArrayEquals("reverseInts test 1", new int[] {23, 8764, 43, 2}, TwoA.reverseInts(new int[] {2, 43, 8764, 23}));
    
    // 3 positive, 2 negative
    assertArrayEquals("reverseInts test 2", new int[]{34, -423, 877564, 63, -5432}, TwoA.reverseInts(new int[] {-5432, 63, 877564, -423, 34}));
    
    // 5 negative 
    assertArrayEquals("reverseInts test 3", new int[] {-86, -544, -65, -5426, -54387, -470, -661}, TwoA.reverseInts(new int[] {-661, -470, -54387, -5426, -65, -544, -86}));
    
    //10 numbers 
    assertArrayEquals("reverseInts test 4", new int[] {-8, 2, -2875, 854, 7654, 15, 3, 74, 39, 5542}, TwoA.reverseInts(new int[] {5542, 39, 74, 3, 15, 7654, 854, -2875, 2, -8}));
    
    //4 negative
    assertArrayEquals("reverseInts test 5", new int[] {21, 84384, -876, 28, 24444, 543, 35, 2, -5, 4, 3, -54387, -470, -661}, TwoA.reverseInts(new int[] {-661, -470, -54387, 3, 4, -5, 2, 35, 543, 24444, 28, -876, 84384, 21}));
    
    // 2 numbers 
    assertArrayEquals("reverseInts test 6", new int []{98, 89}, TwoA.reverseInts(new int[] {89, 98}));
    
  }//reverseInts test
}
 