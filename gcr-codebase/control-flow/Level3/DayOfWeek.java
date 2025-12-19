public class DayOfWeek{
    public static void main(String[] args){

        //Take date as input
        int d = Integer.parseInt(args[0]); //Date
        int m = Integer.parseInt(args[1]); //Month
        int y = Integer.parseInt(args[2]); //Year

        //Calculate the day of the week
        double y0 = (double)(y-(14-m)/12);
        double x = (double)(y0 + y0/4 - y0/100 + y0/400);
        double m0 = m+12*((14-m)/12)-2;
        double d0 =(d+x+(31*m0)/12)%7;

        //Print day of the week
        System.out.println("Day of the week : " + (int)d0);
        
}
}