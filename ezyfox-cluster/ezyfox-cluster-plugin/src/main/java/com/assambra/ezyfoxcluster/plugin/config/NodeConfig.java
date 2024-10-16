package com.assambra.ezyfoxcluster.plugin.config;

import com.assambra.ezyfoxcluster.plugin.enums.NodeMode;
import com.tvd12.ezyfox.bean.annotation.EzyPropertiesBean;
import com.tvd12.ezyfox.bean.annotation.EzySingleton;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import static com.tvd12.ezyfox.io.EzyStrings.isBlank;

@Data
@EzyPropertiesBean(prefix = "cluster")
@EzySingleton
public class NodeConfig {

    @Setter(AccessLevel.PRIVATE)
    private NodeMode nodeMode;

    public NodeMode getNodeMode() {
        String mode = System.getenv("node_mode");
        if (isBlank(mode)) {
            mode = System.getProperty("node_mode");
        }
        if (isBlank(mode)) {
            return nodeMode != null ? nodeMode : NodeMode.SINGLE;
        }
        return NodeMode.valueOf(mode.toUpperCase());
    }
}
