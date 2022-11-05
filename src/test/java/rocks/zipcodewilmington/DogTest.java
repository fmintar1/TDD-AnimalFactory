package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    //Given
    Dog dog = new Dog("Fido", new Date(), 2);
    Food steak = new Food();
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void newDogTest() {

        String getName = dog.getName();
        Date getBirthDate = dog.getBirthDate();
        Integer getId = dog.getId();

        Assert.assertEquals("Fido", getName);
        Assert.assertEquals(2, (int) getId);
        Assert.assertEquals(new Date(), dog.getBirthDate()); //<--Weird, same result, but an error :(
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        Assert.assertEquals("bark!", dog.speak());
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        dog.setBirthDate(new Date());
        Assert.assertEquals(new Date(), dog.getBirthDate());
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        dog.eat(steak);
        dog.getNumberOfMealsEaten();
        Assert.assertEquals(1, (int) dog.getNumberOfMealsEaten());
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        Assert.assertEquals(2, (int) dog.getId());
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritTest() {
        Assert.assertTrue(dog instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritTest() {
        Assert.assertTrue(dog instanceof Mammal);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
