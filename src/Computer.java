public class Computer implements IDable {
    private String id;
    private String make;
    protected Memory memory;



    public Computer(){
        this(null,null,0);
    }

    public Computer(String make, String memType, int memSize){
        setMake(make);
        memory.setType(memType);
        memory.setSize(memSize);
    }

    public String getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    @Override
    public void setID(String id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "\nID: " + getId() + "\nMake: " + getMake() + memory.toString();
    }
}
