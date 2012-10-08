package org.apache.maven.plugin.clean;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;

import fr.pilato.maven.plugins.ESStartMojo;

/**
 * Test the start mojo.
 */
public class ESStartMojoTest
    extends AbstractMojoTestCase
{
    /** {@inheritDoc} */
    protected void setUp()
        throws Exception
    {
        super.setUp();
    }

    /** {@inheritDoc} */
    protected void tearDown()
        throws Exception
    {
        super.tearDown();
    }

    /**
     * Test a simple start of a default node
     * @throws Exception
     */
    public void testBasicStart()
        throws Exception
    {
        String pluginPom = getBasedir() + "/src/test/resources/unit/basic-start-test/plugin-pom.xml";

        ESStartMojo mojo = (ESStartMojo) lookupMojo( "start", pluginPom );
        assertNotNull( mojo );

        mojo.execute();
    }

}
