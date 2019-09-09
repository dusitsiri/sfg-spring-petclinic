package guru.springframework.sfgspringpetclinic;

/**
 * SomeController
 */
public class SomeController {

    private final MyService myService;
    
    public SomeController(MyService myService){
        this.myService = myService;
    }
}