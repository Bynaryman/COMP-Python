/*
 * generated by Xtext 2.10.0
 */
package org.xtext.comp.generator;

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
		
		Option indentAll = new Option("a", "all", true, "indentations for all blocks");
		indentAll.setRequired(false);
	    options.addOption(indentAll);
	    
	    Option indentIf = new Option("i", "if", true, "indentations for if blocks");
		indentIf.setRequired(false);
	    options.addOption(indentIf);
	    
	    CommandLineParser parser = new GnuParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;
		
		if (args.length == 0) {
			System.err.println("Aborting: no path to EMF resource provided!");
			return;
		}
		
		try {
			cmd = parser.parse(options, args);
			String input = cmd.getOptionValue("inputpath");
			int all = (cmd.getOptionValue("all")==null) ? 2 : Integer.valueOf(cmd.getOptionValue("all"));
			int cond = (cmd.getOptionValue("if")==null) ? all : Integer.valueOf(cmd.getOptionValue("if"));
			
			Injector injector = new WhStandaloneSetup().createInjectorAndDoEMFRegistration();
			Main main = injector.getInstance(Main.class);
			main.runGenerator(input, all, cond);
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

	protected void runGenerator(String input, int indentAll, int indentIf) {
		
		System.out.println(input +" "+ indentAll + " " + indentIf);
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
		fileAccess.setOutputPath("src-gen/");
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
		//generator.generate(resource, fileAccess, context);
		WhGenerator whGen = new WhGenerator();
		whGen.doGenerate(resource, fileAccess, context, indentAll, indentIf);

		System.out.println("Code generation finished.");
	}
}
