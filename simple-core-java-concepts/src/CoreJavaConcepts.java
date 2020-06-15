public class CoreJavaConcepts {
    public static void main(String[] args) {
     /*  1.Implicit Conversion
         2.Explicit Conversion
         3.Immutable String Object
         4.Wrapper Class*/

        // 1.Implicit Conversion - done by compiler - Storing small values to larger values
        int value = 100;
        long number = value;
        System.out.println("Value is " + number);

        float f = value;
        System.out.println("Value is " + f);

        // 2.Explicit Casting - done by code - storing larger values to smaller values
        long number1 = 25233;
        int number2 = (int) number1;
        System.out.println("Value is " + number2);

        int x = (int) 35.45;
        System.out.println("Value is " + x);

        int bigValue = 280;
        byte smallValue = (byte) bigValue;
        System.out.println("Value is " + smallValue);

        // 3. Immutable String
        String s1 = " manasi";
        s1.concat("value");
        System.out.println("Values is" + s1);

/*        String S1 = "Value1";
        String S2 = "Value2";

        for(int i=0;i<100000;i++)
        {
            S1 = S1 + S2;
            //Object created 100000 times
        }*/
        //Time Taken = 24sec

        //How to solve above problem
        StringBuffer sb = new StringBuffer("Values1");
        String s2 = "Value2";
        for (int i = 0; i < 100000; i++) {
            sb.append(s2);
        }
        //Time taken = 0.4sec
        // 4.Wrapper Classes Wraps around data type and it gives object appearance
        //Deprecated
        //Integer number2 = new Integer("55");

        Integer number3 = Integer.parseInt("55");

        //Using Cache Valueof - reuses object
        Integer number4 = Integer.parseInt("55");
        Integer number5 = Integer.parseInt("55");
        System.out.println(number4 == number5);
        System.out.println(number4.equals(number5));

        Integer number6 = Integer.valueOf("55");
        Integer number7 = Integer.valueOf("55");
        System.out.println(number4.equals(number5));


    }
}
