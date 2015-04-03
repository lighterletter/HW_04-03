package nyc.c4q.lighterletter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by c4q-john on 4/1/15.
 *
 *I tried. I'm dissapointed that I wasn't able to get the problem done.
 *
 */
public class DistributionCalculator {


    public static ArrayList<> calculate(File txtFile) throws FileNotFoundException
    {

        Scanner scanner = new Scanner(txtFile);

        while(scanner.hasNext()){



        }

        ArrayList<Character, Integer> newtontxt = new ArrayList<Character,Integer>();

        for(int i =0; i < newtontxt.size(); i++){

            int count = newtontxt.indexOf(i);

            while(count!=-1){

            }
                if(newtontxt.get(i).equals(-1)){

                }


            }









        return newtontxt;
    }
    public static void main(String [] args){
        File principia = new File("/Users/c4q-john/Desktop/accesscode/HW_04-03/src/nyc/c4q/lighterletter/Pricipia.txt");

        HashMap<Character,Integer> newTxt = new HashMap<Character, Integer>();


        calculate(principia);


    }
}
