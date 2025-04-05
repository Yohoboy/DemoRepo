package com.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemotestClass 
{
	@Test
	public void falseTest()
	{
		Assert.assertTrue(false," It is a false testCase ");
	}

}
