/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.business;
import java.io.Serializable;
import java.text.NumberFormat;
/**
 *
 * @author amt
 */
public class OrderDetail implements Serializable
{
    private Long ItemId;
    private Product product;
    private int quantity;
    public OrderDetail() 
    {
       
    }
  

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getTotalPrice()
    {
        double total = this.product.getPrice() * this.quantity;
        return total;
    }
    
    public String getTotalCurrencyFormat()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotalPrice());
    }
    
}
