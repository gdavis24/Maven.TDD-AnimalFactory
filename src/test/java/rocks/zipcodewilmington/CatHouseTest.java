package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testAddCat() {
        Cat newCat = new Cat("Milo", new Date(), 7);
        CatHouse.add(newCat);
        Assert.assertEquals(newCat, newCat);
    }

    @Test
    public void testRemoveCat() {
        Cat newCat = new Cat("Milo", new Date(), 7);
        CatHouse.add(newCat);
        CatHouse.remove(newCat);
        Assert.assertEquals(newCat, newCat);
    }

    @Test
    public void testRemoveCatId() {
        Cat newCat = new Cat("Milo", new Date(), 7);
        CatHouse.add(newCat);
        CatHouse.remove(7);
        Assert.assertEquals(newCat, CatHouse.getCatById(7));
    }

    @Test
    public void testGetCatId() {
        Cat newCat = new Cat("Milo", new Date(), 7);
        CatHouse.add(newCat);
        Cat newIdCat = CatHouse.getCatById(7);
        Assert.assertEquals(newCat, CatHouse.getCatById(7));
    }
    @Test
    public void testGetNumberOfCats1() {
        Cat newCat = new Cat("Milo", new Date(), 7);
        CatHouse.add(newCat);
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }




}
