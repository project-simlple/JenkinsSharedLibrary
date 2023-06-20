package kapil.utils

import kapil.base.Base

class Basic extends Base {

    Basic(script, jenkins) {
        super(script, jenkins)
    }
    public def get() {
        return this.jenkins.getItem(this.script.env.getProperty('JOB_NAME'))
    }
    
}
