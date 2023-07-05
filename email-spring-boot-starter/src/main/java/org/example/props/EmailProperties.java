package org.example.props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Yan Jiale
 * @since 2023/07/05 15:11
 */
@Data
@ConfigurationProperties(prefix = "emali.config")
public class EmailProperties {

    private String username = "";

    private String password = "";

    private String host = "2799595701@qq.com";

    private Integer port = 22;

}
