package SEM_4.Behavioural_Design_Pattern.Momento_Design_Pattern.Text;

public class TextWindow {
    private StringBuilder currentText;

    public TextWindow()
    {
        this.currentText = new StringBuilder();
    }

    public void addText(String text)
    {
        currentText.append(text);
    }

    public String getText()
    {
        return currentText.toString();
    }

    public TextWindowState save()
    {
        return new TextWindowState(currentText.toString());
    }

    public void restore(TextWindowState save)
    {
        currentText = new StringBuilder(save.getText());
    }
}
