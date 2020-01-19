
package com.jetbrains.Task1.StringExamples;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class stringCipher {
    final static int lower_case_a = 'a';
    final static int uppercase_a = 'A';
    final static int lower_case_z = 'z';
    final static int upper_case_z = 'Z';


    public static void encryptDecrypt(String st) throws InterruptedException{
        //TimeUnit.SECONDS.sleep(2);
        StringBuffer sb = new StringBuffer();
        for(int i = 0;i<st.length();i++)
        {
            char c = st.charAt(i);
            if((int)c >= lower_case_a && (int)c <= lower_case_z)
            {
                //sb.append((char)(lower_case_z - c + lower_case_a));
                sb.append((char)(lower_case_z - (c+32) + lower_case_a));
            }
            else if ((int)c >= uppercase_a && (int)c <= upper_case_z)
            {
                sb.append((char)(upper_case_z - (c-32) + uppercase_a));
            }
        }
        System.out.println(sb.toString());

    }
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.println("Enter a string");
        String str = sc.next();
        long lStartTime = System.currentTimeMillis();
        encryptDecrypt(str);
        long lEndTime = System.currentTimeMillis();
        long output = lEndTime - lStartTime;
        System.out.println("Elapsed time in milliseconds: " + output);

    }
}
