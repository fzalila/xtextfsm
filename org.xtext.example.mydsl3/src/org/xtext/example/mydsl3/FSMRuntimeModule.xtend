/*
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl3


/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class FSMRuntimeModule extends AbstractFSMRuntimeModule {
	
	
	override Class<? extends org.eclipse.xtext.linking.ILinkingService> bindILinkingService() {
		return FSMLinkingService;
	}
}
