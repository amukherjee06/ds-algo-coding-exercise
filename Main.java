import java.util.*;
class Main {
  public static void main(String[] args) {
    int[] intArray={1,2,3,4,5,6,4};
    DuplicateArrayExercise dex=new DuplicateArrayExercise();
   System.out.println(dex.isUnique(intArray));

    System.out.println("===============================================================");

    int[] intArray1={2,1,3,5,4,6};
    int[] intArray2={1,3,2,7,5,6};
    PermutationExercise pex=new PermutationExercise();
    System.out.println(pex.permutation(intArray1,intArray2));

    System.out.println("===============================================================");
    RotateMatrixExercise rex=new RotateMatrixExercise();
    int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
    rex.rotateMatrix(matrix);

    System.out.println(Arrays.deepToString(matrix));
  }
}