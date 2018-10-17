import javax.swing.*;
import java.awt.*;

public class Computer implements IDable {
    // Declaring attributes
    private String id;
    private String make;
    protected Memory memory;
    public static int numComputers=0;

    //Constructors
    public Computer(){
        this( "Unknown","Unknown",0);
    }

    public Computer(String make, String memType, int memSize){
        setMake(make);
        memory = new Memory(memType,memSize);
    }
    //Getters
    public String getId() {
        return id;
    }

    public String getMake() {
        return make;
    }
    // Setters
    @Override
    public void setID(String id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // To String
    @Override
    public String toString() {
        return "\nID: " + getId() + "\nMake: " + getMake() + memory.toString();
    }

    public Laptop makeLaptop(){
        Laptop laptop = new Laptop();
        laptop.setID(Integer.toString(numComputers));
        laptop.setMake(JOptionPane.showInputDialog("Please enter the make of the laptop:"));
        laptop.memory.setType(JOptionPane.showInputDialog("Please enter the type of memory of the laptop"));
        laptop.memory.setSize(Integer.parseInt(JOptionPane.showInputDialog("Please enter the size of the memory of the laptop:")));
        laptop.setTouchScreen(JOptionPane.showConfirmDialog(null, "Would you like this laptop to have a touchscreen?","Touchscreen",JOptionPane.YES_NO_OPTION)==0);
        return laptop;
    }
}
