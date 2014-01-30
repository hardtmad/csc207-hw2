package hardtStrainDewey;

public class TwoA
{
  public static boolean isMultiple (int a, int b)
  {
    if (b == 0) //0 is a multiple of all ints
      {
        return true;
      }//if
    return (a % b == 0);
  } //isMultiple
  
  public static boolean isOdd (int value)
  {
   return (value & 1) == 1; //bitwise operations
  } //isOdd
  
  public static int oddSumTo (int value)
  {
    if(TwoA.isOdd (value))
      {
       value--; 
      }//if
      return (value/2)*(value/2);
  } //oddSumTo
  
  public static boolean isOddProd (int[] values)
  {
    int counter = 0; 
    for(int i = 0; i < values.length; i++)
      {
        if (isOdd(values[i]))
          {
            counter ++;
          }
        if (counter == 2)
          {
            return true;
          }
      }
    return false;
  } //isOddProd
  
  public static boolean allDistinct (int[] values)
  {
    for(int i=0; i<values.length; i++)
      {
        for(int j=0; j<values.length; j++)
          {
            if (values[i] == values[j] && i!=j)
              {
                return false;
              }
          }
      }
    return true;
  } //allDistinct
  
  public static int[] reverseInts (int[]values)
  {
    int temp;
    int length = values.length;
    for (int i=0; i<(length/2); i++)
      {
        temp = values[i];
        values[i] = values[length - i -1];
        values [length - i -1] = temp; 
      }
    return values;
  } //reverseInts
  
}
