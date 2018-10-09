import javax.swing.*;

/**
 * A minimal driver class for testing the functionality of the House object class.
 * */
public class HouseDriver {
    public static void main(String[] args) {


        House house = new House();
        Person owner = new Person("Bob",30,'m');

        JOptionPane.showMessageDialog(null, house.toString());

        House secondHouse = new House("The road","Bungaloo",85000.0,owner);
        JOptionPane.showMessageDialog(null, secondHouse.toString());

        House thirdHouse = new House("The bog","Ruin",0.0,"Ghost",500,'d');
        JOptionPane.showMessageDialog(null, thirdHouse.toString());
    }
}
