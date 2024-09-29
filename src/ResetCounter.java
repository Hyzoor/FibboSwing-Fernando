import javax.swing.*;

public class ResetCounter extends JTextArea {

    private int numberOfResets;

    public ResetCounter(){

        numberOfResets = 0;
        this.setEditable(false);
        updateStatus();
    }



    public void addToTheCounter(){
        numberOfResets++;
        updateStatus();
    }

    public int getNumberOfResets(){
        return numberOfResets;
    }

    private void updateStatus(){
        this.setText("Count of RESETS: " + numberOfResets);
    }
}
