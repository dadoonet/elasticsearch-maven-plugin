package fr.pilato.maven.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * Start an elasticsearch node when starting integration tests
 */
@Mojo(name = "start", defaultPhase = LifecyclePhase.PRE_INTEGRATION_TEST, threadSafe = true)
public class ESStartMojo
    extends AbstractMojo
{
    public void execute()
        throws MojoExecutionException
    {
    	
		getLog().error("STARTING MOJO");

    }
}
