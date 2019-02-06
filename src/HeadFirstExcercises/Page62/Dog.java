package HeadFirstExcercises.Page62;

public class Dog {
    String name;
    //Primitive variable

    public void bark() {
        System.out.println(name + " says Ruff!");
    }

    public void eat() {

    }

    public void chaseCat() {

    }

    public static void main (String [] args) {
        Dog dog1 = new Dog();
        //Primitive variable
        //New dog object
        dog1.bark();
        //Dog object calling bark method
        dog1.name = "Bart";

        Dog [] myDogs = new Dog[3];
        //Dog Array called myDogs
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        //Assign dogs to the arrays

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        //Access the dog arrays and assign names to it

        System.out.print("Last dog's name is ");
        System.out.println(myDogs[2].name);
        //Prints out the last dogs name from the array

        int x = 0;
        while (x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }
}
