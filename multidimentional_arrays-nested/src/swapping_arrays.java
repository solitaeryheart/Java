public class swapping_arrays {
    public static void main(String[] args)
    {
        int[] array = {1,2,3,4};
        int l = array.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i = 0; i < n; i++)
        {
            // |1| |2| |3| |4| |temp|
            // | | |2| |3| |4| |1|
            // |4| |2| |3| |1| |temp|
            // |4| | | |3| |1| |2|
            // |4| |3| |2| |1| |temp| so on...
               temp = array[i];
               array[i] = array[l-1-i];
               array[l-1-i] = temp;

        }
        for(int element : array)
        {
            System.out.println(element);
        }
    }
}
