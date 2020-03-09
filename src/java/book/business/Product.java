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
public class Product implements  Serializable
{
    private Long productId;
    private String code;
    private String description;
    private double price;
    private String name;
    
    public Product()
    {
       this.code = "";
       this.description = "";
       this.name = "";
       this.price = 0;
       
    }
    public Product(String  code, String name, String desc, double price)
    {
        this.code = code;
        this.name = name;
        this.description = desc;
        this.price = price;
    }

    /**
     * @return the productId
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) 
    {
        this.price = price;
    }
    
       /**
     * @return the name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getPriceCurrencyFormat()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getPrice());
    }
    public String getImageUrl()
    {
        String imageUrl = "/bookStore/images/" + this.code + "_product__img.jpg";
        return imageUrl;
    }

 
    
    
}
