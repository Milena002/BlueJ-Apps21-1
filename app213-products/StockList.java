import java.util.ArrayList;

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
                System.out.println( "Bought " + buyQuantity + " of " + product.getName());
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
                    System.out.println( product.getName()  + sellQuantity + " " + " Sold "
                    );
                }
                else
                {
                    System.out.println( product.getName() + " Not sold " + sellQuantity +
                    " because" + " We have only " + product.getQuantity());
                }
            }
            else
            {
                System.out.println( product.getName() + "is out of stock" );
            }
        }
        else
        {
            System.out.println("Couldn't find this product");
        }
    }    
    
    public void search(String phrase)
    {
        if (phrase.contains("Samsung"))
        {
            
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
     * Print details of the given product. If found,
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