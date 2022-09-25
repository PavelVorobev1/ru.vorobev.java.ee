import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "getProduct", urlPatterns = "/getProduct")
public class getProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Apple",15));
        productList.add(new Product(2,"Orange",19));
        productList.add(new Product(3,"Avocado",30));
        productList.add(new Product(4,"Milk",10));
        productList.add(new Product(5,"Bread",5));
        productList.add(new Product(6,"Chips",28));
        productList.add(new Product(7,"Chocolate",22));
        productList.add(new Product(8,"Cheese",33));
        productList.add(new Product(9,"Yogurt",22));
        productList.add(new Product(10,"Ice cream",12));

        for (Product product : productList) {
            resp.getWriter().println(product.toString());
        }
    }
}
