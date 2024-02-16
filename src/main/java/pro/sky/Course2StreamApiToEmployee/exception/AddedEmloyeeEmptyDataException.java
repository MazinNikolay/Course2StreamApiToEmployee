package pro.sky.Course2StreamApiToEmployee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "No data entered")
public class AddedEmloyeeEmptyDataException extends RuntimeException {
    public AddedEmloyeeEmptyDataException(String message) {
        super(message);
    }
}
