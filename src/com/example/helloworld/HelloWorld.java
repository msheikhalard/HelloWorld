package com.example.helloworld;

import java.io.*;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;
        FileWriter ddd = null;
//        FileInputStream in = null;
//        FileOutputStream out = null;

        String[] array = {"123", "12312"};
        try {
            System.out.print( array[4] );
        } catch (Exception e) {

            e.printStackTrace();
            System.out.println( "Oeps" );
        }
        try {
            cin = new InputStreamReader( System.in );
            System.out.println( "Enter Characters, 'q' to quite." );
            char m;
            //in = new FileInputStream( "input.txt" );
            //out = new FileOutputStream( "output.txt" );
            ddd = new FileWriter( "output.txt" );
           /* while ((cin = in.read()) != -1) {
                System.out.print( (char) c );
                out.write( c );
            */
            do {
                m = (char) cin.read();
                System.out.print( m );
                ddd.write( m );
            } while (m != 'q');

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ddd != null) {
                ddd.close();
            }
            if (cin != null) {
                cin.close();
            }

        }
    }
}