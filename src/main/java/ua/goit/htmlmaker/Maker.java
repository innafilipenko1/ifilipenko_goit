package ua.goit.htmlmaker;

import ua.goit.htmlmaker.element.*;


public class Maker {

    public static void main(String[] args) {

/*        Page page = new Page()
                .addBody(new Body()
                                .addElement(new Button("Submit"))
                                .addElement(new Button("Cancel"))
                );*/

        Page page = new Page();
        page.addBody(new Head()
                             .addStyle(new Style()));
       // String actual = page.print();

        System.out.println(page.print());
    }
}
