## Plug-in Component Id Based Connector Id Generator for Vaadin 8.1+

Plugs into connector id generation by using components' (css) ids for connector (communication) ids. This will help one to write scalability tests for Vaadin with e.g JMeter or Gatling.

## Usage

See connectoridgenerator-demo project for usage example. Shortly
 
 1. Add META-INF/services folders into you application's src/main/resources
 2. Add file named com.vaadin.server.VaadinServiceInitListener into the new folder
 3. Add full class name of your ApplicationInitListener in the file (e.g. org.vaadin.connectoridgenerator.ApplicationInitListener)
 4. Use connectoridgenerator-demo project's ApplicationInitLister as basis of your own one.
 5. Optionally add configuration to turn connectoridgenerator on and off for example in case of load test mode

## Thanks

Artur Signell for helping with development