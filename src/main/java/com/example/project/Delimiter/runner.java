package com.example.project.Delimiter;
import java.util.ArrayList;

public class runner {
    public static void main(String[] args) {
        Delimiters delimitersEx3 = new Delimiters("<sup>", "</sup>");
        String[] tokens4 = {"<sup>", "</sup>", "</sup>", "<sup>"};
        ArrayList<String> delList2 = delimitersEx3.getDelimitersList(tokens4);
        boolean res2 = delimitersEx3.isBalanced(delList2);
        System.out.println(res2);
    }
}