package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        for (int i = 0; i < list.size() - 1; i ++) {
            for (int j = i + 1; j < list.size(); j ++) {
                if (list.get(i).getLastName().compareTo(list.get(j).getLastName()) > 0) {
                    Student former = list.set(i, list.get(j));
                    list.set(j, former);
                }
                else if (list.get(i).getLastName().compareTo(list.get(j).getLastName()) == 0) {
                    if (list.get(i).getFirstName().compareTo(list.get(j).getFirstName()) > 0) {
                        Student former = list.set(i, list.get(j));
                        list.set(j, former);
                    }
                    else if (list.get(i).getFirstName().compareTo(list.get(j).getFirstName()) == 0 && list.get(i).getGpa() < list.get(j).getGpa()) {
                        Student former = list.set(i, list.get(j));
                        list.set(j, former);
                    }
                }
            }
        }
        return list;
    }

}
