package com.assambra.ezyfoxcluster.plugin.strategy;

import com.assambra.ezyfoxcluster.plugin.enums.NodeMode;
import com.tvd12.ezyfox.bean.annotation.EzySingleton;

@EzySingleton
public interface NodeModeStrategyFactory {
    NodeStrategy getStrategy(NodeMode nodeMode);
}
