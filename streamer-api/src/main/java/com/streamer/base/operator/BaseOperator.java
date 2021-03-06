package com.streamer.base.operator;

import com.streamer.base.constants.BaseConstants;
import com.streamer.core.Operator;
import com.streamer.utils.Configuration;

/**
 *
 * @author mayconbordin
 */
public abstract class BaseOperator extends Operator {
    protected String configPrefix = BaseConstants.BASE_PREFIX;

    @Override
    public void onCreate(int id, Configuration config) {
        super.onCreate(id, config);
        initialize();
    }
    
    protected String getConfigKey(String template) {
        return String.format(template, configPrefix);
    }

    public void setConfigPrefix(String configPrefix) {
        this.configPrefix = configPrefix;
    }
    
    protected void initialize() {}
}
