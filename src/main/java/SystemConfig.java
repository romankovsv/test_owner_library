import org.aeonbits.owner.Config;

@Config.Sources({"system:properties"})
public interface SystemConfig extends Config{

    String env();
}
