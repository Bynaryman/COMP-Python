/*
 * generated by Xtext 2.10.0
 */
package org.xtext.comp.generator;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.comp.WhStandaloneSetup;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;

import org.apache.commons.cli.*;

public class Main {

	public static void main(String[] args) {
		
		Options options = new Options();
		
		Option inputPath = new Option("ip", "inputpath", true, "path of the input file");
		inputPath.setRequired(true);
	    options.addOption(inputPath);
	    
	    Option outputPath = new Option("op", "outputpath", true, "path of the output file");
		outputPath.setRequired(false);
	    options.addOption(outputPath);
		
		Option indentAll = new Option("a", "all", true, "indentations for all blocks");
		indentAll.setRequired(false);
	    options.addOption(indentAll);
	    
	    Option indentIf = new Option("i", "if", true, "indentations for if blocks");
		indentIf.setRequired(false);
	    options.addOption(indentIf);
	    
	    Option indentFor = new Option("for", "forindent", true, "indentations for for blocks");
	    indentFor.setRequired(false);
	    options.addOption(indentFor);
	    
	    Option indentWhile = new Option("while", "whileindent", true, "indentations for while blocks");
	    indentWhile.setRequired(false);
	    options.addOption(indentWhile);
	    
	    Option indentForeach = new Option("foreach", "foreachindent", true, "indentations for while blocks");
	    indentForeach.setRequired(false);
	    options.addOption(indentForeach);
	    
	    CommandLineParser parser = new GnuParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;
		
		try {
			cmd = parser.parse(options, args);
			String input = cmd.getOptionValue("inputpath");
			String output = (cmd.getOptionValue("outputpath")==null ? input +"pp" : cmd.getOptionValue("outputpath"));
			int all = (cmd.getOptionValue("all")==null) ? 2 : Integer.valueOf(cmd.getOptionValue("all"));
			int cond = (cmd.getOptionValue("if")==null) ? all : Integer.valueOf(cmd.getOptionValue("if"));
			int forC = (cmd.getOptionValue("for")==null) ? all : Integer.valueOf(cmd.getOptionValue("for"));
			int whileC = (cmd.getOptionValue("while")==null) ? all : Integer.valueOf(cmd.getOptionValue("while"));
			int foreachC = (cmd.getOptionValue("foreach")==null) ? all : Integer.valueOf(cmd.getOptionValue("foreach"));
			
			Injector injector = new WhStandaloneSetup().createInjectorAndDoEMFRegistration();
			Main main = injector.getInstance(Main.class);
			
			HashMap<String, Integer> indentMap = new HashMap<String, Integer>();
			indentMap.put("all", all);
			indentMap.put("if", cond);
			indentMap.put("for", forC);
			indentMap.put("while", whileC);
			indentMap.put("foreach", foreachC);
			
			main.runGenerator(input, output, indentMap);
		} catch (ParseException e){
			System.out.println(e.getMessage());
            formatter.printHelp("short option, long option, description", options);
            System.exit(1);
            return;
		}
		
		
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	/*@Inject
	private GeneratorDelegate generator;*/

	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator(String input, String output, HashMap<String, Integer> indentMap) {
				
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(input), true);

		// Validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}

		// Configure and start the generator
		fileAccess.setOutputPath(".");
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
		//generator.generate(resource, fileAccess, context);
		
		
		WhGenerator whGen = new WhGenerator();
		whGen.doGenerate(resource, fileAccess, context, output, indentMap);

		System.out.println("Code generation finished.");
	}
}