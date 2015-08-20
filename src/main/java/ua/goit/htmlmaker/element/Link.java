package ua.goit.htmlmaker.element;


public class Link implements Element {

    private String name;

    public Link(String name){
        this.name = name;
    }

    @Override
    public String print(){
        return String.format("<li><a href=\"#\">%s</a></li>", name);
    }


}
