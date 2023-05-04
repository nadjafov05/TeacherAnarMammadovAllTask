public class CalculatorAppBeginner {
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
}
