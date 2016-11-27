package org.xtext.comp.generator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public class FunctionDescriptor {

	private int nbInputs;
	private int nbOutputs;
	private List<EObject> instructions;
	
	public FunctionDescriptor(int inputs, int outputs) {
		nbInputs  = inputs;
		nbOutputs = outputs;
		instructions = new ArrayList<EObject>();
	}

	public int getNbInputs() {
		return nbInputs;
	}

	public int getNbOutputs() {
		return nbOutputs;
	}
	
	public String toString() {
		return "(nb_in = " + nbInputs+ ", nb_out = " + nbOutputs +")";
	}
	
}
