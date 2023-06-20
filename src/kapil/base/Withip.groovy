package kapil.base

class WithIp extends Base {

    protected String host_name;
    protected String ipv4_address;

    WithIp(script, jenkins) {
        super(script, jenkins)
        this.host_name = ""
        this.ipv4_address = ""
    }
    public String getHostName() {
        return this.@host_name
    }
    public String getIpv4Address() {
        return this.@ipv4_address
    }
    public void setHostName(host_name) {
        this.@host_name = host_name
    }
    public void setIpv4Address(ipv4_address) {
        this.@ipv4_address = ipv4_address
    }
}

