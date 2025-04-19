public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();
        
        PDFDocument pdfDoc = registry.createPDFDocument("annual_report_2024.pdf", "Acme Corp", 150);
        pdfDoc.open();

        TextDocument textDoc = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
        textDoc.open();

        SpreadsheetDocument spreadsheetDoc = registry.createSpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
        spreadsheetDoc.open();
        
        PDFDocument anotherPdfDoc = registry.createPDFDocument("summary_report.pdf", "Acme Corp", 30);
        anotherPdfDoc.open();
    }
}