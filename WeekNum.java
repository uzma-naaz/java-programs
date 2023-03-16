import java.util.*;

class WeekNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter week number :");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.print("monday");
                break;
            case 2:
                System.out.print("tuesday");
                break;
            case 3:
                System.out.print("wednesday");
                break;
            case 4:
                System.out.print("thursday");
                break;
            case 5:
                System.out.print("friday");
                break;
            case 6:
                System.out.print("saturday");
                break;
            case 7:
                System.out.print("sunday");
                break;
            default:
                System.out.print("there are only 7 days");
                break;
        }
    }
}