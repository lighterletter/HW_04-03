package nyc.c4q.lighterletter;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by c4q-john on 4/1/15.
 * <p/>
 * Program reads from a text file and returns the percentage of each appearance of each letter within
 * a specified document.
 */
public class DistributionCalculator
{


    public static ArrayList<Double>  calculate(File txtFile) throws FileNotFoundException
    {
        //initializes arrayList to hold the percentage of every character in the document.
        ArrayList<Double> charPercentage = new ArrayList<Double>();

        //empty array that will hols the ascii value of the alphabet.
        ArrayList<Integer> characterCountArr = new ArrayList<Integer>();

        //will populate the characterCountArr with proper value
        int characterIndex;

        //Initialises the scanner.
        Scanner scanner = new Scanner(txtFile);
        //reads the file.
        scanner.nextLine();

        //creates an empty array.
        for ( int i =0; i < 26; i++){
            characterCountArr.add(i,0);
        }

        //reads the file as long as it has input.
        while(scanner.hasNext())
        {
            //initializes an empty string to receive content from scanner.
            //Moves content into string called letter.
           String word = scanner.next();

            //loop iterates through the length  of the document.
            for(int i = 0; i < word.length(); i++)
            {

                //sets the ascii value for each character within the range we're looking for.
                int asciiValue = (int) word.toLowerCase().charAt(i);
                //catches the lowercase alphabet.
                if(asciiValue >= 97 && asciiValue <= 122)
                {
                    //sets the proper ascii char value back to zero
                    characterIndex = asciiValue - 97;

                        //populates the specified array with the pproper ascii value to the proper index value.
                        int currentvalue = characterCountArr.get(characterIndex);
                        currentvalue++;
                        characterCountArr.set(characterIndex,currentvalue);


                } else{

                    continue;

                }


            }

        }


           /*
            At this point, we've figured out how many times each character appears in the text
             */

        //Here we find out the total number of letters within the document.
        int totalNumberOfLetters = 0;
        for (int i =0; i < characterCountArr.size();i++){
            totalNumberOfLetters = totalNumberOfLetters + characterCountArr.get(i);
        }

        //here we map the index of the array which corresponds to the alphabet with the distribution percentage of that letter.
        int mycurrentCount;
        for (int i =0; i < characterCountArr.size();i++)
        {
            mycurrentCount = characterCountArr.get(i);
            double percent = (double) mycurrentCount / totalNumberOfLetters * 100;
            charPercentage.add(i, percent);
        }

        //returns the percentage array.
        return charPercentage;


    }


    public static void main(String[] args) throws FileNotFoundException
    {
        //file we use
        File principia = new File(
                "/Users/c4q-john/Desktop/accesscode/HW_04-03/src/nyc/c4q/lighterletter/Pricipia.txt");

        //calls the calculate method to populate the array we'll use.
        ArrayList<Double> percentageOfCharactersShown = calculate(principia);

        //calls the index and turns it into it's char vaue. formats the long double into percentage value.
        for(int i =0; i < percentageOfCharactersShown.size(); i++)
        {
            DecimalFormat df = new DecimalFormat("##.##");
            System.out.println((char)(i+97)+ " : " + df.format(percentageOfCharactersShown.get(i))+ "%");

        }

        System.out.println("Finally!");




    }
}



