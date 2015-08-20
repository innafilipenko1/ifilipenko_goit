package ua.goit.htmlmaker;

import ua.goit.htmlmaker.element.Body;
import ua.goit.htmlmaker.element.Button;
import ua.goit.htmlmaker.element.Page;


public class Maker {

    public static void main(String[] args) {

        Page page = new Page()
                .addBody(new Body()
                                .addElement(new Button("Submit"))
                                .addElement(new Button("Cancel"))
                );


        System.out.println(page.print());
    }
}
