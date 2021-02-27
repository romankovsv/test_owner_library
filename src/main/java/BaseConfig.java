import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.FIRST)
@Config.Sources({
        "classpath:dev.properties",
        "classpath:local.properties"
})
public interface BaseConfig extends Config {

    @Config.Key("base.uri")
    String url();

    int port();
}
