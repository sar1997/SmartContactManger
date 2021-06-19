package com.demo.webservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HardCodedService {

	public static List<Todo> lists=new ArrayList<Todo>();
	static int count=0;
	
	static {
		lists.add(new Todo(++count,"sarfaraj","I love to learn Java", new Date(),false));
		lists.add(new Todo(++count,"sarfaraj","I love to learn python", new Date(),false));
		lists.add(new Todo(++count,"sarfaraj","I love to learn Angular", new Date(),false));
		lists.add(new Todo(++count,"sarfaraj","I love to learn React", new Date(),false));
	}
	
	public List<Todo> findAll(){
		return lists;
	}
	
	public Todo deleteById(long id) {
	     Todo todo=findById(id);
	     
	     if(todo==null)
	     {
	    	 return null;
	     }
	     
	     if(lists.remove(todo)){
	    	 System.out.println("data jaa raha hai##########");
	     return todo;
	     }
	     
	     return null;
	}
	
	public Todo save(Todo todo) {
	       if(todo.getId()==-1 || todo.getId()==0)
	       {
	    	   todo.setId(++count);
	    	   lists.add(todo);
	       }
	       else
	       {
	    	   deleteById(todo.getId());
	    	   lists.add(todo);
	       }
	       
	       return todo;
	}

	public Todo findById(long id) {
		Todo tutu=null;
		for(Todo todo:lists) {
			if(todo.getId()==id)
			{
				tutu= todo;
			}
		}
		return tutu;
	}
	
	
}
