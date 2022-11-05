package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_storage.DogHouse.*;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    Dog shiba = new Dog("Shiba", new Date(), 0);
    Dog huskies = new Dog("Huskies", new Date(), 1);
    Dog terrier = new Dog("Terrier", new Date(), 2);
    Dog dalmatian = new Dog("Dalmatian", new Date(), 3);

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        //When a method add is called
        add(shiba);
        add(huskies);
        add(terrier);
        add(dalmatian);
        //Then test if the respective Dog object can be retrieved from the house
        Assert.assertEquals(shiba, getDogById(0));
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest() {
        //When a method remove is called
        addDogTest();
        remove(2);
        //Then test if the respective dog object can be retrieved from the house
        Assert.assertEquals(null,getDogById(2));

    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeByObj() {
        //When a method remove is called
        addDogTest();
        remove(huskies);
        //Then test if the respective dog object can be retrieved from the house
        Assert.assertEquals(null,getDogById(huskies.getId()));
        Assert.assertEquals(3,(int) getNumberOfDogs());
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {
        addDogTest();
        //Then test if the method is as expected
        Assert.assertEquals(shiba, getDogById(0));
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberofDogsTest(){
        addDogTest();
        //Then test if the method is as expected
        Assert.assertEquals(4, (int) getNumberOfDogs());
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
