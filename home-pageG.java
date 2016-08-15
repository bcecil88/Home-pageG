https://github.com/bcecil88/Home-pageG

$ git add -A

$ git commit -m "update README"

$ git push origin master

import java.io.Console;
 
public class TreeStory {
    public static void main(String[] args) {
        Console console = System.console();
      String ageAsString = console.readLine("How old are you?  ");
      int age = Integer.parseInt(ageAsString);
  if (age < 13) {
    console.printf("Sorry, you must be at least 13 to use this program.\n");
    System.exit(0);
  }
      String name = console.readLine("Enter your name:  ");
      String adjective = console.readLine("Enter an adjective:  ");
      String noun = console.readLine("Enter a noun:  ");
      if (noun.equals("dork")) {
        console.printf("That language is not allowed. Exiting. \n\n");
        System.exit(0);
      }
      String adverb = console.readLine("Enter an adverb:  ");
      console.printf("%s is very %s of a %s %s\n", name, adjective, adverb, noun);
    }
    
}

