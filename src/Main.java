import java.util.Scanner;

public class Main {
    public static String sum(String stn1, String stn2) {
        String sumStr = "";
        int rewind = 0;
        int i = stn1.length() - 1;
        int j = stn2.length() - 1;
        while (i >= 0 || j >= 0 || rewind > 0) {
            int n1 = i >= 0 ? Character.getNumericValue(stn1.charAt(i)) : 0;
            int n2 = j >= 0 ? Character.getNumericValue(stn2.charAt(j)) : 0;
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
        return sumStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        try {
            Integer.parseInt(n1);
            Integer.parseInt(n2);
        } catch (Exception e) {
            System.out.println("Vui lòng nhập chữ số");
            return;
        }
        System.out.println(sum(n1, n2));
    }
}
