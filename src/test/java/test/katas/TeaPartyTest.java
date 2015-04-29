package test.katas;

import katas.TeaParty;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by L.x on 15-4-29.
 */
public class TeaPartyTest {
    @Test
    public void sayMrXXXToAMan() throws Exception {
        assertThat(TeaParty.welcome("Orwell", true), equalTo("Hello Mr. Orwell"));
    }

    @Test
    public void sayMsXXXToAWoman() throws Exception {
        assertThat(TeaParty.welcome("Austen", false), equalTo("Hello Ms. Austen"));
    }

    @Test
    public void saySirXXXToAKnighted() throws Exception {
        assertThat(TeaParty.welcome("Newton", false), equalTo("Hello Sir Newton"));
    }
}
