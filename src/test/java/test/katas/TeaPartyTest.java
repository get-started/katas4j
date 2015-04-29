package test.katas;

import katas.TeaParty;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-4-29.
 */
public class TeaPartyTest {
    @Test
    public void sayMrXXXToAMan() throws Exception {
        assertThat(TeaParty.welcome("Orwell"),equalTo("Hello Mr. Orwell"));
    }
}
