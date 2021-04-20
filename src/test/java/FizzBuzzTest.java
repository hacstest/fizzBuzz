import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    public void shouldReturnOne(){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1",fb.generateFb(1));
    }


    @Test
    public void shouldReturnOneTwo(){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1 2",fb.generateFb(2));
    }

    @Test
    public void shouldReturnOneTwoFizz(){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1 2 Fizz",fb.generateFb(3));
    }

    @Test
    public void shouldReturnOneTwoFizz4Buzz(){
        FizzBuzz fb = new FizzBuzz();
        assertEquals("1 2 Fizz 4 Buzz",fb.generateFb(5));
    }

    @Test
    public void should15elementHasFizzBuzzAtTheEnd() {
        FizzBuzz fb = new FizzBuzz();
        String out = fb.generateFb(15);
        assertEquals("FizzBuzz",out.substring(out.length() -8));
    }

}