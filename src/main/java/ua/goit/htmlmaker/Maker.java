package ua.goit.htmlmaker;

import ua.goit.htmlmaker.element.*;


public class Maker {

    public static void main(String[] args) {

        Page page = new Page()
                .addHead(new Head().addStyle(new CssLink("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css")))
                .addBody(new Body()
                                .addElement(new Div().addClass("container")
                                                .addElement(new Div().addClass("row")
                                                                .addElement(new Div().addClass("col-md-12")
                                                                                .addElement(new Div().addClass("jumbotron")
                                                                                                .addElement(new H1("Hello, world!"))
                                                                                                .addElement(new P().addText("..."))
                                                                                                .addElement(new P()
                                                                                                                .addElement(new A("Learn more")
                                                                                                                        .addClass("btn", "btn-primary", "btn-lg")
                                                                                                                        .addHref("#")
                                                                                                                        .addRole("button"))
                                                                                                )
                                                                                )
                                                                                .addElement(new Div().addClass("panel panel-default")
                                                                                                .addElement(new Div().addClass("panel-heading").addText("My Panel"))
                                                                                                .addElement(new Div().addClass("panel-body")
                                                                                                        .addElement(new Button("Submit").addClass("btn", "btn-success"))
                                                                                                        .addElement(new Button("Cancel").addClass("btn").addClass("btn-primary")))

                                                                                )
                                                                )
                                                )

                                )
                );


        System.out.println(page.print());
    }
}
