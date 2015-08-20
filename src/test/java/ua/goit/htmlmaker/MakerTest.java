package ua.goit.htmlmaker;


import org.junit.Assert;
import org.junit.Test;
import ua.goit.htmlmaker.element.Body;
import ua.goit.htmlmaker.element.Link;
import ua.goit.htmlmaker.element.Page;
import ua.goit.htmlmaker.element.UL;

public class MakerTest {

    @Test
    public void pagePrinting(){
        Page page = new Page();
        String actual = page.print();

        Assert.assertEquals("<html></html>", actual);

    }

    @Test
    public void bodyPrinting(){
        Page page = new Page();
        page.addBody(new Body());
        String actual = page.print();

        Assert.assertEquals("<html><body></body></html>", actual);

    }

    @Test
    public void listPrinting(){
        Page page = new Page()
                .addBody(new Body()
                                .addElement(new UL()
                                        .addListItem(new Link("Binary Multiplication"))
                                )
                );
        String actual = page.print();

        Assert.assertEquals("<html><body><ul><li><a href=\"#\">Binary Multiplication</a></li></ul></body></html>", actual);

    }


}
