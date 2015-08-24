package ua.goit.htmlmaker.element;

public class H1 implements Element {

    private String name;

    public  H1(String name){
        this.name = name;
    }


    @Override
    public String print() {
        return String.format("<h1>%s</h1>", name);
    }
}
