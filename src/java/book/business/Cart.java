
package book.business;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author amt
 */
public class Cart implements Serializable
{
    private ArrayList<OrderDetail> selectedProducts;
    
    public Cart()
    {
        selectedProducts = new ArrayList<OrderDetail>();
    }
    
    public ArrayList<OrderDetail> getSelectedListProducts()
    {
        return this.selectedProducts;
    }
    public void setSelectedProducts(ArrayList<OrderDetail> new_products)
    {
        this.selectedProducts = new_products;
    }
    public int getSize()
    {
        return this.selectedProducts.size();
    }
    
    public void addProduct(OrderDetail givenProduct)
    {
        String code = givenProduct.getProduct().getCode();
        int quantity = givenProduct.getQuantity();
        for(int idx = 0; idx < this.selectedProducts.size(); idx++)
        {
            if(this.selectedProducts.get(idx).getProduct().getCode().equals(code))
            {
                this.selectedProducts.get(idx).setQuantity(quantity);
            }
        }
        this.selectedProducts.add(givenProduct);
    }
    
    public void deleteProduct(OrderDetail givenProduct)
    {
        String code = givenProduct.getProduct().getCode();
        for(int idx = 0; idx < this.selectedProducts.size(); idx++)
        {
            if(this.selectedProducts.get(idx).getProduct().getCode().equals(code))
            {
                this.selectedProducts.remove(idx);
            }
        }
        
    }
}
