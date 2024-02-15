package pro.sky.Course2StreamApiToEmployee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "No data entered")
public class AddedEmloyeeEmptyData extends RuntimeException {
    public AddedEmloyeeEmptyData(String message) {
        super(message);
    }
}
