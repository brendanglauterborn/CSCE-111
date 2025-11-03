import javax.swing.JOptionPane;

/*
Brendan Lauterborn
726004578
CSCE 111 504
*/
//This program will count up or down based on what the user gives us.
class BrendanLauterbornExerciseFour {
  public static void main(String[] args) {
    //Introducing the program and asking the user if they would like to count up or down
    JOptionPane.showMessageDialog(null, "Hello. Welcome to my program!");
    String upOrDown = JOptionPane.showInputDialog("Would you like to count up or down?");

    // if the user says up we will ask them what they would like to count up to
    if (upOrDown.equals("up")) {
      String numberTo = JOptionPane.showInputDialog("What would you like to count to?");
      String userIncrement = JOptionPane.showInputDialog("What would you like the increments to be?");
      //converting user input into int
      int iNumberTo = Integer.parseInt(numberTo);
      int iUserIncrement = Integer.parseInt(userIncrement);
      JOptionPane.showMessageDialog(null,
        String.format("Ok, we will start counting to \n %s", numberTo));
        //we begin counting up until we reach the number the user entered
      for (int i = 0; i <= iNumberTo; i += iUserIncrement){
        JOptionPane.showMessageDialog(null,
          String.format("We are counting. \n %d",i));
    }
  }
  //if the user says down, we will ask them what they would like to count down by
    else if (upOrDown.equals("down")) {
      String numberTo = JOptionPane.showInputDialog("What would you like to count down from?");
      String userIncrement = JOptionPane.showInputDialog("What would you like the increments to be?");
      int iNumberTo = Integer.parseInt(numberTo);
      int iUserIncrement = Integer.parseInt(userIncrement);
      JOptionPane.showMessageDialog(null,
        String.format("Ok, we will start counting down from  \n %s", numberTo));
        // we begin counting down until we reach 0
      for (int j = iNumberTo; j >= 0; j -= iUserIncrement){
        JOptionPane.showMessageDialog(null,
          String.format("We are counting. \n %d",j));
    }

    }
    else{
      System.out.println("Oops. You have entered an incorrect number");
    }
    //showing the user the program has finished
    JOptionPane.showMessageDialog(null,"We have finished counting!");
  }//end main
}// end class
