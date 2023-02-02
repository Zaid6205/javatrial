import com.sun.security.jgss.GSSUtil;

public class LogicalOperators {
    public static void main(String[] args) {

        //Logical And (&&)
        int a=10;
        int b=20;
        int c=30;
        System.out.println(a==b && a<b && a>b);
        System.out.println(a<b && a<=b && a<c);

        //OR operators

        System.out.println(10==10|| 10<20|| 10<30);
    }
}
