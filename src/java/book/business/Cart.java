
package book.business;
import book.business.OrderDetail;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author amt
 */
public class Cart implements Serializable
{
    private ArrayList<OrderDetail> items  = new ArrayList<OrderDetail>();
    
    public Cart()
    {
        
    }
    
    public ArrayList<OrderDetail> getSelectedListProducts()
    {
        return items;
    }
    public void setSelectedProducts(ArrayList<OrderDetail> new_products)
    {
        items = new_products;
    }
    public int getSize()
    {
        return items.size();
    }
    
    public void addProduct(OrderDetail item)
    {
        String codeProduct = item.getProduct().getCode();
        int quantity = item.getQuantity();
        for(int idx = 0; idx < items.size(); idx++)
        {
            if(items.get(idx).getProduct().getCode().equals(codeProduct))
            {
                items.get(idx).setQuantity(quantity);
            }
        }
        items.add(item);
    }
    
    public void deleteProduct(OrderDetail givenProduct)
    {
        String code = givenProduct.getProduct().getCode();
        for(int idx = 0; idx < items.size(); idx++)
        {
            if(items.get(idx).getProduct().getCode().equals(code))
            {
                items.remove(idx);
            }
        }
        
    }
}
