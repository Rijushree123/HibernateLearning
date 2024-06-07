package com.spring.orm;
import com.spring.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student(1, "Rijushree Guha", "Kolkata");
        int r = studentDao.insert(student);
        System.out.println("Done: "+r);
    }
}
