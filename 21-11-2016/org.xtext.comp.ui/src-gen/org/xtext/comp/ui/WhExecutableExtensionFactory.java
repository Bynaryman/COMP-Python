/*
 * generated by Xtext 2.10.0
 */
package org.xtext.comp.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.xtext.comp.ui.internal.CompActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class WhExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return CompActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return CompActivator.getInstance().getInjector(CompActivator.ORG_XTEXT_COMP_WH);
	}
	
}
