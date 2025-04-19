class DocumentRegistry {
    private PDFDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;
    
    public DocumentRegistry() {
        pdfPrototype = new PDFDocument();
        System.out.println("Creating a PDF Document prototype.");
        
        textDocumentPrototype = new TextDocument();
        System.out.println("Creating a Text Document prototype.");
        
        spreadsheetPrototype = new SpreadsheetDocument();
        System.out.println("Creating a Spreadsheet Document prototype.");
    }
    
    public PDFDocument createPDFDocument(String filename, String author, int pageCount) {
        PDFDocument newDoc = (PDFDocument) pdfPrototype.clone();
        newDoc.setFilename(filename);
        newDoc.setAuthor(author);
        newDoc.setPageCount(pageCount);
        return newDoc;
    }
    
    public TextDocument createTextDocument(String path, String encoding, int wordCount) {
        TextDocument newDoc = (TextDocument) textDocumentPrototype.clone();
        newDoc.setPath(path);
        newDoc.setEncoding(encoding);
        newDoc.setWordCount(wordCount);
        return newDoc;
    }
    
    public SpreadsheetDocument createSpreadsheetDocument(String name, int rowCount, int columnCount) {
        SpreadsheetDocument newDoc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        newDoc.setSpreadsheetName(name);
        newDoc.setRowCount(rowCount);
        newDoc.setColumnCount(columnCount);
        return newDoc;
    }
}
