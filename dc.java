import javax.swing.*;
/*import javax.swing.text.StyledEditorKit.BoldAction;*/

import java.awt.*;
import java.awt.event.*;
import java.util.Date;


class Main{
    public static void main(String args[]){
        System.out.println("Testing the java code....");
        new Mywindow();
    }
}

class Mywindow extends JFrame{

    private JLabel heading;
    private JLabel clockLabel;

    private Font font = new Font("",Font.BOLD,35);

    Mywindow() 
    {

        super.setTitle("MyClock");
        super.setSize(400,400);
        super.setLocation(300, 50);
        this.createGUI();
        this.startClock();
        super.setVisible(true);
    }

    public void createGUI(){
        //gui
        heading = new JLabel("Myclock");

        clockLabel=new JLabel("clock");
        heading.setFont(font);
        clockLabel.setFont(font);


        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);

    }

    public void startClock()
    {
        Timer timer= new Timer(1000,new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    String dateTime=new Date().toString();
                    clockLabel.setText(dateTime);
                }
            }
        );
        

        timer.start();

    }

}

 