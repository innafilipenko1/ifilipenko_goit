package ua.goit.htmlmaker.element;


import java.util.ArrayList;
import java.util.List;

public abstract class AbstractElement<T> {

    protected List<String> cssClasses = new ArrayList<String>();

    protected String getCssClasses(){

        StringBuilder html = new StringBuilder();

        if (!cssClasses.isEmpty()) {

            html.append(" class=\"");
            for (String cssClass : cssClasses) {
                html.append(cssClass).append(" ");
            }

            html.append('"');
        }

        return html.toString();
    }


    public T addClass(String... cssClasses) {

        for (String cssClass : cssClasses) {
            this.cssClasses.add(cssClass);
        }

        return (T) this;

    }
}
