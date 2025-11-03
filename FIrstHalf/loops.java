import javax.swing.JOptionPane;

/*
Brendan Lauterborn
726004578
CSCE 111 504
*/

class loops  {
  public static void main(String[] args) {
    int count = 10;
    JOptionPane.showMessageDialog(null, "Welcome to my program.");
    String answer = JOptionPane.showInputDialog("What would you like to count to?");
    String output1 = String.format("This is too long for an option pane");
    JOptionPane.showMessageDialog(null,output1);
    JOptionPane.showMessageDialog(null,
      String.format("We are counting to . \n %s", answer));
    int iAnswer = Integer.parseInt(answer);

    for (int i = 1; 1 <= iAnswer ; i++) {
      JOptionPane.showMessageDialog(null,
        String.format("We are counting. \n %d",i));

      // System.out.println(i + 10);
      // System.out.println(i);
    }

    // do {
    //   System.out.println("Hello World");
    //   count++;
    // } while (count < 15);

    // while (count <= 10) {
    //   System.out.println("Hello World");
    //   count ++;
    //   if (count == 5) {
    //     continue;
    //   }//end if
    //   System.out.println(count);
    // }//end while
    JOptionPane.showMessageDialog(null,"That's all");
  }//end main

}// end class
