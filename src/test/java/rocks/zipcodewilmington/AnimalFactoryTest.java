package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static rocks.zipcodewilmington.animals.animal_creation.AnimalFactory.createCat;
import static rocks.zipcodewilmington.animals.animal_creation.AnimalFactory.createDog;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest() {
        Dog dog = createDog("Fido", new Date());
        Dog dog2 = createDog("Rocky", new Date());
        Dog dog3 = new Dog("Bark", new Date(), 3);
        DogHouse.add(dog);
        DogHouse.add(dog2);
        DogHouse.add(dog3);
        System.out.println(dog.getId());
        System.out.println(dog2.getId());
        System.out.println(dog3.getId());
        Assert.assertEquals("Fido", dog.getName());
//        Assert.assertEquals(new Date(), dog.getBirthDate());
//        Assert.assertEquals(1, (int) dog.getId());
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        Cat cat = new Cat(null, null, null);
        cat = createCat("Oreo", new Date());
        CatHouse.add(cat);
        Integer id = CatHouse.getNumberOfCats();
        Assert.assertEquals("Oreo", cat.getName());
//        Assert.assertEquals(new Date(), cat.getBirthDate());
        Assert.assertEquals(1, (int) cat.getId());
    }
}