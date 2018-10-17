public class Memory {
    private String type;
    private int size;

    public Memory(){
        this("Unknown",0);
    }

    public Memory(String type, int size){
        setType(type);
        setSize(size);
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\nMemory type: " + getType() + "\nMemory Size: " + getSize();
    }
}
