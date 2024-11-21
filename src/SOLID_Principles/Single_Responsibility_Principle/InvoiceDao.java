package SOLID_Principles.Single_Responsibility_Principle;

// Class responsible for saving invoice to a database (simulated)
public class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDatabase() {
        System.out.println("Saving invoice to database...");
        System.out.println("Marker: " + invoice.getMarker().name);
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Total: $" + invoice.calculateTotal());
    }
}
