package Main;

public class TestClass {
    public static void main(String[] args) {
        /////////////////////////////////////////////////Test String Constructor
        //HugeInteger huge1 = new HugeInteger("-");
        //HugeInteger huge2 = new HugeInteger("");
        //HugeInteger huge3 = new HugeInteger("-eerf");
        //HugeInteger huge4 = new HugeInteger("234/43");
        //HugeInteger huge5 = new HugeInteger("-000");
        //HugeInteger huge6 = new HugeInteger("304");
        //System.out.println(huge5.toString());
        //System.out.println(huge6.toString());
        
        /////////////////////////////////////////////////Test Random Constructor
        //HugeInteger huge7 = new HugeInteger(-10);
        //HugeInteger huge8 = new HugeInteger(0);
        //HugeInteger huge9 = new HugeInteger(a);
        //HugeInteger huge10 = new HugeInteger(10);
        //System.out.println(huge8.toString());
        
        
        ///////////////////////////////Test SUM with 2 Positive/Negative Numbers
//        HugeInteger huge11 = new HugeInteger("0");
//        System.out.println(huge11);
//        HugeInteger huge12 = new HugeInteger("12312");
//        System.out.println(huge12);
//        HugeInteger hugeP = huge11.add(huge12);
//        System.out.println(hugeP);
        

        /////////////Test SUM with 1 Negative and 1 Positive Number of same size
//        HugeInteger huge11 = new HugeInteger("-1000000000000000000");
//        HugeInteger huge12 = new HugeInteger("-1");
//        HugeInteger huge14 = new HugeInteger("100000");
//        HugeInteger huge15 = new HugeInteger("-1");
//        HugeInteger hugeP = huge11.subtract(huge12);
//        System.out.println(huge11.subtract(huge12));
        
        
        /////////////TEST MULTIPLY
        HugeInteger huge1 = new HugeInteger("9");
        HugeInteger huge2 = new HugeInteger("123456789");
        System.out.println(huge2.divide(huge1));
        
        /////////////TEST DIVIDE
//        HugeInteger huge1 = new HugeInteger("100");
//        HugeInteger huge2 = new HugeInteger("65");
//        System.out.println(huge1.divide(huge2));
    }   
}
