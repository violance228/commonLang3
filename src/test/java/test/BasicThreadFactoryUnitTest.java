package test;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * created by user violence
 * created on 27.02.2019
 * class created for project common
 */


public class BasicThreadFactoryUnitTest {
    @Test
    public void givenBasicThreadFactoryInstance_whenCalledBuilder_thenCorrect() {
        BasicThreadFactory factory = new BasicThreadFactory.Builder()
                .namingPattern("workerthread-%d")
                .daemon(true)
                .priority(Thread.MAX_PRIORITY)
                .build();
        assertThat(factory).isInstanceOf(BasicThreadFactory.class);
    }
}
