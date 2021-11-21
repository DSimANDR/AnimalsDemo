package at.campus02.simic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal animalLoewe;
    Animal animalHund;
    Animal animalKatze;
    @BeforeEach
    void setUp() {
        this.animalLoewe = new Animal();
        this.animalHund = new Animal();
        this.animalKatze = new Animal();
        this.animalKatze.name = "Mimi";
        this.animalKatze.animalLoud = "Miau";
        this.animalKatze.age = 2;
        this.animalLoewe.name = "Hektor";
        this.animalLoewe.animalLoud = "Roarr";
        this.animalLoewe.age = 5;
        this.animalHund.name = "Roki";
        this.animalHund.animalLoud = "Wuff";
        this.animalHund.age = 3;

    }

    @Test
    void giveAnimalLoud() {
        String expectedLoewe = "Roarr";
        String expectedHund = "Wuff";
        String expectedKatze = "Miau";
        Assertions.assertEquals(expectedLoewe, this.animalLoewe.giveAnimalLoud("Roarr"));
        Assertions.assertEquals(expectedHund, this.animalHund.giveAnimalLoud("Wuff"));
        Assertions.assertEquals(expectedKatze, this.animalKatze.giveAnimalLoud("Miau"));
    }

    @Test
    void getNameAndAge() {
        String expectedLoewe = "Alter: 5; Name: Hektor";
        String expectedHund = "Alter: 3; Name: Roki";
        String expectedKatze = "Alter: 2; Name: Mimi";
        Assertions.assertEquals(expectedLoewe, this.animalLoewe.getNameAndAge());
        Assertions.assertEquals(expectedHund, this.animalHund.getNameAndAge());
        Assertions.assertEquals(expectedKatze, this.animalKatze.getNameAndAge());
    }

    @Test
    void ageCategory() {
        String expectedLoewe = "old animal";
        String expectedHund = "young animal";
        String expectedKatze = "baby animal";
        Assertions.assertEquals(expectedLoewe, this.animalLoewe.ageCategory());
        Assertions.assertEquals(expectedHund, this.animalHund.ageCategory());
        Assertions.assertEquals(expectedKatze, this.animalKatze.ageCategory());
    }
}