package an.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class MainVerticle extends AbstractVerticle{
    
    @Override
    public void start(Promise<Void> pStartPromise) throws Exception {
        
        pStartPromise.fail(new IllegalArgumentException());
    }

}
