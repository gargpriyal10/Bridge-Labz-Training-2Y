public class PalindromeChecker {
    
    private String text;

   
    public PalindromeChecker(String text) {
        this.text = text;
    }

    
    public boolean isPalindrome() {
        
        String cleanText = this.text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

     
        String reversedText = new StringBuilder(cleanText).reverse().toString();

        
        return cleanText.equals(reversedText);
    }

   
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + this.text + "\" IS a palindrome.");
        } else {
            System.out.println("The text \"" + this.text + "\" is NOT a palindrome.");
        }
    }

    
    public static void main(String[] args) {
       
        PalindromeChecker checker1 = new PalindromeChecker("A man, a plan, a canal: Panama");
        checker1.displayResult();

        
        PalindromeChecker checker2 = new PalindromeChecker("Hello World");
        checker2.displayResult();

        
        PalindromeChecker checker3 = new PalindromeChecker("Racecar");
        checker3.displayResult();
    }
}