/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enhancedcircle;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.KeyEvent;
/**
 *
 * @author ASUS
 */
public class CirclePanel extends JPanel{
    private final int CIRCLE_SIZE = 50;
private int x,y;
private int panelwidth, panelheight;
private Color c;
JButton left = new JButton("Left");
JButton right = new JButton("Right");
JButton up = new JButton("Up");
JButton down = new JButton("Down");
//---------------------------------------------------------------
// Set up circle and buttons to move it.
//---------------------------------------------------------------
public CirclePanel(int width, int height)
{
// Set coordinates so circle starts in middle
panelwidth = width;
panelheight = height;
x = (width/2)-(CIRCLE_SIZE/2);
y = (height/2)-(CIRCLE_SIZE/2);
c = Color.green;
// Need a border layout to get the buttons on the bottom
this.setLayout(new BorderLayout());
// Create buttons to move the circle

// Add listeners to the buttons
left.addActionListener(new MoveListener(-20,0));
left.setMnemonic(KeyEvent.VK_L);
left.setToolTipText("Moves the circle to the left by 20 pixel  alt+l");
right.addActionListener(new MoveListener(20,0));
right.setMnemonic(KeyEvent.VK_R);
right.setToolTipText("Moves the circle to the right by 20 pixel  alt+r");
up.addActionListener(new MoveListener(0,-20));
up.setMnemonic(KeyEvent.VK_U);
up.setToolTipText("Moves the circle upwards by 20 pixel  alt+u");
down.addActionListener(new MoveListener(0,20));
down.setMnemonic(KeyEvent.VK_D);
down.setToolTipText("Moves the circle downwards by 20 pixel  alt+d");
// Need a panel to put the buttons on or they'll be on
// top of each other.
JPanel buttonPanel = new JPanel();
buttonPanel.add(left);
buttonPanel.add(right);
buttonPanel.add(up);
buttonPanel.add(down);
// Add the button panel to the bottom of the main panel
this.add(buttonPanel, "South");
}
//---------------------------------------------------------------
// Draw circle on CirclePanel
//---------------------------------------------------------------
public void paintComponent(Graphics page)
{
   super.paintComponent(page);
page.setColor(c);
page.fillOval(x,y,CIRCLE_SIZE,CIRCLE_SIZE);
}
//---------------------------------------------------------------
// Class to listen for button clicks that move circle.
//---------------------------------------------------------------
private class MoveListener implements ActionListener
{
private int dx;
private int dy;
//---------------------------------------------------------------
// Parameters tell how to move circle at click.
//---------------------------------------------------------------
public MoveListener(int dx, int dy)
{
this.dx = dx;
this.dy = dy;
}
//---------------------------------------------------------------
// Change x and y coordinates and repaint.
//---------------------------------------------------------------
public void actionPerformed(ActionEvent e)
{
x += dx;
y += dy;
if(x <= 0){left.setEnabled(false);}else{left.setEnabled(true);}
if(y <= 0){up.setEnabled(false);}else{up.setEnabled(true);}
if(x >= panelwidth){right.setEnabled(false);}else{right.setEnabled(true);}
if(y >= panelheight){down.setEnabled(false);}else{down.setEnabled(true);}
repaint();
}
} 

}
