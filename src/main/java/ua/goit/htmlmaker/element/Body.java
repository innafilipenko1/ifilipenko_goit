package ua.goit.htmlmaker.element;


import java.util.ArrayList;
import java.util.List;


public class Body extends AbstractElement<Body> implements Element {

    private List<Element> elements = new ArrayList<Element>();

    @Override
    public String print() {
        StringBuilder html = new StringBuilder()
                .append("<body")
                .append(getCssClasses())
                .append(">");

        for (Element element : elements) {
            html.append(element.print());
        }

        return html.append("</body>").toString();
    }

    public Body addElement(Element element) {
        this.elements.add(element);
        return this;
    }

}
