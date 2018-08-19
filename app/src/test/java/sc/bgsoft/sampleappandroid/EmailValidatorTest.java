package sc.bgsoft.sampleappandroid;


import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class EmailValidatorTest {

    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertThat(EmailValidator.isValidEmailAddress("name@email.com"), is(true));
    }

    @Test
    public void emailValidator1_CorrectEmailSimple_ReturnsTrue() {
        boolean valid=EmailValidator.isValidEmailAddress("name@email.com");
        assertThat(valid,is(true));
    }
    @Test
    public void emailValidator2_CorrectEmailSimple_ReturnsTrue() {
        assertThat(EmailValidator.isValidEmailAddressPatern("name@email.com"), is(true));
    }
    boolean valid=EmailValidator.isValidEmailAddress("name@email.com");
    boolean[] valids=new boolean[]{valid};
    boolean[] results=new boolean[]{true};
    @Test
    public void emailValidatorArrays() {
        assertArrayEquals("ARAYS EVALUATOR",valids, results);
    }

    @Test
    public void testHamcrestBool() {
        assertThat("TEST IF 3 + 4 must fail",3, equalTo(4));
    }
    @Test
    public void testHamcrest() {
        assertThat("TEST valid",valid, equalTo(true));
    }

}
