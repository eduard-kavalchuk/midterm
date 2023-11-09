package Task1;

public class Task1 {
    public static void main(String args[]) {
        int[] inputArgs = new int[3];

        if (! checkArguments(args))
            return;

        for (int i = 0; i < 3; i++) {
            inputArgs[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Задача 1: " + method1(inputArgs[0], inputArgs[1], inputArgs[2]));
        System.out.println("Задача 2: " + method2(inputArgs[0], inputArgs[1], inputArgs[2]));
    }

    public static int method1(int A, int B, int C) {
        if (A > B && A > C)
            return A + C;
        return B;
    }

    /**
     * Возвращает среднее арифметическое
     * */
    public static double method2(int A, int B, int C) {
        return (A + B + C) / 3.0;
    }

    /**
     * Проверка корректности ввода
     * */
    private static boolean checkArguments(String args[]) {
        if (args.length != 3) {
            System.out.println("Error: three integer arguments are expected.");
            return false;
        }
        // Check that all arguments have INTEGER type
        for(String arg : args) {
            try {
                Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.err.print("Error: illegal argument: " + arg);
                System.err.println(" All arguments must have INTEGER type");
                return false;
            }
        }
        return true;
    }
}
