package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import Main.*;
import twitter4j.TwitterException;

import static org.junit.Assert.assertEquals;

/**
 *
 *  @author Nathaly Bakerian S.
 *
 *
*/

public class mainClassTest {
    twitterConexion  tw;
    @Before
    public void iniciarConexion() {
        tw = new twitterConexion();

    }

    @Test
    public void testsearchUser() throws TwitterException {
        assertEquals(tw.searchUser("bakerianathaly"),"bakerianathaly");

    }

    @Test
    public void testsearchnotUser() throws TwitterException {
        assertEquals(tw.searchUser("jdopjcemdcempofmclokdmnfvcokrlmdslcjmeopdjcmneop"),"no existe el  usuario que introdujo");
    }

    @After
    public void tearDown(){
        tw = null;
    }
}
