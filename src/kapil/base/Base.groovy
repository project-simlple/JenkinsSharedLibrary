package kapil.base

import java.util.UUID


class Base implements Serializable {
    protected UUID id;
    protected def script; //WorkflowScript object
    protected def jenkins; // hudson.model.Hudson object
    protected String name;

    Base(script, jenkins) {   // jenkins : class jenkins.model.Jenkins (it is a singleton class)
        this.id = UUID.randomUUID();
        this.script = script;
        this.jenkins = jenkins.get()
        this.name = "";
    }

    public UUID getId() {
        return this.@id;
    }
    public def getScript() {
        return this.@script;
    }
    public def getJenkins() {
        return this.@jenkins;
    }
    public String getName() {
        return this.@name;
    }
    public void setScript(script) {
        this.@script = script;
    }
    public void setJenkins(jenkins) {
        this.@jenkins = jenkins.get();
    }
    public void setName(String name) {
        this.@name = name;
    }

    public void jenkinsPrint(String log) {
        if (this.script != null) {
            this.script.echo(message: log);
        } else {
            println(log);
        }
    }
}