package com.github.mauricioaniche.springlint.maven;

import java.io.FileNotFoundException;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import com.github.mauricioaniche.springlint.RunAllAnalysis;
import com.github.mauricioaniche.springlint.architecture.Architecture;
import com.github.mauricioaniche.springlint.architecture.SpringMVCArchitecture;
import com.github.mauricioaniche.springlint.output.CSVOutput;
import com.github.mauricioaniche.springlint.output.HTMLOutput;
import com.github.mauricioaniche.springlint.output.Output;

@Mojo(name = "springlint")
public class SpringLintMojo extends AbstractMojo {
//	@Parameter(defaultValue = "", property = "outputDir", required = true)
//	private String outputPath;
//	@Parameter(defaultValue = "html", property = "format", required = true)
//	private String format;
//
//	public void execute() throws MojoExecutionException {
//		
//		Architecture arch = new SpringMVCArchitecture();
//		String projectPath = ".";
//		
//		try {
//			Output output;
//			if(format.equals("html")) {
//				output = new HTMLOutput(outputPath);
//			} else {
//				output = new CSVOutput(outputPath);
//			}
//			
//			new RunAllAnalysis(arch, projectPath, output).run();
//		} catch (FileNotFoundException e) {
//			throw new RuntimeException(e);
//		}
//		
//	}
	
	public void execute() throws MojoExecutionException
    {
        getLog().info( "Hello, world." );
    }
}
