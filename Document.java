abstract class Document implements Cloneable {
    public Document clone() {
        try {
            return (Document) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Cloning not supported: " + e);
            return null;
        }
    }
    
    public abstract void open();
    public abstract String getType();
}
