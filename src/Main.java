import java.util.Scanner;

public class Main {
    public static String sum(String stn1, String stn2) {
        String sumStr = "";
        int rewind = 0;
        int i = stn1.length() - 1;
        int j = stn2.length() - 1;
        while (i >= 0 && j >= 0) {
            int n1 = Character.getNumericValue(stn1.charAt(i));
            int n2 = Character.getNumericValue(stn2.charAt(j));
            int sum = n1 + n2 + rewind;
            if (sum >= 10) {
                sum %= 10;
                rewind = 1;
            } else {
                rewind = 0;
            }
            sumStr = sum + sumStr;
            i--;
            j--;
        }
        while (i >= 0) {
            int n1 = Character.getNumericValue(stn1.charAt(i));
            int sum = n1 + rewind;
            if (sum >= 10) {
                sum %= 10;
                rewind = 1;
            } else {
                rewind = 0;
            }
            sumStr = sum + sumStr;
            i--;
        }
        while (j >= 0) {
            int n2 = Character.getNumericValue(stn2.charAt(j));
            int sum = n2 + rewind;
            if (sum >= 10) {
                sum %= 10;
                rewind = 1;
            } else {
                rewind = 0;
            }
            sumStr = sum + sumStr;
            j--;
        }
        if (rewind == 1) {
            sumStr = "1" + sumStr;
        }
        return sumStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        System.out.println(sum(n1, n2));
    }
}
