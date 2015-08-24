package ua.goit.htmlmaker.element;


import java.util.ArrayList;
import java.util.List;

public class P extends AbstractElement<P> implements Element {

    private List<Element> elements = new ArrayList<Element>();


    @Override
    public String print() {
        StringBuilder html = new StringBuilder()
                .append("<p>")
                .append(getText())
                .append(getCssClasses());

        for (Element element : elements) {
            html.append(element.print());
        }

        return  html.append("</p>").toString();
    }

    public P addElement(Element element) {
        this.elements.add(element);
        return this;
    }
}
