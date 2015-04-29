package test.katas;

import katas.FuzzBuzz;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-4-29.
 */
public class FuzzBuzzTest {
    @Test
    public void showsOriginalNumberIfNumberCannotDivisibleBy3Or5() throws Exception {
        assertThat(FuzzBuzz.of(1), equalTo("1"));
        assertThat(FuzzBuzz.of(2), equalTo("2"));
    }

    @Test
    public void showsFuzzIfNumberDivisibleBy3() throws Exception {
        assertThat(FuzzBuzz.of(3), equalTo("Fuzz"));
        assertThat(FuzzBuzz.of(6), equalTo("Fuzz"));
    }

    @Test
    public void showsBuzzIfNumberDivisibleBy5() throws Exception {
        assertThat(FuzzBuzz.of(5), equalTo("Buzz"));
        assertThat(FuzzBuzz.of(10), equalTo("Buzz"));
    }

    @Test
    public void showsFuzzBuzzIfNumberDivisibleBy15() throws Exception {
        assertThat(FuzzBuzz.of(15), equalTo("FuzzBuzz"));
    }

}
