package nyc.c4q.lighterletter;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

    static int search(ArrayList<Integer> unknown , int x) {


        unknown.add(0, 3);
        unknown.add(1, 45);
        unknown.add(2, 1);
        unknown.add(3, 2);
        unknown.add(4, 99);
        unknown.add(5, 80);


        if (!unknown.contains(x)){
             return -1;
         } else {
             return unknown.indexOf(x);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> unknown = new ArrayList<Integer>();



        System.out.println("Type in your index request: ");

        int x = scanner.nextInt();


        if (search(unknown,x) == -1){
            System.out.println(x + " :Not in my database");
        }else {
            System.out.println(search(unknown,x));
        }
    }
}
