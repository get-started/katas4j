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
    public void normal() throws Exception {
        assertThat(FuzzBuzz.of(1),equalTo("1"));
    }
}
