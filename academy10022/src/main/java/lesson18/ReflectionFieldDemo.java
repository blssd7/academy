package lesson18;
	
import java.lang.reflect.Field;

import java.lang.reflect.Modifier;



import util.GregorianCalendar;


public class ReflectionFieldDemo {
	GregorianCalendar calendar = new GregorianCalendar();
	
	Class<GregorianCalendar>calendarClass = java.util.GregorianCalendar.class;  
	System.out.println(GregorianCalendar BC);
try {