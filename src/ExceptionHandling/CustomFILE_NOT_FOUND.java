package ExceptionHandling;

import java.io.IOException;

public class CustomFILE_NOT_FOUND extends IOException {

    public CustomFILE_NOT_FOUND(String message) {
        super(message);
    }

}
