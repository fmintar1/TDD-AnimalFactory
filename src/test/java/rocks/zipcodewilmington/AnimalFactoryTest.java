package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.*;
import rocks.zipcodewilmington.animals.animal_storage.*;
import static rocks.zipcodewilmington.animals.animal_creation.AnimalFactory.*;
import java.util.Date;


/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {

        Date birthDate = new Date();
        Dog dog = createDog("Fido", birthDate);
        DogHouse.add(dog);
        System.out.println(dog.getId());
        Dog dog2 = createDog("Rocky", birthDate);
        DogHouse.add(dog2);
        System.out.println(dog2.getId());
        Dog dog3 = new Dog("Bark", birthDate, 5);
        DogHouse.add(dog3);
        System.out.println(dog3.getId());
        Assert.assertEquals("Fido", dog.getName());
        Assert.assertEquals(birthDate, dog.getBirthDate());
//        Assert.assertEquals(1, (int) dog.getId());
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        Date birthDate = new Date();
        Cat cat1 = createCat("Cheshire", birthDate);
        CatHouse.add(cat1);
        System.out.println(cat1.getId());
        Cat cat2 = createCat("Oreo", birthDate);
        CatHouse.add(cat2);
        System.out.println(cat2.getId());
        Cat cat3 = new Cat("Spike", birthDate, 4);
        CatHouse.add(cat3);
        System.out.println(cat3.getId());
        Assert.assertEquals("Oreo", cat2.getName());
        Assert.assertEquals(birthDate, cat3.getBirthDate());
    }
}