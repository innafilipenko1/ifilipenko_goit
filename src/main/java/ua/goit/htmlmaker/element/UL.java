package ua.goit.htmlmaker.element;


import java.util.ArrayList;
import java.util.List;

public class UL implements Element {

    private List<Link> links = new ArrayList<Link>();

    @Override
    public String print() {
        StringBuilder html = new StringBuilder()
                .append("<ul>");

        for(Link link: links){
            html.append(link.print());
        }

        return html.append("</ul>").toString();
    }

    public UL addListItem(Link link){
        this.links.add(link);
        return this;
    }
}
