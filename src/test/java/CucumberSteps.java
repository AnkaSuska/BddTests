

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class CucumberSteps {

    int currentAccount;
    int savingAccount;


    @Given("I have 1000 on currentAccount")
    public void setCurrentAccount() {
        currentAccount = 1000;
    }

    @And("I have 1000 on savingAccount")
    public void setSavingAccount() {
        savingAccount = 1000;

    }
    @When( "I transfer 500 from currentAccount")
    public void transferMoney(){
      currentAccount = currentAccount - 500;
     savingAccount = savingAccount + 500;

    }
    @Then("Transfer was executed")
    public void showTransfer (){
        System.out.println("currentAccount=" +currentAccount);
        System.out.println("savingAccount"+savingAccount);
    }
}

