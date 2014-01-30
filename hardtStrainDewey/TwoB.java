package hardtStrainDewey;

public class TwoB
{
  /**
   * Compute the average of two integers.  Rounds toward zero if the
   * average is not a whole number.
   */
  public static int 
    average (int left, int right) 
  {
    if ((left % 2 == 1) && (right % 2 ==1))
      {
       return (left /2 + right /2 + 1);
      }
    else 
      return (left /2 + right/2);
  } // average(int,int)
} // class TwoB