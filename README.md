# creational-pattern-quiz
Pattern to use - Singleton, Factory
Pattern to explain Factory
##LoggerFactory ( [LoggerFactory](https://github.com/chertpong/creational-pattern-quiz/blob/master/src/main/java/com/kritacademy/audit/LoggerFactory.java) )
Factory pattern comes to help us when we want to switch the implementation of some class or the creation process is complicate.

When combine with DI(dependency injection) and IOC (Inversion of Control) we can switch the implementation freely

Since, we didn't create it ourselves and let Factory create it.

we can switch an implementation by changing only [one line](https://github.com/chertpong/creational-pattern-quiz/blob/master/src/main/java/com/kritacademy/audit/LoggerFactory.java#L12)

and other classes will switch follow the Factory 

In the example, we want to change from LoggerImpl to LoggerInMemory

(see what class has switched if we change that line [1](https://github.com/chertpong/creational-pattern-quiz/blob/master/src/main/java/com/kritacademy/booking/BookingServiceImpl.java#L14), [2](https://github.com/chertpong/creational-pattern-quiz/blob/master/src/main/java/com/kritacademy/booking/BookingController.java#L13))

![class-diagram](https://github.com/chertpong/creational-pattern-quiz/blob/master/class-diagram.JPG)
