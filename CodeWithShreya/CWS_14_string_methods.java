public class CWS_14_string_methods {
    public static void main(String[] args) {
        String name = "Shreya";
        System.out.println(name);
        // System.out.println(name.length());        // returns the length of the string
        // System.out.println(name.toLowerCase());   // converts the string to lowercase
        // System.out.println(name.toUpperCase());   // converts the string to uppercase

        // String str = "   Hello ";
        // System.out.println(str.trim());        // removes leading and trailing spaces ---> in short removes aage peeche ke white spaces

        // System.out.println(name.substring(2));    // returns a new string from the index 2 to the end of the string
        // System.out.println(name.substring(1, 6)); // returns a new string from the index 1 to 5 (index 6 is exclusive)

        // System.out.println(name.replace("y","e"));   // replaces all occurrences of 'y' with 'e'
        // System.out.println(name.replace("ey", "eeya"));   // replaces all occurrences of 'y' with 'eya'

        // System.out.println(name.startsWith("sh")); // returns true if the string starts with "sh" otherwise false
        // System.out.println(name.endsWith("ya"));   // returns true if the string ends with "ya" otherwise false

        // System.out.println(name.charAt(3));  // returns the character at the index 3

        System.out.println(name.indexOf('e'));  // returns the index of the first occurrence of 'r' in the string  
        System.out.println(name.indexOf('e', 1));  // returns the index of the first occurrence of 'e' in the string starting from index 1

    }
}





