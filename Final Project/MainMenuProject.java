//Main Menu Project- Last Updated: Emily 11/30/2019 7:30pm
import javax.swing.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.*;
import java.io.*;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
/*
Main menu for the project to call upon all the methods we write
*/
public class MainMenuProject {

  public static void main(final String[] args) throws IOException, InterruptedException {

    //call up the functions from ProjectFunctions java file
    ProjectFunctions myFunctions = new ProjectFunctions();
    //start creating the panel for the gui
    final JPanel panel = new JPanel();
    // making names for choices
    Object[] options = {"Music Video", "Animation", "Webpage", "Karaoke", "Quiz"};
    //...and passing `frame` instead of `null` as first parameter
    Object selectionObject = JOptionPane.showInputDialog(panel, "Choose", "Menu",
    JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
    // identify what the user chooses
    String selectionString = selectionObject.toString();
    // Shows message of what you chose
    //JOptionPane.showMessageDialog(null, selectionString);


    // run the code based on what the user selected
    if (selectionString.contains("Quiz")){
      //JOptionPane.showMessageDialog(null,"Running Quiz");
      ProjectFunctions.Quiz();
    }
    else if (selectionString.contains("Music Video")){
      //JOptionPane.showMessageDialog(null,"Running Video");
      ProjectFunctions.MusicVideo();
    }
    else if (selectionString.contains("Animation")){
      //JOptionPane.showMessageDialog(null,"Running animation");
      ProjectFunctions.Animation();
    }
    else if (selectionString.contains("Karaoke")){
      //JOptionPane.showMessageDialog(null,"Running Karaoke");
      ProjectFunctions.Karaoke();
    }
    else if (selectionString.contains("Webpage")){
      //JOptionPane.showMessageDialog(null,"Running Webpage");
      ProjectFunctions.Website();
    }
    else{
      JOptionPane.showMessageDialog(null, "Error running- see selectedOption.");
    }


  }//end main

}//end class
