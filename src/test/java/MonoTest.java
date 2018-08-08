import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class MonoTest {
    @Test
    void mono() {
        Mono.just("A")
            .log()
            .subscribe();
    }
}
