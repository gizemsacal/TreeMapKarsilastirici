package com.company;

import java.util.TreeMap;
import java.util.Comparator;

class Main {
    public static void main(String[] args) {

        // Creating a treemap with a customized comparator
        TreeMap<String, Integer> numbers = new TreeMap<>(new CustomComparator());

        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        numbers.put("Fourth", 4);
        System.out.println("TreeMap: " + numbers);
    }

    // Creating a comparator class
    public static class CustomComparator implements Comparator<String> {

        @Override
        public int compare(String number1, String number2) {
            int value =  number1.compareTo(number2);

            // elements are sorted in reverse order
            if (value > 0) {
                return -1;
            }
            else if (value < 0) {
                return 1;
            }
            else {
                return 0;
                /*Yukarıdaki örnekte, geçen bir ağaç haritası oluşturduk.
                 CustomComparator argüman olarak sınıf.

                 The CustomComparatorsınıfı Comparatorarabirimi uygular .

                 Daha sonra, compare()öğeleri ters sırada sıralamak için yöntemi geçersiz kılıyoruz .
                 */
            }
        }
    }
}