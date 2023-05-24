import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Integer n;
        Long t1, t2;

        //region
        n = 8;
        t1 = Calendar.getInstance().getTimeInMillis();
        System.out.println("Hey - your input is: " + n);
        t2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("Duración ejemplo 1 (algoritmos de tiempo constante): " + (t2 - t1) + " milisegundos.\n");
        //endregion

        //region
        n = 8;
        t1 = Calendar.getInstance().getTimeInMillis();
        for (int i = 1; i < n; i = i * 2) {
            System.out.println("Hey - I'm busy looking at: " + i);
        }
        t2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("Duración ejemplo 2 (algoritmos de tiempo logarítmico): " + (t2 - t1) + " milisegundos.\n");
        //endregion

        //region
        n = 8;
        t1 = Calendar.getInstance().getTimeInMillis();
        for (int i = 1; i < n; i++) {
            System.out.println("Hey - I'm busy looking at: " + i);
        }
        t2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("Duración ejemplo 3 (algoritmos de tiempo lineal): " + (t2 - t1) + " milisegundos.\n");
        //endregion

        //region
        n = 4;
        t1 = Calendar.getInstance().getTimeInMillis();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j = j * 2) {
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
        t2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("Duración ejemplo 4 (algoritmos de tiempo n log n): " + (t2 - t1) + " milisegundos.\n");
        //endregion

        //region
        n = 3;
        t1 = Calendar.getInstance().getTimeInMillis();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
        t2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("Duración ejemplo 5 (algoritmos de tiempo polinómico): " + (t2 - t1) + " milisegundos.\n");
        //endregion

        //region
        n = 3;
        t1 = Calendar.getInstance().getTimeInMillis();
        for (int i = 1; i <= Math.pow(2, n); i++) {
            System.out.println("Hey - I'm busy looking at: " + i);
        }
        t2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("Duración ejemplo 6 (algoritmos de tiempo exponencial): " + (t2 - t1) + " milisegundos.\n");
        //endregion

        //region
        n = 3;
        t1 = Calendar.getInstance().getTimeInMillis();
        for (int i = 1; i <= factorial(n); i++) {
            System.out.println("Hey - I'm busy looking at: " + i);
        }
        t2 = Calendar.getInstance().getTimeInMillis();
        System.out.println("Duración ejemplo 7 (algoritmos de tiempo factorial): " + (t2 - t1) + " milisegundos.\n");
        //endregion
    }

    public static Integer factorial(Integer n) {
        Integer fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}