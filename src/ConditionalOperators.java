public class ConditionalOperators {
    public static void main(String[] args) {

        // int age =55;
        //if(age>=18)
        //{
        //  System.out.println("you are an adult");
        //}
        //else
        //{
        //  System.out.println("you are an kid");
        //}

        //int age = 18;
        //if(age>=18 && age<60)
        //{
        //  System.out.println("you are an adult");
        //}
        //else if(age>=60)
        //{
        //   System.out.println("you are an old man");
        // }
        //else
        //{
        //   System.out.println("yor are a still kid");
        // }
        int age = 35;
        if (age >= 18 && age <= 60) {
            if (age > 20 && age < 30) {
                System.out.println("yor are in 20s");
            } else if (age > 30 && age < 40) {
                System.out.println("you are in 30s");
            } else {
                System.out.println("you are teen");
            }
        } else if (age > 60) {
            System.out.println("you are an old now");
        } else {
            System.out.println("kid");
        }
    }

}
