package SOLID_Principles.Single_Responsibility_Principle;

// Class responsible for printing the invoice
public class InvoicePrinter {
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("Printing invoice...");
        System.out.println("Marker: " + invoice.getMarker().name);
        System.out.println("Color: " + invoice.getMarker().color);
        System.out.println("Price per unit: $" + invoice.getMarker().price);
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Total: $" + invoice.calculateTotal());
    }
}
