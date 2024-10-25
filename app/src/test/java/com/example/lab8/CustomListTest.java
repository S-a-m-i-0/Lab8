package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {




    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return list
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void testHasCity() {
        list = MockCityList();
        City city = new City("toronto", "Ontario");
        list.addCity(city);
        assertFalse(list.hasCity(city));
    }

//    @Test
//    void testDelete() {
//        list = MockCityList();
//        City city = new City("Dhaka", "BD");
//        list.addCity(city);
//        assertEquals(1, list.getCount());   // Add a city and check
//        list.delete(city);
//        assertEquals(0, list.getCount());   // Delete a city and check
//    }
//
//    @Test
//    void testCountCities() {
//        list = MockCityList();
//        City city1 = new City("Edmonton", "AB");
//        list.addCity(city1);
//        City city2 = new City("Halifax", "NS");
//        list.addCity(city2);
//        City city3 = new City("Vancouber", "BC");
//        list.addCity(city3);
//        assertEquals(2, list.countCities());
//    }


}
