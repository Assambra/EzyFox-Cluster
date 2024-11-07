package com.assambra.ezyfoxcluster.plugin.config;

import com.assambra.ezyfoxcluster.plugin.strategy.DefaultNodeModeStrategyFactory;
import com.assambra.ezyfoxcluster.plugin.strategy.NodeStrategy;
import com.tvd12.ezyfox.bean.annotation.EzyAutoBind;
import com.tvd12.ezyfox.bean.annotation.EzyConfigurationBefore;
import com.tvd12.ezyfox.bean.annotation.EzySingleton;
import com.tvd12.ezyfox.util.EzyLoggable;
import com.tvd12.ezyfoxserver.context.EzyPluginContext;
import lombok.AllArgsConstructor;

@EzySingleton
@AllArgsConstructor
@EzyConfigurationBefore
public class NodeModeStrategyInitializer extends EzyLoggable {

    private final NodeConfig nodeConfig;
    private final DefaultNodeModeStrategyFactory defaultNodeModeStrategyFactory;

    @EzyAutoBind
    public void initialize(EzyPluginContext context) {
        logger.info("NodeMode is initializing...");
        NodeStrategy strategy = defaultNodeModeStrategyFactory.getStrategy(nodeConfig.getNodeMode());
        strategy.initialize(context);
    }
}
