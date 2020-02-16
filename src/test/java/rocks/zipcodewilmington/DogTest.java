package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog newDog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        newDog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = newDog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void testBirthDate() {

        Dog newDog = new Dog(null, null, null);
        Date birthDate = new Date();




        newDog.setBirthDate(birthDate);
        Date expected = newDog.getBirthDate();


        Date actual = newDog.getBirthDate();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSpeak() {
        Dog newDog = new Dog(null, null, null);
        String expected = "bark!";
        String actual = newDog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEatFood() {
        Dog newDog = new Dog(null, null, null);
        newDog.eat(new Food());
        Integer expected = 2;
        Integer actual = newDog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testId() {
        Dog newDog = new Dog(null, null, 7);
        Integer expected = 7;
        Integer actual = newDog.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInstanceOfAnimal() {
        Dog newDog = new Dog(null,null, null);
        Assert.assertTrue(newDog instanceof Animal);
    }

    @Test
    public void testInstanceOfMammal() {
        Dog newDog = new Dog(null,null, null);
        Assert.assertTrue(newDog instanceof Mammal);
    }
}
