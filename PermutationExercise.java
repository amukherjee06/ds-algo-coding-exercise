public class PermutationExercise {
    public boolean permutation(int[] array1, int[] array2){
      int sum1=0;
      int sum2=0;
      int product1=1;
      int product2=1;
        for(int i:array1){
          sum1+=i;
          product1=product1*i;
        }
      for(int j:array2){
        sum2+=j;
        product2=product2*j;
      }

      if((sum1==sum2) && (product1==product2)){
        return true;
      }
      return false;
    }

}