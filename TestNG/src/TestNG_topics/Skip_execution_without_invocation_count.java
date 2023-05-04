package TestNG_topics;

import org.testng.annotations.Test;

public class Skip_execution_without_invocation_count {

	@Test(enabled = false)
	public void test2()
	{
		System.out.println("signup");
		
	}
	@Test
	public void test3()
	{
		System.out.println("login");
	}
	}

