package SEM_4.Behavioural_Design_Pattern.Momento_Design_Pattern.Text;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("Initial State: Welcome!!\n");
        textEditor.hitSave();

        textEditor.write("New text added to the document\n");
        textEditor.write("New text added to the document\n");
        textEditor.hitSave();
        textEditor.write("New text added to the document\n");
        System.out.println(textEditor.print());

        textEditor.hitUndo();
        System.out.println(textEditor.print());
    }
}
