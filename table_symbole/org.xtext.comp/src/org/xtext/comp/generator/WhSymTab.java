package org.xtext.comp.generator;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.xtext.comp.wh.ExprSimple;
import org.xtext.comp.wh.Program;

public class WhSymTab {
	
	private Map<String, FunctionDescriptor> symTab ;
	
	public WhSymTab() {
		symTab = new HashMap<String, FunctionDescriptor>();
	}
	
	public void generateSymTab(Resource resource) {
		
		TreeIterator<EObject> ast = resource.getAllContents();
		
		while ( ast.hasNext() ) {
			
			EObject obj = ast.next();
			System.out.println(obj);
			if ( obj instanceof Program ) {
				FunctionDescriptor fnd = new FunctionDescriptor(((Program) obj).getDefinition().getInput().getVars().size(), ((Program) obj).getDefinition().getOutput().getVars().size());
				if (symTab.containsKey(((Program) obj).getName())){
					System.out.println("Error, function already declared. TODO : throw error");
				}else{
					symTab.put(((Program) obj).getName(), fnd);
				}
			}
			
			//TODO : add autres symboles qui sont pas fonctions, checké sils sont appelés et si déclaré dans la tab. Faire autre tab,
			// pour comparer table appel, et tab symb finale. (pas poss de faire en un coup, car les déclarations peuvent etre apres
			//donc obligé de faire tout tab symb. checker nb input et outputs lorsque appel fonction
		}
		
		System.out.println(symTab);
		
	}

}
