package com.jinal.practice.dictionary;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

	public static void main(String[] args) {
		// English to Spanish Dictionary
		Map<String, String> engSpanDictonary = new HashMap<String, String>();
		engSpanDictonary.put("Monday", "Lunes");
		engSpanDictonary.put("Tuesday", "Martes");
		engSpanDictonary.put("Wednesday", "Miercoles");
		engSpanDictonary.put("Thursday", "Jueves");
		engSpanDictonary.put("Friday", "Viernes");
		
		System.out.println(engSpanDictonary.get("Monday"));
		System.out.println(engSpanDictonary.keySet());
		System.out.println(engSpanDictonary.values());
		System.out.println(engSpanDictonary.entrySet());

		//Shopping List
		Map<String,Boolean> shoppingList = new HashMap<String, Boolean>();
		shoppingList.put("Ham", true);
		shoppingList.put("Bread", true);
		shoppingList.put("Oreos", true);
		shoppingList.put("Eggs", Boolean.FALSE);
		shoppingList.put("Sugar", Boolean.FALSE);
		
		System.out.println(shoppingList.get("Ham"));
	}

}
