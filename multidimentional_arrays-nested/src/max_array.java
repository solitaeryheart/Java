import java.util.SplittableRandom;

public class max_array {
    public static void main(String []args)
    {
        int[] arr = {44,5,72,58,95};
        int max = 0;
        int min = 1000;
        for(int i = 0; i < arr.length;i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
            if(min > arr[i] && min !=0)
            {
                min = arr[i];
            }
        }
        System.out.println("MAXIMUM INTEGER IN THE GIVEN ARRAY IS : "+max);
        System.out.println("MINIMUM INTEGER IN THE GIVEN ARRAY IS : "+min);
    }
}
