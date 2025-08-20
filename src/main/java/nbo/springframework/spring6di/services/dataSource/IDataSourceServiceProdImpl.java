package nbo.springframework.spring6di.services.dataSource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class IDataSourceServiceProdImpl implements IDataSourceService {
    @Override
    public String getEnvironment() {
        return "Production";
    }
}
