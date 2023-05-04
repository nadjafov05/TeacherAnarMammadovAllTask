import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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