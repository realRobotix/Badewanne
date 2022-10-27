import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fassungsvermögen der Badewanne in Liter: ");
        Badewanne b = new Badewanne(scanner.nextInt());
        Method[] methods = b.getClass().getDeclaredMethods();
        //print the index of the method and the name
        //noinspection InfiniteLoopStatement
        while (true) {
            for (int i = 0; i < methods.length; i++) {
                System.out.println(i + ": " + methods[i].getName());
            }
            System.out.print("Aktion: ");
            //get user input
            int index = scanner.nextInt();
            //get all the parameters of the method at index
            Class<?>[] parameterTypes = methods[index].getParameterTypes();
            //print parameter type and name then get parameter from user input
            Object[] parameters = new Object[parameterTypes.length];
            for (int i = 0; i < parameterTypes.length; i++) {
                System.out.print(parameterTypes[i].getName() + " " + methods[index].getParameters()[i].getName() + " = ");
                if (parameterTypes[i].equals(int.class)) {
                    parameters[i] = scanner.nextInt();
                } else if (parameterTypes[i].equals(double.class)) {
                    parameters[i] = scanner.nextDouble();
                } else if (parameterTypes[i].equals(String.class)) {
                    parameters[i] = scanner.next();
                }
            }
            //invoke the method at index with the parameters
            try {
                System.out.println("Output: " + methods[index].invoke(b, parameters));
                //wait 10 seconds
                //noinspection BusyWait
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("-".repeat(20));
        }
    }
}