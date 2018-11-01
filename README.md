[![Published on Vaadin  Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/connectoridgenerator)
[![Stars on Vaadin Directory](https://img.shields.io/vaadin-directory/star/connectoridgenerator.svg)](https://vaadin.com/directory/component/connectoridgenerator)

## Plug-in Component Id Based Connector Id Generator for Vaadin 8.1+

Plugs into connector id generation by using components' (css) ids for connector (communication) ids. This will help one to write scalability tests for Vaadin with e.g JMeter or Gatling.

## Usage

See connectoridgenerator-demo project for usage example. Shortly
 
###A) In case you use Spring in your project

 1. Copy connectoridgenerator-demo project's ApplicationInitLister to your project
 2. Annotate it with Spring's @Component annotation
 3. Optionally add configuration to turn connectoridgenerator on and off for example in case of load test mode
 
###B) In case you do not have Spring in your project

 1. Add META-INF/services folders into you application's src/main/resources
 2. Add file named com.vaadin.server.VaadinServiceInitListener into the new folder
 3. Add full class name of your ApplicationInitListener in the file (e.g. org.vaadin.connectoridgenerator.ApplicationInitListener)
 4. Use connectoridgenerator-demo project's ApplicationInitLister as basis of your own one.
 5. Optionally add configuration to turn connectoridgenerator on and off for example in case of load test mode

## Thanks

Artur Signell for helping with development
