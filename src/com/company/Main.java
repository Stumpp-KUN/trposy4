package com.company;

import java.util.*;

public class Main {
    static Scanner scan=new Scanner(System.in);
    private static final String articles = "FROM KFDS\n"+ "HELLO\n"+ "FDSFSDFSDFSDF\n";
    public static void main(String[] args) {
        List<String> lines = Arrays.asList(articles.split("\n"));
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
