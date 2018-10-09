import javax.swing.*;

public class HouseDriver {
    public static void main(String[] args) {
        House house = new House();

        JOptionPane.showMessageDialog(null, house.toString());
    }
}
