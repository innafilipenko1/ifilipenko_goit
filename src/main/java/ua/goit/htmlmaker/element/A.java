package ua.goit.htmlmaker.element;


public class A extends AbstractElement<A> implements Element{

    private String name;
    private String href;

    public A(String name){
        this.name = name;
    }

    @Override
    public String print() {
        return new StringBuilder()
                .append("<a ")
                .append(getCssClasses())
                .append(getHref())
                .append(getCssRole())
                .append(">")
                .append(name)
                .append("</a>")
                .toString();
    }

    private String getHref(){
        StringBuilder html = new StringBuilder();

        if(!href.isEmpty()){
            html
                    .append(" href=\"")
                    .append(href)
                    .append('"');
        }

        return html.toString();
    }

    public A addHref(String href){
        this.href = href;
        return this;
    }
}
