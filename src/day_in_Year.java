public class day_in_Year {
    public static int numberOfDaysInAYear(int year){
        if (year <2000|| year >2020){
            return 0;
        }else if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            return 366;
        }
        return 365;
    }
}
