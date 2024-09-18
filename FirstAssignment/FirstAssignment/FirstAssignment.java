/**
 *	FirstAssignment.java
 *	Display a brief description of your summer vacation on the screen.
 *
 *	To compile Linux:	javac -cp .:mvAcm.jar FirstAssignment.java
 *	To execute Linux:	java -cp .:mvAcm.jar FirstAssignment
 *
 *	To compile MS Powershell:	javac -cp ".;mvAcm.jar" FirstAssignment.java
 *	To execute MS Powershell:	java -cp ".;mvAcm.jar" FirstAssignment
 *
 *	@author	Sai Avula
 *	@since	August 23, 2024
 */
import java.awt.Font;

import acm.program.GraphicsProgram;
import acm.graphics.GLabel;

public class FirstAssignment extends GraphicsProgram {
    
    public void run() {
    	//	The font to be used
    	Font f = new Font("Serif", Font.BOLD, 18);
    	
    	//	Top Line
    	GLabel s1 = new GLabel("What I did on my summer vacation ...", 10, 20);
    	s1.setFont(f);
    	add(s1);
    	
    	//	Line 1
    	GLabel s19 = new GLabel("I went to India and did some stuff there like... ", 10, 40);
    	s19.setFont(f);
    	add(s19);
    	    	
    	//	Line 2
    	GLabel s2 = new GLabel("I went to meet my Grandparents and family and spent a lot of time with them", 10, 60);
    	s2.setFont(f);
    	add(s2);
    	
    	//	Line 3
    	GLabel s3 = new GLabel("I also ate a lot of Indian street food with my family and enjoyed it as it was delicious", 10, 80);
    	s3.setFont(f);
    	add(s3);
    	
    	//	Line 4
    	GLabel s4 = new GLabel("I got too bored there and started studying for the SAT and my AP courses for this year", 10, 100);
    	s4.setFont(f);
    	add(s4);
    	
    	//	Line 5
    	GLabel s5 = new GLabel("I also made lots of CS projects so that I can stay in touch with my java skills", 10, 120);
    	s5.setFont(f);
    	add(s5);
    	
    	//	Line 6
    	GLabel s6 = new GLabel("I also did a lot of HackClub projects for their Arcade Program which was very fun", 10, 140);
    	s6.setFont(f);
    	add(s6);
    	
    	//	Line 7
    	GLabel s7 = new GLabel("Through arcade I got a lot of free things and onjoyed doing the projects", 10, 160);
    	s7.setFont(f);
    	add(s7);
    	
    	//	Line 8
    	GLabel s8 = new GLabel("I also roamed to other places and enjoyed the environment in India as there was perfect weather", 10, 180);
    	s8.setFont(f);
    	add(s8);
    	
    	//	Line 9
    	GLabel s9 = new GLabel("I even drove a motorcycle my myself because my uncle taught me how to", 10, 200);
    	s9.setFont(f);
    	add(s9);
    	//	Line 10
    	GLabel s10 = new GLabel("Once I came back from India I spent time with my friends by playing with them", 10, 220);
    	s10.setFont(f);
    	add(s10);
    	//	Line 11
    	GLabel s11 = new GLabel("I stayed outside most of the time everyday playing volleyball/soccer etc", 10, 240);
    	s11.setFont(f);
    	add(s11);
    	//	Line 12
    	GLabel s12 = new GLabel("I also biked to shoreline with my friends and did some boating on the lake", 10, 260);
    	s12.setFont(f);
    	add(s12);
    	//	Line 13
    	GLabel s13 = new GLabel("We nearly fell over and got really wet when we went boating but it was fun", 10, 280);
    	s13.setFont(f);
    	add(s13);
    	//	Line 14
    	GLabel s14 = new GLabel("I also went to my dad's office and learned a lot of cool things about hardware and software", 10, 300);
    	s14.setFont(f);
    	add(s14);
    	
    	//	Line 15
    	GLabel s15 = new GLabel("Finally, I got ready for school knowing that it is inevitable and my summer has to end:( ", 10, 320);
    	s15.setFont(f);
    	add(s15);
    	
    	
    	
    }
    
}

