import java.util.Scanner;

public class IO {
    private static final Scanner in = new Scanner(System.in);





    public static String getString(String message) {
        System.out.print(message);
        return in.next();
    }

    public static int getInt(String printMenu) {

        System.out.println(printMenu);
        for (int i = 0; i == 0; i++);
        return 0;

    }

    public static int getUserSelect(String message) {
        System.out.println(message);
        return in.nextInt();
    }




    public static int[] getIntArray(String message) {
        System.out.println(message); // Hello ori we are scanning an array:
        int size = getInt("Enter array size:");
        int[] array = new int[size];

        for (int i = 0; i < size; i++)
            array[i] = getInt("enter the " + (i+1) + " element");
        return array;
    }


}
