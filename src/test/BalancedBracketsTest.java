package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest () {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void launchcodeReturnsTrue () {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void codeReturnsTrue () {

        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void firstReturnsTrue () {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void stringReturnsTrue () {

        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void oneReturnsFalse () {

        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void inBetweenReturnsFalse () {

        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void firstBracketReturnsFalse () {

        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void backwordsReturnsFalse () {

        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void threeBacketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void threebracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }


}
