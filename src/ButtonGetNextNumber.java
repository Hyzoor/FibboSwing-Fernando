import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonGetNextNumber extends JButton implements ActionListener {

    public ButtonGetNextNumber(){
        this.setText("GET NEXT FIBONACCI NUMBER");
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        FibonacciCalculator.calculateNextNumber();
        GUI.textArea.addText(String.format("\nTermino numero %d de la serie fibonacci : %d",
                FibonacciCalculator.getSize(), FibonacciCalculator.getLast()));

    }
}
