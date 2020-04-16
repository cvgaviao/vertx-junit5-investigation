package testing;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import an.verticle.MainVerticle;
import io.vertx.core.Vertx;
import io.vertx.junit5.VertxExtension;
import io.vertx.junit5.VertxTestContext;

@ExtendWith(VertxExtension.class)
public class MainVerticleITest {


    @Test
    @DisplayName("A test that fails and should pass...")
    void foo(Vertx vertx, VertxTestContext testContext) {

       vertx.deployVerticle(new MainVerticle(),
                testContext.failing());
    }

}
