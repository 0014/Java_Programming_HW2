package team_questions.phone_number_to_word;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Created by FreakingM on 10/27/2016.
 */
public class TelephoneNumberWordGenerator {
    static int i;
    static int[] number;
    static ArrayList<String> wordConbination = new ArrayList<String>();
    static StringBuilder words = new StringBuilder();
    static PrintStream output;

    public static void main(String[] args) {
        //create number-word pairs table
        char[][] table = {{'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}, {'J', 'K', 'L'},
                {'M', 'N', 'O'}, {'P', 'R', 'S'}, {'T', 'U', 'V'}, {'W', 'X', 'Y'}};

        //create 7-digit ternary number. using a,b,c,d,e,f,g indicate each digit.
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;

        System.out.println("please type your telephone number");
        inputNumber();//call inputNumber() to input 7-digit number without '0' and '1',and
        //stores the numbers in integer array number[].

        //make the 7-digit ternary number increase from 0000000 to 2222222
        for (g =0; g <= 3; g++) {
            if (g == 3) {
                f += 1;
                g = 0;
            }
            if (f == 3) {
                e += 1;
                f = 0;
            }
            if (e == 3) {
                d += 1;
                e = 0;
            }
            if (d == 3) {
                c += 1;
                d = 0;
            }
            if (c == 3) {
                b += 1;
                c = 0;
            }
            if (b == 3) {
                a += 1;
                b = 0;
            }
            if (a == 3)
                break;
            //get the word combination according to the table,
            //and store the result in a StringBuilder words.

            words.append(table[number[0] - 2][a])
                    .append(table[number[1] - 2][b])
                    .append(table[number[2] - 2][c])
                    .append(table[number[3] - 2][d])
                    .append(table[number[4] - 2][e])
                    .append(table[number[5] - 2][f])
                    .append(table[number[6] - 2][g]);
            wordConbination.add(words.toString());//store every possible word-combination in an ArrayList.
            words.delete(0, 7);
        }
           openFile();//call openFile() to create a file, and print out the file location.
           addRecords();//call addRecords() to output all word-combination result to the file.

        }

    public static void openFile(){
        try {
           File file = new File("wordConbinations.txt");//create new text file.
            System.out.println("find the result in: ");
            System.out.println(file.getAbsolutePath());//show the file location.
            output = new PrintStream(file);//initialize printStream object
        }catch(IOException ioException) {
            System.err.println("Error opening file. Terminating");
            System.exit(1);
        }
    }

    public static void addRecords(){
      Iterator namesIterator = wordConbination.iterator();//use iterator to iterate all elements of ArrayList wordConbination.
       while (namesIterator.hasNext())
               output.format("%s%n",namesIterator.next());//add all elements to the file by using method format() in PrintStream class.
    }

    public static void inputNumber(){
       number=new int[7];//initialize the integer array.
        boolean flag = true;// use a flag as the end loop condition.
        while(flag) {
                Scanner input = new Scanner(System.in);
                String telephoneNumber = input.nextLine();
            //make sure entered 7-digit number
                if (telephoneNumber.length() != 7) {
                    System.out.println("type 7-digit. Try again");
                    telephoneNumber = input.nextLine();
                }
                //create a String array using every digit as the element.
                String[] numberArray = telephoneNumber.split("");
                for(i =0;i<7;i++){
                    //transfer the String array to integer array.
                  number[i]=Character.digit(numberArray[i].charAt(0),10);
                    //make sure 0 was not entered
                    if(number[i]==0) {
                        System.out.println("please don't type 0, and try again: ");
                        inputNumber();
                        break;
                    }
                    //make sure 1 was not entered
                    if(number[i]==1) {
                        System.out.println("please don't type 1, and try again: ");
                        inputNumber();
                       break;
                    }
                    flag = false;
                }
        }
    }
}