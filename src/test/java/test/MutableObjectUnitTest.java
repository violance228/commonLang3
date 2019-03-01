package test;

import org.apache.commons.lang3.mutable.MutableObject;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * created by user violence
 * created on 27.02.2019
 * class created for project common
 */


public class MutableObjectUnitTest {
    private static MutableObject mutableObject;

    @BeforeClass
    public static void setUpMutableObject() {
        mutableObject = new MutableObject("Initial value");
    }

    @Test
    public void givenMutableObject_whenCalledgetValue_thenCorrect() {
        assertThat(mutableObject.getValue()).isInstanceOf(String.class);
    }

    @Test
    public void givenMutableObject_whenCalledsetValue_thenCorrect() {
        mutableObject.setValue("Another value");
        assertThat(mutableObject.getValue()).isEqualTo("Another value");
    }

    @Test
    public void givenMutableObject_whenCalledtoString_thenCorrect() {
        assertThat(mutableObject.toString()).isEqualTo("Another value");
    }
}
