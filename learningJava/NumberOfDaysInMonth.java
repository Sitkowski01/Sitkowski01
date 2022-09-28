public class NumberOfDaysInMonth {
    public static void main(String[] args){
    getDaysInMonth(1, 2020);
    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    }
                } else {
                    return true;
                }

            } else {
                return false;
            }
        } else {
            return false;
        }
        return false;
    }

    public static int getDaysInMonth ( int month, int year){
        if (year < 1 || year > 9999)
            return -1;
        switch (month) {
            case 1:
                System.out.println("January has 31 days");
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    System.out.println("February has 29 days");
                    return 29;
                } else {
                    System.out.println("February has 28 days");
                    return 28;
                }
            case 3:
                System.out.println("March has 31 days");
                return 31;
            case 4:
                System.out.println("April has 30 days");
                return 30;
            case 5:
                System.out.println("Mai has 31 days");
                return 31;
            case 6:
                System.out.println("June has 30 days");
                return 30;
            case 7:
                System.out.println("July has 31 days");
                return 31;
            case 8:
                System.out.println("August has 31 days");
                return 31;
            case 9:
                System.out.println("September has 30 days");
                return 30;
            case 10:
                System.out.println("October has 31 days");
                return 31;
            case 11:
                System.out.println("November has 30 days");
                return 30;
            case 12:
                System.out.println("December has 31 days");
                return 31;
            default:
                return -1;

        }


    }
}
