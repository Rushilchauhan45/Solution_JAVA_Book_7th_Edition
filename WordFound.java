package Solution_JAVA_Book_7th_Edition;

public class WordFound {

    public static void main(String args[]) {
        
    	String name = "im coder My Name Is Rushil";
        int wordcount = 1; 
        
        for (int i = 0; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            
            if (currentChar == ' ')
            {
                wordcount++; 
            }
        
        }
        System.out.println("Word Count: " + wordcount);
    }
}
