package com.muye.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="muye")
public class MuyePlugin extends AbstractMojo {
    @Parameter
    String sex;
    @Parameter
    String describe;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(String.format("user sex = %s,describe = %s", sex, describe));
    }
}
