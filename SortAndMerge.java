package Part2;

/**
 * Created by pgopal on 3/3/2017.
 */
public class SortAndMerge {
    private static int[] arr1 = new int[] {1,4,6};
    private static int[] arr2 = new int[] {2,3,5};

    public static void main(String[] args){
        for(int i = 0; i < arr1.length; i ++){
            System.out.print(arr1[i]);
        }
        System.out.println();
        for(int i = 0; i < arr2.length; i ++){
            System.out.print(arr2[i]);
        }

        System.out.println();
        System.out.println("When they are merged : ");
        int[] result = merge(arr1, arr2);
        for(int i = 0; i <result.length; i ++){
            System.out.print(result[i]);
        }
    }

    private static int[] merge(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                result[k] = arr1[i];
                i++;
            }
            else
            {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length)
        {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length)
        {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }
}
