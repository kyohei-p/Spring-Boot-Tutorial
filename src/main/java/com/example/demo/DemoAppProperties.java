package com.example.demo;
import org.springframework.boot.context.properties.ConfigurationProperties;

// 3系は単一のコンストラクタの場合は@ConstructorBinding不要
@ConfigurationProperties(prefix = "demoapp")
public class DemoAppProperties {

    private final String name;
    private final int version;

    public DemoAppProperties(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }
}
