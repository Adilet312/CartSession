/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book.controller;
import book.business.Cart;
import book.data.ProductDB;
import book.data.OrderDetailDB;
import book.business.Product;
import book.business.OrderDetail;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author amt
 */
public class CartServlet extends HttpServlet 
{

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
   {
       ServletContext sc = getServletContext();
       String url = "/listProducts";
       String action = request.getParameter("action");
       if(action==null)
       {
           action = "cart";
       }
       System.out.println(action);
       
       if(action.equals("listProducts"))
       {
           url = "/listProducts";
       }
       else if(action.equals("cart"))
       {
           String productCode = request.getParameter("productCode");
           String quantityString = request.getParameter("quantity");
           System.out.println(productCode);
           HttpSession session = request.getSession();
           Cart cart = (Cart) session.getAttribute("cart");
           if (cart == null) 
           {
               cart = new Cart();
           }
           
            int quantity;
            try 
            {
                quantity = Integer.parseInt(quantityString);
                if (quantity < 0) 
                {
                    quantity = 1;
                }
            } 
            catch (NumberFormatException nfe) 
            {
                quantity = 1;
            }
            System.out.println(quantity);
            Product product = ProductDB.getProductByCode(productCode);
            System.out.println(product.getCode());
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setProduct(product);
            orderDetail.setQuantity(quantity);
            if(quantity>0)
            {
                cart.addProduct(orderDetail);
            }
            else if (quantity==0)
            {
                cart.deleteProduct(orderDetail);
            }
             session.setAttribute("cart", cart);
                url = "/cart.jsp";
         }
         sc.getRequestDispatcher(url).forward(request, response);
       

   }

}
