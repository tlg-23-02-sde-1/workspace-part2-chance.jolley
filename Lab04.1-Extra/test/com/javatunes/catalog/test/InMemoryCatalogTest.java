package com.javatunes.catalog.test;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicItem;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class InMemoryCatalogTest {
    private InMemoryCatalog catalog;

    @Before
    public void setUp() {
        catalog = new InMemoryCatalog();
    }

    @Test
    public void findSelfTitled_shouldReturnCorrectResults() {
        Collection<MusicItem> items = catalog.findSelfTitled();
        //size should be 2, ids are 6 and 7
        assertEquals(2, items.size());
        List<MusicItem> itemsList = new ArrayList<>(items);
        itemsList.sort(null);
        assertEquals(6L, itemsList.get(0).getId().longValue());
        assertEquals(7L, itemsList.get(1).getId().longValue());
    }

    @Test
    public void findById_shouldReturnNull_whenIdNotFound() {
        MusicItem item = catalog.findById(1000L);
        assertNull(item);
    }

    @Test
    public void findByID_shouldReturnMusicItem_whenIdFound() {
        MusicItem item = catalog.findById(12L);
        //assertEquals(); //assertEquals(Object, Object)
        assertTrue(12 == item.getId());

    }
}