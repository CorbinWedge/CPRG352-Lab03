package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // this will have the servlet call upon a JSP to be loaded by the client's browser
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        // stop the code call
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age;
        
        // capture the parameters coming in from the POST request
        age = request.getParameter("ageInput");
        // Set some attributes in the request object.
        request.setAttribute("ageAttribute", age);
        
        
        try{
            if (Integer.parseInt(age) > 0 ){
            request.setAttribute("ageSuccessMessage", "Your age next birthday will be " + (Integer.parseInt(age)+ 1) + "!");
            
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            
            return;
            }
        }
        catch(java.lang.NumberFormatException e){
            // set up a helpful error message for the user.
            request.setAttribute("ageErrorMessage", "You must give your current age!");
            
            // display the form again.
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            
            // after we load a JSP, use a return statement.
            // stop the code from executing (VERY IMPORTANT!)
            return;
        }
        
        
    }

}
