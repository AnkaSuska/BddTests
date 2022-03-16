

import com.beust.jcommander.IValueValidator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class CucumberSteps {

    int currentAccount;
    int savingAccount;

    public void name(int s1, int s2) {

    }

    @Given("I have {int} on currentAccount")
    public void setCurrentAccount(int value) {
        currentAccount = value;
    }

    @And("I have {int} on savingAccount")
    public void setSavingAccount(int value) {
        savingAccount = value;

    }

    @When("I transfer {int} from currentAccount")
    public void transferMoney(int value) {
        currentAccount = currentAccount - value;
        savingAccount = savingAccount + value;

    }

    @Then("Transfer was executed")
    public void showTransfer() {
        System.out.println("currentAccount=" + currentAccount);
        System.out.println("savingAccount" + savingAccount);
    }

    @And("Statement appear (string)")
    public void statement(String hodor) {
    System.out.println(hodor);

    }
}

