import java.util.ArrayList;
import java.util.Random;
/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @motified by  Milena Michalska
 * @version 05.11.2021
 */
public class StockList
{
    // A list of the products.
    private ArrayList<Product> stock;
    private Random generator = new Random();
    
    /**
     * Initialise the stock manager.
     */
    public StockList()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The product item to be added.
     */
    public void add(Product item)
    {
        stock.add(item);
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }
    
    /**
     * A method to remove the product from stock list by ID number
     */
    public void removeproduct(int productID)
    {
        Product product = findProduct(productID);
        if(product != null)
        {
            stock.remove(product);
            System.out.println("Removed product number: " + productID);
        }
        else
        {
            System.out.println ("This product number not exist");
        }
    }
    
    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void buyProduct(int productID, int buyQuantity)
    {
        //System.out.println("Buying Quantities of Stock\n");
        
        Product product = findProduct(productID);
      
        int stockQuantity = product.getQuantity();
        if(product != null) 
        {
            if(stockQuantity <100)
            {
                product.increaseQuantity(buyQuantity);
                System.out.println( "Bought " + product.getName()+ "  " + " Quantity: "
                + buyQuantity); 
            }
            else 
            {
                System.out.println( "Not enough shelf space for product: " + 
                product.getName() + " !");
            }
         }
        else
        {
            System.out.println("Couldn't find this product");
        }
    }
    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {   
        for(Product product : stock)
        {
            if(product.getID() == productID)
            {
            return product;
            }
        }
        return null;
    }
    
    /**
     * Sell one of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID, int sellQuantity)
    {
        //System.out.println("Selling Quantities of Stock\n");
        
        Product product = findProduct(productID);
        int stockQuantity = product.getQuantity();
        
        if(product != null) 
        {
            if(stockQuantity > 0)
            {
                if(stockQuantity > sellQuantity)
                {
                    product.decreaseQuantity(sellQuantity);
                    System.out.println( "     Sold " + " " + sellQuantity + " Quantity of:  " + 
                    product.getName() );
                }
                else
                {
                    System.out.println( " Not sold " + " " + sellQuantity + " Quantity of:  " +
                    product.getName() + " In stock only avaliable: " + product.getQuantity()); 
                }
            }
            else
            {
                System.out.println(" Out of stock -----------  " +  product.getName() );
            }
        }
        else
        {
            System.out.println("Couldn't find this product");
        }
    }    
    
    public void search(String phrase)
    {
        for (Product product : stock)
        {
            if(product.getName().contains(phrase))
            {
                System.out.println(product.toString());
            }
        }
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int productID)
    {
        Product product = findProduct(productID);
        if (product !=null)
        {
            System.out.println(product.toString());
        }
            return 0;
    }
    
    /**
     * This is a method, when printing a products whose stock are low ( for example <5)
     */
    public void lowstock(String phrase)
    {
        for(Product product : stock)
        {
            if(product.getQuantity() < 5 )
            {
                System.out.println("<><><><><><><><><><><><><><><><><><><><><>");
                System.out.println(" Products with low stock (less than 5) :  ");
                System.out.println("<><><><><><><><><><><><><><><><><><><><><>");
                System.out.println(product);
            }
        }
    }
    
    /** Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    public void printHeading()
    {
        System.out.println();
        System.out.println(" Milena's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }
}