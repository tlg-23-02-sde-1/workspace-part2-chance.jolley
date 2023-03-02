/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.entertainment.catalog;

import static org.junit.Assert.*;
import java.util.Collection;
import java.util.Map;

import org.junit.Test;
import com.entertainment.Television;

public class CatalogTest {


  @Test
  public void findByBrand_shouldReturnEmptyCollection_whenNoMatchingBrand() {
    Collection<Television> tvs = Catalog.findByBrand("NO-MATCHES");
    assertNotNull(tvs);
    assertTrue(tvs.isEmpty());
  }
  @Test
  public void findByBrands_shouldReturnEmptyMap_whenNoBrandsPasses() {
    Map<String,Collection<Television>> tvMap = Catalog.findByBrands();

    assertTrue(tvMap.isEmpty());
  }
  
  @Test
  public void findByBrand_shouldReturnCollectionWithThatBrand_whenBrandFound() {
    Collection<Television> tvs = Catalog.findByBrand("Sony");

    assertEquals(7, tvs.size());
    for (Television tv : tvs) {
      assertEquals("Sony", tv.getBrand());

    }
  }
  
  @Test
  public void findByBrands_shouldReturnMapWithEntries_whenBrandsPass() {
    Map<String, Collection<Television>> tvMap = Catalog.findByBrands("Sony", "Zenith", "LG");
    assertTrue(tvMap.size() == 3);
    Collection<Television> sonyTvs = tvMap.get("Sony");
    assertEquals(7, sonyTvs.size());
    for (Television tv : sonyTvs) {
      assertEquals("Sony", tv.getBrand());
    }

    Collection<Television> zenithTvs = tvMap.get("Zenith");
    assertEquals(9, zenithTvs.size());
    for (Television tv : zenithTvs) {
      assertEquals("Zenith", tv.getBrand());
    }
    Collection<Television> lgTvs = tvMap.get("LG");
    assertEquals(0, lgTvs.size());
    for (Television tv : lgTvs) {
      assertEquals("LG", tv.getBrand());
    }

  }

  @Test(expected = UnsupportedOperationException.class)
  public void getInventory_shouldReturnException_whenAttemptingToModify() {
    Collection<Television> inventory = Catalog.getInventory();
    inventory.add(new Television("Zenith", 0));

  }

  @Test
  public void name() {

  }
}