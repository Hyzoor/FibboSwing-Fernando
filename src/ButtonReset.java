import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonReset extends JButton implements ActionListener {


    public ButtonReset(){
        this.setText("RESET");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        FibonacciCalculator.reset();
        GUI.resetCounter.addToTheCounter();
    }

}
