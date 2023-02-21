import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Numberguessing extends Frame implements ActionListener
{
	JFrame f1=new JFrame();
	JFrame f2=new JFrame();
	JLabel l1=new JLabel("Number Guessing Game");
	JTextField ta1=new JTextField();
	JTextField ta2=new JTextField("You hava 10 attempts");
	JTextArea ta3=new JTextArea();
	JButton b1=new JButton("Generate Number");
	JButton b2=new JButton("Guess The Number");
	JButton b3=new JButton("Ok");
	JButton b4=new JButton();
	JButton b5=new JButton();
	JButton b6=new JButton("Play again");
	Font font1=new Font("Courier",Font.BOLD,16);
	Font font2=new Font("Courier",Font.BOLD,14);
	int a=0;
	int num=10;
	Numberguessing n;
	public Numberguessing()
	{
		f1.setBackground(Color.BLACK);
		l1.setBounds(190,20,300,40);
		b4.setIcon(new ImageIcon("D:\\downloads\\360_F_386078374_WDOvxzHmUCsg0h3AufqbhtuWkBKz8XpU.jpg"));
		b5.setIcon(new ImageIcon("D:\\downloads\\download.png"));
		b1.setBounds(50,230,150,30);
		b2.setBounds(350,230,150,30);
		b3.setBounds(250,520,50,20);
		b4.setBounds(50,60,150,150);
		b5.setBounds(350,60,150,150);
		b6.setBounds(180,450,200,50);
		ta1.setBounds(90,300,400,50);
		ta2.setBounds(90,400,400,30);
		ta3.setBounds(0,0,600,500);
		l1.setFont(font1);
		ta1.setFont(font2);
		ta2.setFont(font2);
		ta3.setFont(font1);
		ta3.setBackground(Color.YELLOW);
		ta3.append("===>Rules and Regulations<==="+"\n"+"\n");
		ta3.append("1. It is Number Guessing Game"+"\n");
		ta3.append("2. Click on Generate Number"+"\n");
		ta3.append("3. Computer will generate one number from 1-100"+"\n");
		ta3.append("4. Click on Guess the Number"+"\n");
		ta3.append("5. You need to guess the correct number in 10 attempts to win this game"+"\n");
		ta3.append("6. You can win upto 10000 $"+"\n");
		ta3.append("7. Click Ok to continue"+"\n");
		f1.add(l1);
		f1.add(b1);
		f1.add(b2);
		f2.add(b3);
		f1.add(b4);
		f1.add(b5);
		f1.add(b6);
		f1.add(ta1);
		f1.add(ta2);
		f2.add(ta3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b6.addActionListener(this);
		b6.setVisible(false);
		f2.setLayout(null);
		f2.setSize(600,600);
		f2.setVisible(true);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			Random random=new Random();
			a=random.nextInt(1,101);
			System.out.println(a);
			ta1.setText("Number is Generated ");
			b1.setVisible(false);
		}
		else if(ae.getSource()==b2)
		{
			for(int x=num;x>=1;x--)
			{
				int user=Integer.parseInt(JOptionPane.showInputDialog("Guess The Number"));
				ta2.setText("You have "+(x-1)+" attempts left");
				if(a==user)
				{
					ta1.setText("Hurrah!! You guessed it correct!! You have won "+(1000*x)+" $");
					break;
				}
				else if(a>user)
				{
					ta1.setText("Guess greater");
				}
				else if(a<user)
				{
					ta1.setText("Guess lower");
				}				
			}
			ta2.setText("The generated number is "+a);
			b2.setVisible(false);
			b6.setVisible(true);
		}
		else if(ae.getSource()==b3)
		{
			f2.setVisible(false);
			f1.setSize(600,600);
			f1.setLayout(null);
			f1.setVisible(true);
			f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		else if(ae.getSource()==b6)
		{
			new Numberguessing();
		}
	}
	public static void main(String args[])
	{
		new Numberguessing();
	}
}