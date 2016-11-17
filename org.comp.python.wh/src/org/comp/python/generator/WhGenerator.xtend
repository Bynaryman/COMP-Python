package org.comp.python.generator

import com.google.inject.Inject
import org.comp.python.wh.Entity
import org.comp.python.wh.Feature
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

class WhGenerator extends AbstractGenerator implements IGenerator {
     
        @Inject extension IQualifiedNameProvider
     
        override void doGenerate(Resource resource, IFileSystemAccess fsa) {}
            /*for (e : resource.allContents.toIterable.filter(Entity)) {
                fsa.generateFile(
                    e.fullyQualifiedName.toString("/") + ".wh",
                    e.compile)
            }*/
     
        def compile(Entity e) ''' 
            «IF e.eContainer.fullyQualifiedName != null»
                package «e.eContainer.fullyQualifiedName»;
            «ENDIF»
            
            public class «e.name» «IF e.superType != null
                    »extends «e.superType.fullyQualifiedName» «ENDIF»{
                «FOR f : e.features»
                    «f.compile»
                «ENDFOR»
            }
        '''
     
        def compile(Feature f) '''
            private «f.type.fullyQualifiedName» «f.name»;
            
            public «f.type.fullyQualifiedName» get«f.name.toFirstUpper»() {
                return «f.name»;
            }
            
            public void set«f.name.toFirstUpper»(«f.type.fullyQualifiedName» «f.name») {
                this.«f.name» = «f.name»;
            }
        '''
								
		override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
			for (e : input.allContents.toIterable.filter(Entity)) {
            	fsa.generateFile(
                    e.fullyQualifiedName.toString("/") + ".wh",
                    e.compile)
        	}
        }
								
    }