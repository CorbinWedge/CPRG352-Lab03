package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setAttribute("output", "---");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        return;
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstNumber = request.getParameter("firstInput");
        String secondNumber = request.getParameter("secondInput");
        request.setAttribute("firstAttribute", firstNumber);
        request.setAttribute("secondAttribute", secondNumber);
        
        String pressedButton = request.getParameter("buttons");
        
        try{
            if (Integer.parseInt(firstNumber) >= 0 && Integer.parseInt(secondNumber) >= 0 || Integer.parseInt(firstNumber) <= 0 && Integer.parseInt(secondNumber) <= 0 || Integer.parseInt(firstNumber) >= 0 && Integer.parseInt(secondNumber) <= 0 || Integer.parseInt(firstNumber) <= 0 && Integer.parseInt(secondNumber) >= 0){
                
                if (pressedButton.equals("+")){
                    
                    request.setAttribute("output", Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber));
                }
                else if (pressedButton.equals("-")){
                    
                    request.setAttribute("output", Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber));
                }
                else if (pressedButton.equals("*")){
                    
                    request.setAttribute("output", Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber));
                }
                else if (pressedButton.equals("%")){
                    
                    request.setAttribute("output", Integer.parseInt(firstNumber) % Integer.parseInt(secondNumber));
                }
                
            request.setAttribute("firstNumberSaver", firstNumber);
            request.setAttribute("secondNumberSaver", secondNumber);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
            }
        }
        catch(java.lang.NumberFormatException e){
            
            request.setAttribute("output", "Invalid Input!");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
        
    }

}
