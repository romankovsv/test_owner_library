import org.aeonbits.owner.ConfigCache;

public class Test {

    @org.testng.annotations.Test
    public void test(){

        SystemConfig systemConfig = ConfigCache.getOrCreate(SystemConfig.class);

        BaseConfig config = null;

        if(systemConfig.env().equals("dev")){
            config = ConfigCache.getOrCreate(DevConfig.class);
            System.out.println("Dev");
        }else if(systemConfig.env().equals("local")){
            config = ConfigCache.getOrCreate(LocalConfig.class);
            System.out.println("Local");
        }


        System.out.println(config.port());
        System.out.println(config.url());
    }
}
