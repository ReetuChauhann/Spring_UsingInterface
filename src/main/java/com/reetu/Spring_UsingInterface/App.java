package com.reetu.Spring_UsingInterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
		Shape s=ctx.getBean("shp1",Shape.class);
		s.findArea();
		s.printArea();
		s=ctx.getBean("shp2",Shape.class);
		s.findArea();
		s.printArea();
		s=ctx.getBean("shp3",Shape.class);
		s.findArea();
		s.printArea();
    }
}

