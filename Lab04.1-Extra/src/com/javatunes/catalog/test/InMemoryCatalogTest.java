/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog.test;

import com.javatunes.catalog.Catalog;
import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.Collection;

class InMemoryCatalogTest {

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
        //testFindById();
       //testFindByKeyword();
        //testFindByCategory();
        // testSize();
        // testGetAll();
        //testFindSelfTitled();
        // testFindRockBottom();
        // testGenreCount();
        // testAverageCost();


    }

    private static void testAverageCost() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.printf("Average cost is: $%.2f", catalog.averageCost());
    }

    private static void testGenreCount() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.genreCount(MusicCategory.POP));

    }

    private static void testFindRockBottom() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> items = catalog.findRockBottom(12.0);
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }

    private static void testFindSelfTitled() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> items = catalog.findSelfTitled();
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }

    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        MusicItem item = catalog.findById(12L);
        System.out.println();
        MusicItem notFound = catalog.findById(19L);
        System.out.println(notFound);


    }

    private static void testFindByKeyword() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> items = catalog.findByKeyword("Yes");
        for (MusicItem item :items) {
            System.out.println(item);
        }
    }

    private static void testFindByCategory() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> items = catalog.findByCategory(MusicCategory.POP);
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }

    private static void testSize() {
    }

    private static void testGetAll() {
    }
}