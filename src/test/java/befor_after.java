import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.AfterStep;
import io.cucumber.java.AfterAll;




    public class befor_after {

        @BeforeAll
        public static void printlnBeforeAll(){
            System.out.println("Open browser");
        }
    @BeforeStep
    public void printlnBeforeStep() {
        System.out.println("Print it before each step");
}

    @AfterStep
    public void printlnAfterStep() {
        System.out.println("thank you");
    }
    @AfterAll
    public static void printlnAfterAll(){
        System.out.println("PClose browser");

    }
}
