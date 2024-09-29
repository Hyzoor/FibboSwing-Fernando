import javax.swing.*;
import java.awt.*;

public class GUI {

    static FibonacciLog textArea = new FibonacciLog();
    static ButtonGetNextNumber getNextNumber = new ButtonGetNextNumber();
    static ButtonReset buttonReset = new ButtonReset();
    static ResetCounter resetCounter = new ResetCounter();


    public static void createFrame(){

        JFrame mainFrame = new JFrame("Fibonacci Calculator");
        mainFrame.setBounds(200,300,400,500);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(new BorderLayout(10,10));
        mainFrame.setResizable(false);

        JPanel mainPanel = new JPanel(new GridLayout(4,1,25,25));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(40,40,40,40));

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);


        mainPanel.add(getNextNumber);
        mainPanel.add(buttonReset);
        mainPanel.add(scrollPane);
        mainPanel.add(resetCounter);

        mainFrame.add(mainPanel, BorderLayout.CENTER);
        mainFrame.setVisible(true);
    }

}
