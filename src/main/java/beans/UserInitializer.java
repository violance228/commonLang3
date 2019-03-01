package beans;

import org.apache.commons.lang3.concurrent.LazyInitializer;

/**
 * created by user violence
 * created on 27.02.2019
 * class created for project common
 */


public class UserInitializer extends LazyInitializer<User> {
    @Override
    protected User initialize() {
        return new User("John", "john@domain.com");
    }
}
