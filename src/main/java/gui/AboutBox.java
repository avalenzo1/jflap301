/*
 *  JFLAP - Formal Languages and Automata Package
 * 
 *  Susan H. Rodger
 *  Computer Science Department
 *  Duke University
 *  August 27, 2009

 *  Copyright (c) 2002-2009
 *  All rights reserved.

 *  JFLAP is open source software. Please see the LICENSE for terms.
 *
 */

 package gui;

 import javax.swing.*;
 import javax.swing.border.EmptyBorder;
 import java.awt.*;
 import java.awt.event.*;
 import java.io.IOException;
 import java.util.Properties;
 
 /**
  * The <TT>AboutBox</TT> is the about box for JFLAP.
  * 
  * @author Thomas Finley
  */
 
 public class AboutBox extends JWindow {
	 private static final long serialVersionUID = 1L;
 
	 /**
	  * Instantiates a new <TT>AboutBox</TT>.
	  * 
	  * @param owner the owner of this about box
	  */
	 public AboutBox(Frame owner) {
		 super(owner);

		 /**
		  * Bro this is ai slop 🤮
		  */

		 // Use a simple BorderLayout
		 JPanel contentPanel = new JPanel(new BorderLayout(0, 0));
		 contentPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		 contentPanel.setBackground(Color.WHITE);

		 // Load the image as an ImageIcon (handles resource loading properly)
		 ImageIcon icon = new ImageIcon(getClass().getResource("/MEDIA/about.png"));
		 
		 // Set up the image label
		 JLabel imageLabel = new JLabel(icon);
		 imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		 
		 // Add components to the panel
		 contentPanel.add(imageLabel, BorderLayout.CENTER);

		 // Set a proper fixed size that fits the entire image and text
		 int imageWidth = icon.getIconWidth();
		 int imageHeight = icon.getIconHeight();
		 
		 contentPanel.setPreferredSize(new Dimension(imageWidth, imageHeight));
		 
		 // Set the content pane
		 setContentPane(contentPanel);
		 
		 // Add click listener to dismiss
		 addMouseListener(new MouseAdapter() {
			 public void mouseClicked(MouseEvent e) {
				 dispose();
			 }
		 });
	 }
 
	 /**
	  * Instantiates a new <TT>AboutBox</TT> with no specified owner.
	  */
	 public AboutBox() {
		 this((Frame) null);
	 }
 
	 /**
	  * Displays this about box.
	  */
	 public void displayBox() {
		 // Pack the window to fit the components
		 pack();
		 
		 // Log the actual size after packing
		 Dimension actualSize = getSize();
		 System.out.println("About box size after pack: " + actualSize.width + "x" + actualSize.height);
		 
		 // Center on screen
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 Dimension boxSize = getSize();
		 setLocation((screenSize.width - boxSize.width) / 2,
				 (screenSize.height - boxSize.height) / 2);
		 
		 // Show the window
		 setVisible(true);
		 toFront();
	 }
 
	 /**
	  * The version string.
	  */
	 public static final String VERSION;
 
	 /**
	  * Some simple test code for the about box.
	  */
	 public static void main(String args[]) {
		 AboutBox box = new AboutBox();
		 box.displayBox();
	 }
 
	 static {
		 // Load version from properties file
		 Properties props = new Properties();
		 String version = "7.2"; // Default fallback version
		 try {
			 props.load(AboutBox.class.getResourceAsStream("/version.properties"));
			 version = props.getProperty("application.version", version);
		 } catch (Exception e) {
			 System.err.println("Failed to load version: " + e.getMessage());
		 }
		 VERSION = version;
	 }
 }