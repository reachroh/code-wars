class SumParts {

  public static int[] sumParts(int[] ls) {
 int [] arr = new int [ls.length+1];
        int sum = 0;
        for (int i = 0; i < ls.length; i++) {
            for (int j = i; j < ls.length; j++) {
                sum+= ls[j];
            }
            arr[i]=sum;
            sum=0;
        }
        return arr;
    }
}
// Needs to be optimized, execution timed out