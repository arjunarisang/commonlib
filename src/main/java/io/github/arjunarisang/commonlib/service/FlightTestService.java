package io.github.arjunarisang.commonlib.service;

import java.util.HashMap;
import java.util.Map;

public class FlightTestService {

    public Map<String, String> hello() {
        Map<String, String> message = new HashMap<>();
        message.put("message", "Hello, arjunarisang's commonlib!");
        return message;
    }
}
