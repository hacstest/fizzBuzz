import java.util.ArrayList;

public class FizzBuzz {

    public String generateFb(int max) {
        String fb = new String();
        ArrayList<String> outputBuzz = new ArrayList<String>();
        for(int i=1;i<=max;i++) {
            String tmp = generateLittleFizzBuzz(i);
            outputBuzz.add(tmp);
        }
        fb = String.join(" ",outputBuzz);
        return fb;
    }

    private String generateLittleFizzBuzz(int i) {
        String tmp;
        if(i % 3 ==0 && i % 5 == 0) tmp ="FizzBuzz";
        else if (i % 3 ==0)  tmp = "Fizz";
        else if (i % 5 == 0) tmp = "Buzz";
        else  tmp =Integer.toString(i);
        return tmp;
    }


}
