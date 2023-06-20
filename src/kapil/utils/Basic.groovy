package kapil.utils

import kapil.base.Base

class Basic extends Base {

    Basic(script, jenkins) {
        super(script, jenkins)
    }

    public void cleanWorkspace() {
        this.jenkinsPrint("cleaning the workspace....", 3)
        this.script.cleanWs(cleanWhenAborted: false,
                            cleanWhenFailure: false,
                            cleanWhenNotBuilt: false,
                            cleanWhenSuccess: true,
                            cleanWhenUnstable: false
                           )
    }

}
