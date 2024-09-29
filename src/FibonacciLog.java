import javax.swing.*;

public class FibonacciLog extends JTextArea {

    public FibonacciLog(){
        this.setEditable(false);
    }

    public void addText(String newText){
        this.append(newText);
        this.setCaretPosition(this.getDocument().getLength());
    }

    public void clearText(){
        this.setText("");
    }
}
