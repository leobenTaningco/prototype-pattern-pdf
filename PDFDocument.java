class PDFDocument extends Document {
    private String filename;
    private String author;
    private int pageCount;
    private String name;
    
    public PDFDocument() {
    }
    
    @Override
    public PDFDocument clone() {
        return (PDFDocument) super.clone();
    }
    
    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + filename + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: PDF, File: " + filename + ", Author: " + author + ", Pages: " + pageCount);
    }
    
    @Override
    public String getType() {
        return "PDF";
    }
    
    public void setFilename(String filename) {
        this.filename = filename;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
