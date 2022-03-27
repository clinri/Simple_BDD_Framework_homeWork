package pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "страница Тикета")
public class TicketPage extends WebPage {

    @Name("поле Submitter E-Mail")
    private SelenideElement emailField = $x("//th[text()='Submitter E-Mail']");

}
