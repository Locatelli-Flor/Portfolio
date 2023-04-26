import java.util.ArrayList;

public class ordenarParImpar {
    public static ArrayList<Integer> ordenaParesImpares(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        ArrayList<Integer> aDevolver = new ArrayList<Integer>();

        for(int i : arr){
            if(i % 2 != 0){
                aDevolver.add(i);
            }
        }
        for(int i : arr){
            if(i % 2 == 0){
                aDevolver.add(i);
            }
        }

        return aDevolver;
    }


}
