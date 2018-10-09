public class House {
    private String address;
    private String type;
    private double price;
    private Person owner;

    //no argument constructor

    public House(){
        setAddress("No Address Specified");
        setType("No Type Specified");
        setPrice(0.0);
        setOwner(new Person("No owner specified"));
    }

    //four argument constructor

    public House(String address,String type,double price, Person owner){
        setAddress(address);
        setType(type);
        setPrice(price);
        setOwner(owner);
    }


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

    @Override
    public String toString() {
        return super.toString();
    }
}