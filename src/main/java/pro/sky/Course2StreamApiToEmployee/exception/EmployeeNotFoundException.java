package pro.sky.Course2StreamApiToEmployee.exception;

//@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Not found")
//Обрабатываю в контроллере через @ExceptionHandler
public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
