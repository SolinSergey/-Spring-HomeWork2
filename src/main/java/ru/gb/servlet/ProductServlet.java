package ru.gb.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;



public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Product[] array = new Product[10];
        array[0]=new Product(1,"Молоко",80);
        array[1]=new Product(2,"Кефир",40);
        array[2]=new Product(3,"Сливки",120);
        array[3]=new Product(4,"Сметана",60);
        array[4]=new Product(5,"Йогурт",30);
        array[5]=new Product(6,"Творог",60);
        array[6]=new Product(7,"Сыр",500);
        array[7]=new Product(8,"Тан",80);
        array[8]=new Product(9,"Сгущеное молоко",100);
        array[9]=new Product(10,"Сыворотка",50);
        resp.setContentType("text/html; charset=windows-1251");
        for (Product p:array){
            resp.getWriter().printf("<html><body><h3>"+p.getId()+" "+p.getTitle()+" "+p.getCost()+"</h3></body></html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        System.out.println(session.getAttribute("1"));
        resp.getWriter().printf("<html><body><h1>New POST request</h1></body></html>");
    }

}