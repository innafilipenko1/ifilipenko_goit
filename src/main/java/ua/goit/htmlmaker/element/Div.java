package ua.goit.htmlmaker.element;

import java.util.ArrayList;
import java.util.List;

public class Div extends AbstractElement<Div> implements Element{


    private List<Element> elements = new ArrayList<Element>();

    @Override
    public String print() {
        StringBuilder html = new StringBuilder()
                .append("<div")
                .append(getCssClasses())
                .append(">")
                .append(getText());

        for (Element element : elements) {
            html.append(element.print());
        }

        return html.append("</div>").toString();
    }

    public Div addElement(Element element) {
        this.elements.add(element);
        return this;
    }

}
