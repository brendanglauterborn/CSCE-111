import java.io.*;
/*
Brendan Lauterborn
726004578
CSCE 111 504
*/
class myWriteFile {
  public static void main(String[] args) throws IOException {
    FileOutputStream fs =null;
    PrintWriter output = null;

    fs = new FileOutputStream("myOutput.txt");
    output = new PrintWriter(fs);

    for (int i = 0; i < 10 ; i++ ) {
      output.write("I saw what you did last summer.");
      output.println();
    }

    output.close();
  }//end main
}//end class
