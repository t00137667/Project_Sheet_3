/**
 * 
 * @author t00137667
 * @version 1.0
 * This class declares an object called House with takes in details about the house.
 */

public class House {
    //Declaring attributes;

    private String address;
    private String type;
    private double price;
    private Person owner;

    //Start Constructors

    //no argument constructor

    public House(){
        setAddress("No Address Specified");
        setType("No Type Specified");
        setPrice(0.0);
        setOwner(new Person("No owner specified"));
    }

    //four argument constructor

    /**
     *
     * @param address The address of the house
     * @param type The type of house
     * @param price The price of the house
     * @param owner The current owner of the house
     */
    public House(String address,String type,double price, Person owner){
        setAddress(address);
        setType(type);
        setPrice(price);
        setOwner(owner);
    }

    //six argument constructor

    /**
     * This method takes in three arguements for the house, and three arguments for the person
     * for six arguments in total
     * It then creates a Person object with the arguments
     * and assigns it with the other arguments to the House object
     *
     * @param address The address of the house
     * @param type The type of house
     * @param price The price of the house
     * @param name The name of the owner of the house
     * @param age The age of the owner of the house
     * @param gender The gender of the owner of the house
     */
    public House(String address, String type, double price, String name, int age, char gender){
        setAddress(address);
        setType(type);
        setPrice(price);
        Person owner = new Person(name,age,gender);
        setOwner(owner);
    }

    //End Constructors

    //Getters and setters....

    public double getPrice() {
        return price;
    }

    public Person getOwner() {
        return owner;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return The object attributes as a string
     */
    public String toString() {
        return "Address: "+ getAddress()+"\nType: "+ getType()+ "\nPrice: "+getPrice() + "\n" + getOwner().toString();
    }
}
