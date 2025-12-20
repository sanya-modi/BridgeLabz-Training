public class SpringSeason{

    //Method to check for Spring season
    public static Boolean checkSeason(int month, int day){
        //Spring Season is from March 20 to June 20
        if ((month == 3 && (day >= 20 && day<=31)) ||
            (month == 4 && (day >= 1 && day<=30)) ||
            (month == 5 && (day >= 1 && day<=31)) ||
            (month == 6 && (day >= 1 && day <= 20))) {
            return true;
        } 
    return false;
    }
 
    public static void main(String[] args){

    //Get integer command line input
    int month = Integer.parseInt(args[0]);
    int day = Integer.parseInt(args[1]);

    //Display the true if it is Spring season, otherwise false
    System.out.println(checkSeason(month, day));
    
}
}