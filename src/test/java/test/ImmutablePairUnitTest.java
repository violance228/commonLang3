package test;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * created by user violence
 * created on 27.02.2019
 * class created for project common
 */


public class ImmutablePairUnitTest {
    private static ImmutablePair<String, String> immutablePair;

    @BeforeClass
    public static void setUpImmutablePairInstance() {
        immutablePair = new ImmutablePair<>("leftElement", "rightElement");
    }

    @Test
    public void givenImmutablePairInstance_whenCalledgetLeft_thenCorrect() {
        assertThat(immutablePair.getLeft()).isEqualTo("leftElement");
    }

    @Test
    public void givenImmutablePairInstance_whenCalledgetRight_thenCorrect() {
        assertThat(immutablePair.getRight()).isEqualTo("rightElement");
    }

    @Test
    public void givenImmutablePairInstance_whenCalledof_thenCorrect() {
        assertThat(ImmutablePair.of("leftElement", "rightElement")).isInstanceOf(ImmutablePair.class);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void givenImmutablePairInstance_whenCalledSetValue_thenThrowUnsupportedOperationException() {
        immutablePair.setValue("newValue");
    }
}
