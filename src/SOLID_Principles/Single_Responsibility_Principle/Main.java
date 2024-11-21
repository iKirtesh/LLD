package SOLID_Principles.Single_Responsibility_Principle;

public class Main {
    public static void main(String[] args) {
        // Create Marker and Invoice objects
        Marker marker = new Marker("Marker", "Red", 10, 2021);
        Invoice invoice = new Invoice(marker, 5);

        // Save invoice to the database
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.saveToDatabase();

        // Print the invoice
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.printInvoice();
    }
}
