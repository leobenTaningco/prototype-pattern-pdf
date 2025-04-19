class TextDocument extends Document {
    private String path;
    private String encoding;
    private int wordCount;
    
    public TextDocument() {
    }
    
    @Override
    public TextDocument clone() {
        return (TextDocument) super.clone();
    }
    
    @Override
    public void open() {
        System.out.println("Opening Text Document: " + path + " with encoding: " + encoding + " (" + wordCount + " words)");
        System.out.println("Type: Text, Path: " + path + ", Encoding: " + encoding + ", Words: " + wordCount);
    }
    
    @Override
    public String getType() {
        return "Text";
    }
    
    public void setPath(String path) {
        this.path = path;
    }
    
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
    
    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }
}
