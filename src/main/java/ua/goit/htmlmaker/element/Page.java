package ua.goit.htmlmaker.element;

/**
 * Created by inna on 8/18/15.
 */
public class Page implements Element {

    private Element element;

    @Override
    public String print(){

        StringBuilder html = new StringBuilder();
        html.append("<html>");
        if(element != null){
            html.append(element.print());
        }
        html.append("</html>");

        return html.toString();

    }

    public Page addBody(Element element){
        this.element = element;
        return this;
    }
}
