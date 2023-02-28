package com.crunch;

import java.util.ArrayList;
import java.util.List;

class RadishSortTest {

    public static void main(String[] args) {
        List<Radish> radishes = new ArrayList<>();
        radishes.add(new Radish("red"  , 1.1, 2.1, 0));
        radishes.add(new Radish("pink" , 3.5, 0.0, 3));
        radishes.add(new Radish("black", 2.2, 4.2, 0));
        radishes.add(new Radish("white", 1.8, 1.5, 7 ));

        dump(radishes);
        System.out.println();
        //sort by natural order
        radishes.sort(null);  //passing null means natural order
        dump(radishes);
        System.out.println();
        //sort by color, via an instance of RadishColorComparator
        radishes.sort(new RadishColorComparator());
        dump(radishes);
        System.out.println();


    }

    private static void dump(List<Radish> radishList) {
        for (Radish radish : radishList) {
            System.out.println(radish);
        }
    }
}