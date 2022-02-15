package io.github.arjunarisang.commonlib.util.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Map;

@Data
public class QueryUserRequest implements Serializable {
    private static final long serialVersionUID = 3406056381614274149L;

    @NotNull
    private String provider;
    private Map<String, Object> attributes;
}
