package ua.goit.htmlmaker.element;


public class Style implements Element {


    @Override
    public String print() {
        StringBuilder html = new StringBuilder();
        html.append("<style>");

        html.append("li.intro {\n" +
                "    color: blue;\n" +
                "}\n" +
                "\n" +
                "button.important {\n" +
                "    color: green;\n" +
                "}");

        return html.append("</style>").toString();
    }
}
