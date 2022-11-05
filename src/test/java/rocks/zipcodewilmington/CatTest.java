package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    //Given
    Food fish = new Food();
    Cat cat = new Cat(null, null, 1);
    Animal animal;

    // TODO - Create tests for `void setName(String name)`
    @Test
    //When a method is called
    public void setNameTest() {
        //When calling method setName from object cat (or superclass of object cat)
        cat.setName("Nyan");
        //Then calling getName from object cat (or superclass of object cat) should equal to givenName
        Assert.assertEquals("Nyan", cat.getName());
    }

    // TODO - Create tests for `speak`
    @Test
    //When the method is called
    public void speakTest() {
        //Then calling method speak from object cat (or the superclass) should return meow!
        Assert.assertEquals("meow!", cat.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    //When the method is called
    public void setBirthDateTest() {
        //When the givenBirthDate is set to setBirthDate in the object class (or the superclass of cat)
        cat.setBirthDate(new Date());
        //Then getBirthDate method from cat(or superclass of cat) should equal to the givenBirthDate
        Assert.assertEquals(new Date(), cat.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    //When method is called
    public void eatTest() {
        cat.eat(fish);
        int expected = cat.getNumberOfMealsEaten();
        //Then getNumberOfMealsEaten method from cat object (or the superclass of cat) should return the same
        //number of value equal to eatenMeals array from cat object (or the superclass of cat)
        Assert.assertEquals(1, (int) cat.getNumberOfMealsEaten());
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    //When the method is called
    public void getIdTest() {
        //When getId method from cat object (or the superclass of cat) is called, it should return the same id number
        Assert.assertEquals(1, (int) cat.getId());

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof key
    @Test
    public void mammalInheritTest() {
        Assert.assertTrue(cat instanceof Mammal);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritTest() {
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
}
