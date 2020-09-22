package p2;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import p1.check;


public class CheckoutSteps {
int bananaPrice = 0, applePrice = 0;
check c = new check();


@Given("the price of a {string} is {int}c")
public void thePriceofaisC(String name, int price)  {
if (name.equals("banana")) {
bananaPrice = price;
}
else {
applePrice = price;
}
}

@When("I checkout {int} {string}")
public void iCheckout(int itemCount, String itemName)  {
if (itemName.equals("banana")) {
c.add(itemCount, bananaPrice);
}
else {
c.add(itemCount, applePrice);
}
}



@Then("the total price should be {int}c")
public void thetotalpriceshouldbe(int total) throws Throwable {
assertEquals(total, c.totalprice());
}

}
