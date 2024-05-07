import java.util.Scanner;
//1. Принимать через консоль две строки и вывести их через System.out.println()
//2. Принимать через консоль два числа и вывести их сумму, разность, умножение и
//деление. Деление должно быть с десятичной частью ( например 4/5 должен вывести 0,8)
public class main {
    public static void main(String[] args) {
        String first, second, symv;
        double f,s,res = 0;
        Scanner scan = new Scanner(System.in);
        first = scan.nextLine();
        String[] parts = first.split(" ");
        switch (parts[1]){
            case "+":
                res = Integer.valueOf(parts[0]) + Integer.valueOf(parts[2]);
                break;
            case "-":
                res= Integer.valueOf(parts[0]) - Integer.valueOf(parts[2]);
                break;
            case "*":
                res = Integer.valueOf(parts[0]) * Integer.valueOf(parts[2]);
                break;
            case"/":
                if(Integer.valueOf(parts[0])==0|| Integer.valueOf(parts[2])== 0) System.out.println("Ошибка");
                else res = (double) Integer.valueOf(parts[0]) / Integer.valueOf(parts[2]);
                break;
            default:
                System.out.print("Ошибка");
        }
        System.out.println(res);


//        System.out.print("Введите строку: ");
//        first = scan.nextLine();
//        System.out.print("Введите вторую: ");
//        second = scan.nextLine();
//        System.out.println(first + second);
//        System.out.print("Введите первое число: ");
//        f =scan.nextInt();
//        System.out.println("Введите второе число: ");
//        s = scan.nextInt();
//        scan.nextLine();
//        System.out.println("Введите действие(+,-.*./): ");
//        symv = scan.nextLine();
//        switch (symv){
//            case "+":
//                res = f+s;
//                break;
//            case "-":
//                res= f=s;
//                break;
//            case "*":
//                res = f* s;
//                break;
//            case"/":
//                if(f == 0 || s == 0 ) res = 0;
//                else res = f/s;
//                break;
//            default:
//                System.out.println("Ошибка!!");
//        }
//        System.out.println(res);

    }
}