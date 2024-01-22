public class arrays_practice {
    public static void main(String [] args)
    {

        float[] m ={4f,5f,7f,2f,8f};
        float num = 7f;
        boolean isinarray =  false;
        for(float element : m)
        {
            if(num == element )
            {
                isinarray = true;
                break;
            }

        }if(isinarray)
    {
        System.out.println("number is is array");
    }
    }
}
