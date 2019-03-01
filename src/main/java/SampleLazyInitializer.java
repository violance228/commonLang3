import org.apache.commons.lang3.concurrent.LazyInitializer;

/**
 * created by user violence
 * created on 27.02.2019
 * class created for project common
 */


public class SampleLazyInitializer extends LazyInitializer<SampleObject> {
    @Override
    protected SampleObject initialize() {
        return new SampleObject();
    }
}
