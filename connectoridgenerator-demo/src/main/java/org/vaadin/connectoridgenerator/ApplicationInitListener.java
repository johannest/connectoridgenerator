package org.vaadin.connectoridgenerator;

import com.vaadin.server.ConnectorIdGenerator;
import com.vaadin.server.ServiceInitEvent;
import com.vaadin.server.VaadinServiceInitListener;
import com.vaadin.server.VaadinSession;

/**
 * Configures the VaadinService instance that serves the app through a servlet.
 */
public class ApplicationInitListener implements VaadinServiceInitListener {

    @Override
    public void serviceInit(ServiceInitEvent serviceInitEvent) {
        serviceInitEvent.addConnectorIdGenerator(
                event -> getGenerator(event.getSession())
                        .generateConnectorId(event));
    }

    private static ConnectorIdGenerator getGenerator(VaadinSession session) {
        ConnectorIdGenerator generator = session
                .getAttribute(ConnectorIdGenerator.class);
        if (generator == null) {
            generator = new ComponentIdBasedConnectorIdGenerator();
            session.setAttribute(ConnectorIdGenerator.class, generator);
        }
        return generator;
    }
}
