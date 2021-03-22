class FirstNonConsecutive {
    static Integer find(final int[] array) {
      for(int x=1;x<array.length;x++)
        {
        if (array[x-1] + 1 != array[x] ) 
        return array[x];
      }
      
    
        return null; // whole array is consecutive
    }
}


 return (int) Math.ceil(month / 3.);