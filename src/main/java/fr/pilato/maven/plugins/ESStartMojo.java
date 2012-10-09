package fr.pilato.maven.plugins;

import org.apache.maven.execution.MavenSession;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecution;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.Settings;

/**
 * Start an elasticsearch node when starting integration tests
 */
@Mojo(name = "start", defaultPhase = LifecyclePhase.PRE_INTEGRATION_TEST, threadSafe = true)
public class ESStartMojo
    extends AbstractMojo
{
    @Component
    private MavenSession session;

    @Component
    private MavenProject project;

    @Component
    private MojoExecution mojo;

    @Component
    private PluginDescriptor plugin;

    @Component
    private Settings settings;	

    @Parameter(property="thebar", 
                required=true, 
                defaultValue="coolbar" )
    protected String bar;	
	
    @Parameter(property="esdir", 
            required=true, 
            defaultValue="coolbar" )
    protected String esdir;	

    public void execute()
        throws MojoExecutionException
    {
    	
		getLog().error("STARTING MOJO " + bar + " " + esdir);
		
		// Node node = NodeBuilder.nodeBuilder().node();

    }
    
    public void setBar(String bar) {
		this.bar = bar;
	}
    
    public String getBar() {
		return bar;
	}
    
    
}
