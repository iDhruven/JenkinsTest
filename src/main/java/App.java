public class App {

    public boolean isPalindrome(String input){    //Given String should be same as Reverse of that String

        if (input == null){
            throw new IllegalArgumentException("Input shoudln't be Null!");
        }

        if (input.equals(reverse(input))){
            return true;
        }else{
            return false;
        }
    }

    private String reverse(String input){
        String rev = "";
        for (int i = input.length() - 1; i>=0 ; i--){
            rev = rev + input  .charAt(i);
        }
        return  rev;
    }

}
