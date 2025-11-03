/*
Brendan Lauterborn
726004578
CSCE 111 504
*/


class userInput {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Usage: userInput 'words you want to see again.' ");
      System.exit(0);
    }

    for (String value : args ) {
      System.out.println(value);

    }

  }

}
