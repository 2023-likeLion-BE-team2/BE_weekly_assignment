package hello.servlet.assignment.request;


import com.fasterxml.jackson.databind.ObjectMapper;
import hello.servlet.assignment.CalData;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "divisionServlet",urlPatterns = "/division")
public class DivisionServlet extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        double input_1 = Double.parseDouble(req.getParameter("input_1"));
        double input_2 = Double.parseDouble(req.getParameter("input_2"));
        String result="";

        if(input_2==0){
            result = "Cannot do division. The denominator is zero";

        }else{
            CalData data = new CalData();

            data.setInput_1(input_1);
            data.setInput_2(input_2);
            String cal_result = String.format("%.2f",input_1/input_2);
            data.setResult(cal_result);

            result = objectMapper.writeValueAsString(data);

        }

        resp.getWriter().write(result);



    }
}
