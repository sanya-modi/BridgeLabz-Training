public class ConvertDistance{
    public static void main(String[] args){

        float distanceInKm = 10.8f;
        //Converting distance in Kilometer to distance in miles
        float distanceInMiles = (distanceInKm * 1.6f);

        System.out.println("The distance " + distanceInKm +"km in miles is " + distanceInMiles); 

}
}