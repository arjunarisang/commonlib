package io.github.arjunarisang.commonlib.autoconfig;

import java.util.HashMap;
import java.util.Map;

public class TestService {

    public Map<String, String> hello() {
        Map<String, String> message = new HashMap<>();
        message.put("message", "Hello, arjunarisang's commonlib!");
        return message;
    }
}
