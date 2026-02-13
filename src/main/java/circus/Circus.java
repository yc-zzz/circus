package circus;

import circus.animal.Animal;
import circus.animal.Duck;
import circus.animal.Parrot;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("John"),
            new Parrot("Jane")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateValue(Asset[] assets) {
        int total = 0;
        for (Asset asset : assets) {
            if (asset.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + asset.getValue());
                continue;
            }
            total += asset.getValue();
            System.out.println("Adding item value: " + asset.getValue());

        }
        return total;
    }


    public static void main(String[] args) {
        System.out.println("Num of animals in circus " + animals.length);
        for (Animal a: animals){
            System.out.println(a);
        }
        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        animalArrayList.add(new Parrot("Elephant"));//supposed to be elephant here but wtv
        System.out.println("Num of animals in circus " + animals.length);

        makeAnimalsTalk();
        System.out.println("Total value of equipments " + calculateValue(equipments));
    }
//    private static Animal findAnimal(ArrayList<Animal> animalArrayList, String name){
//        for(Animal a: animalArrayList){
//
//        }
//    }
}

