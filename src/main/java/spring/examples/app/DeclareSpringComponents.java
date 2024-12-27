/**
 * 
 */
package spring.examples.app;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.examples.renderer.MessageRenderer;

/**
 * 
 */
public class DeclareSpringComponents {

	public static void main(String... args) {
		 GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		 ctx.load("classpath:spring/app-contextxml.xml");
		 ctx.refresh();
		 MessageRenderer messageRenderer = ctx.getBean("renderer",
		 MessageRenderer.class);
		 messageRenderer.render();
		
		 ctx.close();
		 }
}
