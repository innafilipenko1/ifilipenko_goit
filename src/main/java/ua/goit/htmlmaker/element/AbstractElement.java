package ua.goit.htmlmaker.element;


import java.util.ArrayList;
import java.util.List;

public abstract class AbstractElement<T> {

    protected List<String> cssClasses = new ArrayList<String>();
    protected String role;
    protected String text = "";

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

    protected String getCssRole(){
        StringBuilder html = new StringBuilder();

        if(!role.isEmpty()){
            html
                    .append(" role=\"")
                    .append(role)
                    .append('"');
        }

        return html.toString();
    }

    protected String getText(){
        StringBuilder html = new StringBuilder();

        if(!text.isEmpty()){
            html.append(text);
        }

        return html.toString();
    }


    public T addClass(String... cssClasses) {

        for (String cssClass : cssClasses) {
            this.cssClasses.add(cssClass);
        }

        return (T) this;

    }


    public T addRole(String cssRole) {
        this.role = cssRole;
        return (T) this;

    }

    public T addText(String text) {
        this.text = text;
        return (T) this;
    }
}
