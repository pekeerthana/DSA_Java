import java.util.*;

public class Strings {
    public static void main(String args[])
    {

        // removing vowels from a string
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();

        int n = value.length();
        for(int i =0; i<n;i++){
            char ch = value.toLowerCase().charAt(i);
            if(ch == 'a' | ch == 'e' | ch == 'i' | ch =='o' | ch == 'u'){
                continue;
            }
                
            System.out.print(ch+" ");
            }

            System.out.println();
        // reverse vowels of a string
        reverseVowels(value);
        uppeToLower(value);

    }   
    // Method to reverse vowels of a string
    public static void reverseVowels(String input)
    {
        char[] sb = input.toCharArray();
        int i=0; int j = input.length()-1;
        while(i<j)
        {

            while(sb[i] != 'a' && sb[i] != 'e' && sb[i] != 'i' && sb[i] !='o' && sb[i] != 'u'){
                
                i++;
            }
            while(sb[j] != 'a' && sb[j] != 'e' && sb[j] != 'i' && sb[j] !='o' && sb[j] != 'u'){
                j--;
            }

            if(i<j){
            char temp = sb[i];
            sb[i] = sb[j];
            sb[j] = temp;
            i++;
            j--;
            }
        }
        System.out.println("String after reversing the vowels: "+ String.valueOf(sb));
        System.out.println("String after reversing the vowels: " + new String(sb));

    }

    // convert all uppercase to lowercase method
    public static void uppeToLower(String input)
    {
        StringBuilder value = new StringBuilder(input);

        for(int i =0;i<input.length();i++){
            if(value.charAt(i)>=65 && value.charAt(i)<= 90){
                int val = value.charAt(i)+32;
                value.setCharAt(i, (char) val);
            }

        }

        System.out.println("String after converting upper to lower case: "+ value);

    }

}
