package ua.goit.htmlmaker.element;

public class Button extends AbstractElement<Button> implements Element {

    private String name;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public String print() {

        return new StringBuilder()
                .append("<button")
                .append(getCssClasses())
                .append(">")
                .append(name)
                .append("</button>")
                .toString();
    }


    
}
