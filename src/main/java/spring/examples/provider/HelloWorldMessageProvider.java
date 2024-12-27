/**
 * 
 */
package spring.examples.provider;

/**
 * 
 */

public class HelloWorldMessageProvider implements MessageProvider {
	 @Override
	 public String getMessage() {
	 return "Hello World! MY NAME IS JONATHAN";
	 }
}
