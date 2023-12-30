package o1_intro;

public class O2_Variables_And_Datatypes {

	public static void main(String[] args) 
	{
		// there are 8 data types in java, byte , short, char , int , float, long, double, boolean ,(Premitive datatypes)  String(inbuilt class)
        byte a =  1;
        // making a short integer
        short b = 10;
        // making a character value.
        char ch = 'a';
        // making a integer value
        int i = 100;
        // making a float number with symbol of f at the end ,
        float f = 2.3f;
        // making a long(integer) variable value
        long i2 = 234234234;
        // making a double (decimal) number
        double d = 34534.4454;
        // making a boolean variable called as result
        boolean result = true;
        // making a string
        String s1 = "hello ecoders welcome to java.";
        // making an integer array.
        int arr [] = new int[100];
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(ch);
        System.out.println(i);
        System.out.println(f);
        System.out.println(i2);
        System.out.println(d);
        System.out.println(result);
        System.out.println(s1);
        
        // printing each type of variable 
        Object[] mixedObjects = new Object[]{a,b, ch, i , f, i2, d, result, s1, new O2_Variables_And_Datatypes(), new String[0] , arr};

        for (Object item : mixedObjects) {
            System.out.println(item.getClass().getSimpleName());
        }
 	}
}
