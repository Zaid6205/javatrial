public class TernaryOperators {
    public static void main(String[] args) {

        int a=30;
        int b=20;
        int c=40;
        //int res= (a<b)?a:b;
        //System.out.println(res);
        int num= (a<b)? (a<c?a:b): (b<c?b:c);
        System.out.println(num);

        if(a<b)
        {
            if(a<c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(b);
            }
        }
        else
        {
            if(b<c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }

        //example made by me
        int num2= a<c?(c>b?b:a):(b>c?b:c);
        System.out.println(num2);

}
    }
