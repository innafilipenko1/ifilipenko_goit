package ua.goit.htmlmaker.element;

/**
 * Created by inna on 8/18/15.
 */
public class Page implements Element {

    private Element body;

    @Override
    public String print(){

        StringBuilder html = new StringBuilder();
        html.append("<html>");
        if(body != null){
            html.append(body.print());
        }
        html.append("</html>");

        return html.toString();

    }

    public Page addBody(Body body){
        this.body = body;
        return this;
    }
}
