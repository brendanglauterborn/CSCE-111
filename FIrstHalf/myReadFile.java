import java.io.*;
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/
class myReadFile {
  public static void main(String[] args) throws IOException {
    if (args.length == 0) {
      System.out.println("Usage: java myReadFile filesname.txt");
      System.out.println("Where fileName.txt is the file you want to read.");
      System.exit(0);
    }
    String fileName = args[0];
    FileInputStream input = null;

    try {
      input = new FileInputStream(fileName);
    } catch(Exception e) {
      System.out.println("Your file: " + fileName + " was not found.");
      System.exit(0);
    }
    byte[] buffer = new byte[1000];
    while (input.read(buffer) != -1) {
    System.out.println(new String(buffer));
    }

    // System.out.println("I see you entered: " + fileName);

    try {
      input.close();
      System.out.println("Your file was closed.");
    } catch(Exception e) {
      System.out.println("Your file was not closed.");
    }
  }//end main
}//end class
