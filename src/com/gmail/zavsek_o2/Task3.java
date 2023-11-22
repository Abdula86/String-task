package com.gmail.zavsek_o2;

import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
            String[] names = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
            searchAndPrintNameCount(names);
        }

        private static void searchAndPrintNameCount(String[] names) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a name to search: ");
            String searchName = scanner.nextLine();

            int count = countOccurrences(names, searchName);

            if (count > 0) {
                System.out.println("Name " + searchName + " found " + count + " once");
            } else {
                System.out.println("Name " + searchName + " not found in the list");
            }
        }

        private static int countOccurrences(String[] array, String target) {
            int count = 0;
            for (String element : array) {
                if (element.equals(target)) {
                    count++;
                }
            }
            return count;
        }
}
