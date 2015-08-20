package ua.goit.htmlmaker.element;


import java.util.ArrayList;
import java.util.List;

public class Head implements Element {

    private List<Element> elements = new ArrayList<Element>();

    @Override
    public String print() {
        StringBuilder html = new StringBuilder()
                .append("<head>");

        for (Element element : elements){
            html.append(element.print());
        }

        return html.append("</head>").toString();
    }

    public Head addStyle(Element element){
        this.elements.add(element);
        return this;
    }
}
