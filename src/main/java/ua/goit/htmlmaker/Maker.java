package ua.goit.htmlmaker;

import ua.goit.htmlmaker.element.*;


public class Maker {

    public static void main(String[] args) {

        Page page = new Page()
                .addHead(new Head().addStyle(new CssLink("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css")))
                .addBody(new Body().addClass("bg-success")
                                .addElement(new Button("Submit")
                                        .addClass("btn", "btn-success"))
                                .addElement(new Button("Cancel")
                                                .addClass("btn")
                                                .addClass("btn-primary")

                                )
                );


/*        Page page = new Page();
        page.addBody(new Head()
                             .addStyle(new Style()));
        String actual = page.print();*/


        System.out.println(page.print());
    }
}
