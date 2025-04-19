class SpreadsheetDocument extends Document {
    private String spreadsheetName;
    private int rowCount;
    private int columnCount;
    
    public SpreadsheetDocument() {
    }
    
    @Override
    public SpreadsheetDocument clone() {
        return (SpreadsheetDocument) super.clone();
    }
    
    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
        System.out.println("Type: Spreadsheet, Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount);
    }
    
    @Override
    public String getType() {
        return "Spreadsheet";
    }
    
    public void setSpreadsheetName(String spreadsheetName) {
        this.spreadsheetName = spreadsheetName;
    }
    
    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }
    
    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
}