package hello.exception.application;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
public class NestedError {

    private String object;
    private String field;
    private Object rejectedValue;
    private String message;

    NestedError(String object, String message) {
        this.object = object;
        this.message = message;
    }

}
