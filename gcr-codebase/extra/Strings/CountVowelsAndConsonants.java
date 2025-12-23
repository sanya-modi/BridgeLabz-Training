import java.util.*;

public class CountVowelsAndConsonants{

    //count the number of vowels and consonants
    public static void calculateFrequency(String text){
    int n = text.length();
    int vowelCount = 0;
    int consonantCount = 0;
    for(int i=0; i<n; i++){
    char ch = text.charAt(i);
    if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u') vowelCount++;
    else consonantCount++;
    }
    System.out.println("The number of vowels : " + vowelCount);
    System.out.println("The number of consonant : " + consonantCount);
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

        //Take input from user 
        System.out.println("Enter the string");
        String text = sc.nextLine();
        
        //print the output 
        calculateFrequency(text);
    }

}