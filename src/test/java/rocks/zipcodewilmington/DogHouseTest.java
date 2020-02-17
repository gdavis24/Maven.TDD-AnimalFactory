package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();

    }

    @Test
    public void testAddDog() {
        Dog newDog = new Dog("Milo", new Date(), 7);
        DogHouse.add(newDog);
        Assert.assertEquals(newDog, newDog);
    }

    @Test
    public void testRemoveDog() {
        Dog newDog = new Dog("Milo", new Date(), 7);
        DogHouse.add(newDog);
        DogHouse.remove(newDog);
        Assert.assertEquals(newDog, newDog);
    }

    @Test
    public void testRemoveDogId() {
        Dog newDog = new Dog("Milo", new Date(), 7);
        DogHouse.add(newDog);
        DogHouse.remove(7);
        Assert.assertEquals(newDog, DogHouse.getDogById(7));
    }

    @Test
    public void testGetDogId() {
        Dog newDog = new Dog("Milo", new Date(), 7);
        DogHouse.add(newDog);
        Dog newIdDog = DogHouse.getDogById(7);
        Assert.assertEquals(newDog, DogHouse.getDogById(7));
    }
    @Test
    public void testGetNumberOfDogs1() {
        Dog newDog = new Dog("Milo", new Date(), 7);
        DogHouse.add(newDog);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }



}
