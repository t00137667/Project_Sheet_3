public class Laptop extends Computer {
    private boolean touchScreen;

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public Laptop(String make, String type, int size, boolean touchScreen){
        setMake(make);
        memory.setType(type);
        memory.setSize(size);
        setTouchScreen(touchScreen);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
