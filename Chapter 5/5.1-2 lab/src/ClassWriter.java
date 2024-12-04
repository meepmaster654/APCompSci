/**
 * ClassWriter contains class (static) methods to return code that writes instance
 * variables, constructors, and methods automatically.
 */

public class ClassWriter {
  
  /** 
   * Returns the appropriate string to declare and initialize variable with given type and name.
    * 
    * @param type  the type of the parameter in the constructor
    * @param name  the name of the parameter in the constructor
    * @return      a string of code to be used in writing a class
    */
  public static String writeInstanceVariable(String type, String name)
  {  /* to be implemented in part (a) */  }
  
  
  /**
   * Returns the appropriate string to construct an object with given name and one instance
    * variable with given type and name.
    * 
    * @param className  the name of the class for which the constructor is being written
    * @param type       the type of the parameter in the constructor
    * @param name       the name of the parameter in the constructor
    * @return           a string of code to be used in writing a class
    */
  public static String writeConstructor(String className, String type, String name)
  {  /* to be implemented in part (c) */  }
  
  
  /**
   * Returns the appropriate string to construct an object with given name and two instance
    * variables with given types and names.
    * 
    * @param className  the name of the class for which the constructor is being written
    * @param type1      the type of the first parameter in the constructor
    * @param name1      the name of the first parameter in the constructor
    * @param type2      the type of the second parameter in the constructor
    * @param name2      the name of the second parameter in the constructor
    * @return           a string of code to be used in writing a class
    */
  public static String writeConstructor(String className, String type1, String name1, String type2, String name2)
  {  /* to be implemented in part (c) */  }
  
  
  /**
   * Returns the appropriate string to write an accessor method for a variable with given type and name.
    * 
    * @param type  the type of the variable being accessed through the method
    * @param name  the name of the variable being accessed through the method
    * @return      a string of code to be used in writing a class
    */
  public static String writeGetterMethod(String type, String name)
  {  /* to be implemented in part (b) */  }
  
  
  /**
   * Returns the appropriate string to write a mutator method for a variable with given type and name.
    * 
    * @param type  the type of the variable being changed through the method
    * @param name  the name of the variable being changed through the method
    * @return      a string of code to be used in writing a class
    */
  public static String writeSetterMethod(String type, String name)
  {  /* to be implemented in part (b) */  }
  
  
}
    