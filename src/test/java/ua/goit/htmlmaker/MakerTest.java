package ua.goit.htmlmaker;


import org.junit.Assert;
import org.junit.Test;
import ua.goit.htmlmaker.element.*;

public class MakerTest {

    @Test
    public void htmlPrinting() {
        Page page = new Page();
        String actual = page.print();

        Assert.assertEquals("<html></html>", actual);

    }

    @Test
    public void bodyPrinting() {
        Page page = new Page();
        page.addBody(new Body());
        String actual = page.print();

        Assert.assertEquals("<html><body></body></html>", actual);

    }

    @Test
    public void headPrinting() {
        Page page = new Page();
        page.addBody(new Head());
        String actual = page.print();

        Assert.assertEquals("<html><head></head></html>", actual);

    }

    @Test
    public void stylePrinting() {
        Page page = new Page();
        page.addBody(new Head()
                .addStyle(new Style()));
        String actual = page.print();

        Assert.assertEquals("<html><head></head></html>", actual);

    }

    @Test
    public void listPrinting() {
        Page page = new Page()
                .addBody(new Body()
                                .addElement(new UL()
                                                .addListItem(new Link("Binary Multiplication"))
                                )
                );
        String actual = page.print();

        Assert.assertEquals("<html><body><ul><li><a href=\"#\">Binary Multiplication</a></li></ul></body></html>", actual);

    }


    @Test
    public void pagePrinting() {
        Page page = new Page();

        page.addBody(new Head()
                .addStyle(new Style()));
        page.addBody(new Body()
                        .addElement(new Button("Submit"))
                        .addElement(new UL()
                                        .addListItem(new Link("Binary Multiplication"))
                        )
        );
        String actual = page.print();

        Assert.assertEquals("<html><body><ul><li><a href=\"#\">Binary Multiplication</a></li></ul></body></html>", actual);

    }

}
