package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.CatHouse.*;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    Cat cheshire = new Cat("Cheshire", new Date(), 0);
    Cat persian = new Cat("Persian", new Date(), 1);
    Cat leo = new Cat("Leo", new Date(), 2);
    Cat purr = new Cat("Purr", new Date(), 3);

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        //When a method add is called
        add(persian);
        add(cheshire);
        add(leo);
        add(purr);
        //Then test if the cat object can be retrieved from the house
        Assert.assertEquals(persian, getCatById(persian.getId()));
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest() {
        //When a method remove is called
        addCatTest();
        remove(0);
        //Then test if the cat object can be retrieved from the house
        Assert.assertEquals(null, getCatById(0));
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        //When a method remove is called
        addCatTest();
        remove(persian);
        //Then test if the cat object can be retrieved from the house
        Assert.assertEquals(null,getCatById(persian.getId()));
        Assert.assertEquals(3, (int) getNumberOfCats());
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        //When cat is added to the catHouse
        addCatTest();
        //Then test if the cat object can be retrieved by using id
        Assert.assertEquals(cheshire, getCatById(cheshire.getId()));

    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {
        //When adding all Cat objects into the CatHouse
        addCatTest();
        //Then test if the respective number of Cat objects is returned
        Assert.assertEquals(4, (int) getNumberOfCats());
    }
}
