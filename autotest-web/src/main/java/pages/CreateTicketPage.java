package pages;

import com.codeborne.selenide.SelenideElement;
import ru.lanit.at.web.annotations.Name;
import ru.lanit.at.web.pagecontext.WebPage;

import static com.codeborne.selenide.Selenide.$x;

@Name(value = "страница создания Тикета")
public class CreateTicketPage extends WebPage {

    @Name("поле Summary of the problem")
    private SelenideElement titleField = $x("//input[@id='id_title']");

    @Name("поле Queue")
    private SelenideElement queueField = $x("//select[@id='id_queue']");

    @Name("поле Description of your issue")
    private SelenideElement descriptionField = $x("//textarea[@id='id_body']");

    @Name("поле Priority")
    private SelenideElement priorityField = $x("//select[@id='id_priority']");

    @Name("поле Due on")
    private SelenideElement dueDateField = $x("//input[@id='id_due_date']");

    @Name("поле Your E-Mail Address")
    private SelenideElement emailField = $x("//input[@id='id_submitter_email']");

    @Name("кнопка Submit Ticket")
    private SelenideElement SubmitTicketButton = $x("//button[@class='btn btn-primary btn-lg btn-block']");

}
