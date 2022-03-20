package com.company;

import java.util.*;

public class Main {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите количество статей ");
        int j=scan.nextInt();
        String[] articles=new String[j];
        System.out.println("Начинайте вводить статьи ");
        for(int i=0;i<j;i++)
            articles[i]=scan.next();

        List<String> lines = Arrays.asList(articles);
        System.out.println(lines);

        Collections.sort(lines, new SortByLength());
        System.out.println(lines);
    }
}

class SortByLength implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
