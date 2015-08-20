package ua.goit.htmlmaker.element;

/**
 * Created by inna on 8/18/15.
 */
public class Button implements Element{

    private String name;

    public Button(String name){
        this.name = name;
    }
    
    @Override
    public String print(){
        return String.format("<button>%s</button>", name);
    }
}
