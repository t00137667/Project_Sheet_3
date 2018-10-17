import javax.swing.*;

public class ComputerDriver {
    public static void main(String[] args) {

        // validate input to int to ensure proper function of program
        int numComputers = validateToInt("Enter the number of computers:");

        // initalising the array of computers with the validated int
        Computer[] computerArray = new Computer[numComputers];

        for (int i = 0; i<numComputers; i++){
            //Instansiate new computer

            Computer computer = new Computer();
            //Increment the number of computers
            Computer.numComputers++;
            //Ask if a laptop is desired

            boolean laptop = JOptionPane.showConfirmDialog(null,"Do you want to make a laptop?","Laptop",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0;
            //Create the required object
            if (laptop){
                computerArray[i] = computer.makeLaptop();
            }
            else{
                computer.setID(Integer.toString(Computer.numComputers));
                computer.setMake(JOptionPane.showInputDialog("What is the make of the computer"));
                computer.memory.setType("What is the memory type");
                computer.memory.setSize(validateToInt("What is the size of the memory of the computer"));
            }
            computerArray[i] = computer;
        }

        for (int i = 0; i<numComputers; i++) {

        }




        System.exit(0);
    }

    private static int validateToInt(String text){
        String numberAsString = JOptionPane.showInputDialog(text);
        int count=0;
        boolean valid = false;

        while (!valid){
            count = 0;

            for (int i = 0; i<numberAsString.length();i++) {
                if (Character.isDigit(numberAsString.charAt(i))){
                    count++;
                }
            }
            if (count == numberAsString.length() && numberAsString.length() != 0){
                valid = true;
            }
            else{
                numberAsString = JOptionPane.showInputDialog("Error! Please enter an integer for the number of computers");
            }
        }
        int number = Integer.parseInt(numberAsString);
        return number;
    }


}
