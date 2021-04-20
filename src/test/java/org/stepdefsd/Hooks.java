package org.stepdefsd;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.Before;

import cucumber.api.Scenario;

public class Hooks extends BaseClass{
	@Before
	public void tc1() {
		System.out.println("starts");
	}
	@After
	public void tc2(Scenario s) throws IOException {
		String name = s.getName();
		String replace = name.replace(" ","_");
		screenS(replace);
		
	}

}
