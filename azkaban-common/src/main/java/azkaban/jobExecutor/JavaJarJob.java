package azkaban.jobExecutor;

import azkaban.utils.Props;
import org.apache.log4j.Logger;

/**
 * @author lidong 17-1-9.
 */
public class JavaJarJob extends JavaProcessJob {

    public static final String JAR_PATH = "jar.path";

    public JavaJarJob(String jobid, Props sysProps, Props jobProps, Logger logger) {
        super(jobid, sysProps, jobProps, logger);
    }

    @Override
    protected String createCommandLine() {
        String command = JAVA_COMMAND + " ";
        command += getJVMArguments() + " ";
        command += "-Xms" + getInitialMemorySize() + " ";
        command += "-Xmx" + getMaxMemorySize() + " ";

        if (getClassPaths() != null && getClassPaths().size() != 0) {
            command += "-cp " + createArguments(getClassPaths(), ":") + " ";
        }

        command += "-jar " + getJarPath() + " ";
        command += getMainArguments();

        return command;
    }

    protected String getJarPath() {
        return getJobProps().getString(JAR_PATH);
    }

}
