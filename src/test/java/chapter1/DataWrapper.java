package chapter1;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class DataWrapper {

  @DataProvider
  public Object[][] dp() {
	  
	  Map<String , String> mp1 = new HashMap<String, String>();
	  mp1.put("1","one");
	  mp1.put("2","two");
	  Map<String , String> mp2 = new HashMap<String, String>();
	  mp2.put("3","three");
	  mp2.put("4","four");
	  Object[][] obj = new Object[2][1];
	  obj[0][0] = mp1;
	  obj[1][0] = mp2;
	  
	  return obj;
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
  }
}
