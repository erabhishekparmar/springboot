package exceptionhandler;

/* 
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id) {
        if (id != 1) {
            throw new UserNotFoundException("User with ID " + id + " not found");
        }
        return "User Found: Abhishek";
    }

    // Handle exception for this controller
    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handleUserNotFound(UserNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
*/