import java.util.Scanner;

public class  CalculatorAppBeginner {
    public static double calculate(double a,double b,int operation){
        double cem = 0;
        switch (operation){
            case 1:
                 cem = a + b;
                 break;
            case 2:
                cem = a-b;
                break;
            case 3:
                cem = a*b;
                break;
            case 4:
                cem = a / b;
        }

        return cem;
    }

    public static void calculateAppReturn(){
        Scanner sc = new Scanner(System.in);
        System.out.print("a ededini daxil edin: ");
        double a = sc.nextInt();
        System.out.print("b ededini daxil edin: ");
        double b = sc.nextInt();
        System.out.println("emeliyyati secin:" +
                "\n1.  + : toplama" +
                "\n2.  - : cixma" +
                "\n3.  * : vurma" +
                "\n4.  / : qaliq");
        int operation = sc.nextInt();


        //  Calculate Methods //
        double cem = CalculatorAppBeginner.calculate(a,b,operation);

        System.out.println(cem);
    }
}
