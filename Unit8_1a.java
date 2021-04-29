public class Unit8_1a
{
  public int [] [] modifyColumns (int [] [] arr)
 { 
   for(int i = 1; i < arr[0].length; i+=2) {
     for(int j = 0; j < arr.length; j++) {
       arr[j][i] = arr[j][i-1];
     }
   }
return arr;
      }
    }
 