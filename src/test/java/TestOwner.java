import org.aeonbits.owner.ConfigCache;
import org.junit.jupiter.api.Test;

import static java.lang.System.*;

public class TestOwner {

    @Test
    public void test(){

        SystemConfig systemConfig = ConfigCache.getOrCreate(SystemConfig.class);

        BaseConfig config;

        if(systemConfig.env().equals("dev")){
            config = ConfigCache.getOrCreate(DevConfig.class);
            out.println("Dev");
        }else if(systemConfig.env().equals("local")){
            config = ConfigCache.getOrCreate(LocalConfig.class);
            out.println("Local");
        }else{
            throw new RuntimeException(String
                    .format("Unknown env:%s was selected",systemConfig.env()));
        }

        out.println(config.port());
        out.println(config.url());
    }
}
