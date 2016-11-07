package team_questions.phone_number_to_word;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class TelephoneNumberWordGenerator {
    static int i;
    static int[] number;
    static ArrayList<String> wordConbination = new ArrayList<String>();
    static StringBuilder words = new StringBuilder();
    static PrintStream output;

    public static void main(String[] args) {

        char[][] table = {{'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}, {'J', 'K', 'L'},
                {'M', 'N', 'O'}, {'P', 'R', 'S'}, {'T', 'U', 'V'}, {'W', 'X', 'Y'}};

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;

        System.out.println("please type your telephone number");
        inputNumber();


      
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
  
            words.append(table[number[0] - 2][a])
                    .append(table[number[1] - 2][b])
                    .append(table[number[2] - 2][c])
                    .append(table[number[3] - 2][d])
                    .append(table[number[4] - 2][e])
                    .append(table[number[5] - 2][f])
                    .append(table[number[6] - 2][g]);
            wordConbination.add(words.toString());
            words.delete(0, 7);
        }
           openFile();
           addRecords();

        }

    public static void openFile(){
        try {
           File file = new File("wordConbinations.txt");
            System.out.println("find the result in: ");
            System.out.println(file.getAbsolutePath());
            output = new PrintStream(file);
        }catch(IOException ioException) {
            System.err.println("Error opening file. Terminating");
            System.exit(1);
        }
    }

    public static void addRecords(){
      Iterator namesIterator = wordConbination.iterator();
       while (namesIterator.hasNext())
               output.format("%s%n",namesIterator.next());
    }

    public static void inputNumber(){
       number=new int[7];
        boolean flag = true;
        while(flag) {
                Scanner input = new Scanner(System.in);
                String telephoneNumber = input.nextLine();

                if (telephoneNumber.length() != 7) {
                    System.out.println("type 7-digit. Try again");
                    telephoneNumber = input.nextLine();
                }

                String[] numberArray = telephoneNumber.split("");
                for(i =0;i<7;i++){

                  number[i]=Character.digit(numberArray[i].charAt(0),10);

                    if(number[i]==0) {
                        System.out.println("please don't type 0, and try again: ");
                        inputNumber();
                        break;
                    }

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