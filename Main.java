import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class Main
{
  public static void main (String args[])
  {
      JFrame frame1 = new JFrame("Dr. Doofenshmirtz' -inators");
      frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame1.setSize(500,500);

      //----------------Panel to hold the buttons-------------------
      JPanel panel1 = new JPanel(new GridLayout(2,2, 20,20));

      //--------------------Label 1---------------------
      JLabel label1 = new JLabel("aaaaaa");
      JTextField textfield1 = new JTextField(10);

      //-------------------------Button 1------------------------
      JButton button1 = new JButton("Update Label");

      button1.addActionListener(new ActionListener()
      {
          public void actionPerformed (ActionEvent e)
          {
            String[] phrases = {"Behold! The Copy and Past-inator!", "Behold! The Hot Dog Vendor Revenge-inator!", "Behold! The Blow-Itself-Up-inator!", "Behold! The Multi-Helio-Tactical-Baboon-Glom-inator!"};
              String newText = phrases[(int)(Math.random() * phrases.length)];
              label1.setText(newText);
          }//end the block of what the button will do
      }); //end the ActionListener

      //-----------------------Button 2--------------------------
      JButton button2 = new JButton ("Well, what do you think?");
      button2.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
            System.out.println("Perry the Platypus!?");
        }
      });
      

      panel1.add(button1);
      panel1.add(button2);
      panel1.add(label1);
      panel1.add(textfield1);



      //------------------Panel 2------------------
      JPanel panel2 = new JPanel (new BorderLayout(10,10));


      //-------------Image 1 - the DUCK-------------
      ImageIcon duckImage = new ImageIcon("Dr-Doof.jpg", "Ah, welcome to my secret lair");
      JLabel doofLabelPic = new JLabel(duckImage);
      panel2.add(doofLabelPic);

      frame1.getContentPane().add(BorderLayout.NORTH, panel1);
      frame1.getContentPane().add(BorderLayout.CENTER, panel2);
      frame1.setVisible(true);
  }//end main method
}//end class Main