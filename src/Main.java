import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(myDogs());

        String dog = "Akita";
        HashSet<String> dogHouse = myDogs();
        dogHouse.add(dog);

        System.out.println(dogHouse);

        String newDog = "Chow Chow";
        if (myDogs().contains(newDog)) {
            System.out.println(newDog + " è già nella Dog House!");
        } else {
            System.out.println(newDog + "non è ancora entrato nella Dog House!");

        }

    }

    private static HashSet<String> myDogs() {
        HashSet<String> dogs = new HashSet<String>();
        dogs.add("Chow Chow");
        dogs.add("Shiba Inu");
        dogs.add("Labrador");
        dogs.add("Golden Retriever");
        dogs.add("Samoyed");
        return dogs;
    }
}