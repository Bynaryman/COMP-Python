/**
 * generated by Xtext
 */
package org.comp.python;

import org.comp.python.WhStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages
 * without equinox extension registry
 */
@SuppressWarnings("all")
public class WhStandaloneSetup extends WhStandaloneSetupGenerated {
  public static void doSetup() {
    WhStandaloneSetup _whStandaloneSetup = new WhStandaloneSetup();
    _whStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
