package io.codedifferently;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {

    @Test
    public void constructorTest(){
        // Given
        final String first = "Fred";
        final String last = "Flintstone";
        final int energy = 50;

        // When
        final Human testHuman = new Human(first, last);
        final String actualFirst = testHuman.getFirstName();
        final String actualLast = testHuman.getLastName();
        final int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(first, actualFirst);
        Assert.assertEquals(last, actualLast);
        Assert.assertEquals(energy, actualEnergy);

    }

    @Test
    public void eatTest() {
        // Given
        final Fruit pineapple = new Fruit("Pineapple", 10);
        final int expectedEnergy = 60;
        final Human testHuman = new Human("Barney", "Rubble");

        // When
        testHuman.eat(pineapple);
        final int actualEnergy = testHuman.getEnergy();
        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);

    }

    @Test
    public void workTest(){
        // Given
        final Human test = new Human("Fred", "Flintstone");
        final int expectedEnergy = 30;

        // When
        test.work(2);
        final int actualEnergy = test.getEnergy();

        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void energyMaxTest(){
        // Given
        Human testHuman = new Human("Wilma", "Flintstone");
        Fruit testFruit1 = new Fruit("Dragon Fruit", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("apple", 20);

        // When
        testHuman.eat(testFruit1);
        testHuman.eat(testFruit2);
        testHuman.eat(testFruit3);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(100, actualEnergy);


    }

    @Test
    public void workMin(){
        //Given
        Human testHuman = new Human("Wilma", "Flintstone");

        //When
        testHuman.work(6);
        int actualEnergy = testHuman.getEnergy();

        //Then
        Assert.assertEquals(50, actualEnergy);
    }
    @Test
    public void maxEnergyChangeTest(){
        Human h1 = new Human("John", "Doe");
        Fruit testFruit1 = new Fruit("Dragon Fruit", 20);
        Fruit testFruit2 = new Fruit("Orange", 20);
        Fruit testFruit3 = new Fruit("apple", 20);

        Human.maxEnergy = 150;

        h1.eat(testFruit1);
        h1.eat(testFruit2);
        h1.eat(testFruit3);

        int actualEnergy = h1.getEnergy();
        
        Assert.assertEquals(110, actualEnergy);

    

    

    }


}