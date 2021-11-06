
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Milena Michalska
 * @version 1.0, date 06/11/2021
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Here is my list of 10 created products (in alphabetical order).
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
    
        stock.add(new Product(100, "Apple iPhone 11"));
        stock.add(new Product(101, "Apple iPhone 12"));
        stock.add(new Product(102, "Apple iPhone 13"));
        stock.add(new Product(103, "Google Pixel 6"));
        stock.add(new Product(104, "Google Pixel 4a"));
        stock.add(new Product(105, "Oppo A15"));
        stock.add(new Product(106, "Oppo Find X3 Neo"));
        stock.add(new Product(107, "Samsung Galaxy S21"));
        stock.add(new Product(108, "Samsung Galaxy Z Fold3"));
        stock.add(new Product(109, "Samsung Galaxy A12"));
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
    }

    private void sellProducts()
    {
    }    
}