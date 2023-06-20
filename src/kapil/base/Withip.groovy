package kapil.base

class WithIp extends Base {

    protected String host;
    protected String ipv4;

    WithIp(script, jenkins) {
        super(script, jenkins)
        this.host = "";
        this.ipv4 = "";
    }

    public String getHost() {
        return this.@host;
    }
    public String getIpv4() {
        return this.@ipv4;
    }
    public void setHost(String host) {
        this.@host = host;
    }
    public void setIpv4(String ipv4) {
        this.@ipv4 = ipv4;
    }
}
