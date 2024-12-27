# SpringComponemts-Declaration-XML

How It Works
Spring Bean Creation:
The Spring container reads the app-context.xml file and creates two beans: provider (of type HelloWorldMessageProvider) and renderer (of type StandardOutMessageRenderer).
Dependency Injection:
The StandardOutMessageRenderer bean has a dependency on the MessageProvider interface. Through the configuration (p:messageProvider-ref="provider"), Spring injects the HelloWorldMessageProvider bean into the renderer bean.
Rendering the Message:
When the application runs, the StandardOutMessageRenderer calls the getMessage() method on the HelloWorldMessageProvider to retrieve the message and prints it to the console.