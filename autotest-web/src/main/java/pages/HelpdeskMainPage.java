package pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "Helpdesk главная страница")
public class HelpdeskMainPage extends WebPage {

    @Name("кнопка New Ticket")
    private SelenideElement newTicketButton = $x("//span[text()='New Ticket']");

    @Name("кнопка Log In")
    private SelenideElement loginButton = $x("//a[text()=' Log In']");
}
