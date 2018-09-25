import io.reactivex.*;

public class TestRx {
    public static void main ( String [] args ) {
        Flowable.just("Hello world").subscribe (System.out::println);
    }

}
