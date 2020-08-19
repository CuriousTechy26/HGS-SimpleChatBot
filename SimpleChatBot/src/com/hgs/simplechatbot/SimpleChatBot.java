package com.hgs.simplechatbot;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SimpleChatBot extends JFrame implements ActionListener{ //SimpleClass

    JTextArea Chatarea = new JTextArea(); //JTextArea for Chat Box
	JTextField Chatbox = new JTextField(); //JTextField for User ChatBox
	JLabel typehere, lt,heading;

	public SimpleChatBot() { 
		JFrame frame=new JFrame();                                         //JFrame initialization
		typehere = new JLabel("Type your message here:");                  //JLabel
	    typehere.setBounds(25,670,500,30);                                  //JLabel Positioning
	    typehere.setForeground(Color.white);                                 //JLabelText Color
	    heading = new JLabel("WELCOME TO HINDUJA GLOBAL SOLUTIONS");           //JLabel
	    heading.setBounds(270,40,500,30);                                        //JLabel Positioning
	    heading.setForeground(Color.white);                                    //JLabelText Color
	    lt = new JLabel("Chat Box:"); 
	    lt.setBounds(50, 80, 100, 30);
	    lt.setForeground(Color.white);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Chat Bot");
		frame.setVisible(true);
		frame.setResizable(false);                                            //JFrame has fixed size
		frame.setLayout(null);
		frame.setSize(800 , 800);                                             //JFrame Size
		frame.setLocationRelativeTo(null);                                    //JFrame Positioning
		frame.getContentPane().setBackground(Color.BLUE);                     //JFrame Background Color
		frame.add(Chatarea);
		frame.add(Chatbox);
		frame.add(typehere);
		frame.add(lt);
		frame.add(heading);
	    
		
		//FOR TEXT AREA
		Chatarea.setSize(700, 400);
		Chatarea.setLocation(48,120);
		Chatarea.setEditable(false);
		
		//FOR TEXT FIELD
		Chatbox.setSize(740, 30);
		Chatbox.setLocation(28,700);
		
		//Adding Action Listener
		Chatbox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String gtext = Chatbox.getText().toLowerCase();
				Chatarea.append("User -->" + gtext + "\n"); //Taking User Input
				Chatbox.setText("");
			
				//BASIC HI
				if(gtext.contains("hi") || gtext.contains("hola") || gtext.contains("namaste") || gtext.contains("HI") || gtext.contains("hello") ) {
					bot("Hello there. I am CODIE, your today's chat bot. "); //Bot response
				}else {
					int rand = (int) (Math.random()* 3 + 1);
					if(rand == 4) {
					bot("I DON'T UNDERSTAND YOU");
				}
				
			}
			
				//HOW ARE YOU?
				if(gtext.contains("how") || gtext.contains("how r you") || gtext.contains("how r u") || gtext.contains("what")) {
					bot("i am fine, how are you?"); //Bot Response
				}else {
					int rand = (int) (Math.random()* 3 + 1);
					if(rand == 4) {
					bot("I DON'T UNDERSTAND YOU");
				}else if(rand == 1) {
					bot("SORRY, I DONT KNOW THIS!!");
				}
				
			}
				//REPLY TO HOW ARE YOU?
				if(gtext.contains("fine") || gtext.contains("wonderful") || gtext.contains("great") || gtext.contains("fantastic") || gtext.contains("good")) {
					bot("That is great to know! How May I help you?");
				}else {
					int rand = (int) (Math.random()* 3 + 1);
					if(rand == 3) {
					bot("I DON'T UNDERSTAND YOU, MY FRIEND");
				}else if(rand == 5) {
					bot("SORRY, I DONT KNOW THIS!!");
				}
				
			}
				
				//I WANT TO KNOW ABOUT
				if(gtext.contains("want") || gtext.contains("know") || gtext.contains("need") || gtext.contains("something") || gtext.contains("about") || gtext.contains("help")) {
					bot("okay, please wait. Searching......");
				}else {
					int rand = (int) (Math.random()* 3 + 1);
					if(rand == 4) {
					bot("I DON'T UNDERSTAND YOU!!");
				}else if(rand == 1) {
					bot("SORRY, PLEASE TRY AGAIN!!");
				}
				
			}
				
				//CONVERSATION
				if(gtext.contains("ok") || gtext.contains("yes please") || gtext.contains("go ahead") || gtext.contains("great") || gtext.contains("alright")) {
					bot("Is this what you want?");
				}else {
					int rand = (int) (Math.random()* 3 + 1);
					if(rand == 4) {
					bot("I DON'T UNDERSTAND YOU");
				}else if(rand == 6) {
					bot("SORRY, PLEASE TRY AGAIN!!");
				}
				
			}
				
				//ANSWER
				if(gtext.contains("no") || gtext.contains("not at all") || gtext.contains("search again") || gtext.contains("please") || gtext.contains("nope")) {
					bot("okay let me search again");
				}else {
					int rand = (int) (Math.random()* 3 + 1);
					if(rand == 4) {
					bot("I DON'T UNDERSTAND YOU");
				}else if(rand == 6) {
					bot("SORRY, PLEASE TRY AGAIN!!");
				}
				
			}
				
				//Bye
				if(gtext.contains("bye") || gtext.contains("gracias") || gtext.contains("bie") || gtext.contains("tata") || gtext.contains("sayonara")) {
					bot("Bye, It was my pleasure in assisting you, Have a nice day!!");
				}else {
					int rand = (int) (Math.random()* 3 + 1);
					if(rand == 4) {
					bot("I DON'T UNDERSTAND YOU");
				}else if(rand == 7) {
					bot("SORRY, PLEASE TRY AGAIN!!");
				}
				
			}
				
				//Thanks
				if(gtext.contains("Thanks") || gtext.contains("thank you") || gtext.contains("thnk u") || gtext.contains("thank yu") || gtext.contains("thank u")) {
					bot("Your welcome!!");
				}else {
					int rand = (int) (Math.random()* 3 + 1);
					if(rand == 4) {
					bot("I DON'T UNDERSTAND YOU");
				}else if(rand == 6) {
					bot("SORRY, PLEASE TRY AGAIN!!");
				}
				
			}
				
				
			}
			
		});
		
		}

    private void bot(String string) {
    	Chatarea.append("BOT -->" +string+ "\n");
    }
    
	public static void main(String[] args) {
		
		new SimpleChatBot();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
