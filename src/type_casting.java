public class type_casting {
    public static void main(String[] args) {
        int a = 45;
        double b;
        b=a;
        System.out.println(b); // it converted bcz int have 4 byte whereas double have 8 byte . so we can exchange front int to float

        //eg_2
        double num_1=45.5;
        int num_2;
        num_2=(int)num_1;
        System.out.println(num_2); // in this doule can be converted into int bcz double has 8 byte and int has 4 byte

        //eg3

        int n1=12;
        int n2=5;
        float res =n1/n2;
        System.out.println(res); //we expecting the resulting in float (2.2) but remember when we divided int to int then value will comes in roundoff
    }
}
