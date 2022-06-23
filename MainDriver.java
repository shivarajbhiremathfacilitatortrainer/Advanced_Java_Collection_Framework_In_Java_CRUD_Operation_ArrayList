package com.advanced_java.collection_framework_in_java.maindriver_controller;

import com.advanced_java.collection_framework_in_java.arraylist_crud_operation.ArrayListCrudOperation;

public class MainDriver
{
	static ArrayListCrudOperation arrayListCrudOperation = new ArrayListCrudOperation();
	public static void main(String[] args)
	{
		arrayListCrudOperation.createTheData();
		
		arrayListCrudOperation.readTheData();
		
		arrayListCrudOperation.updateTheData();
		
		arrayListCrudOperation.deleteTheData();
	}
}