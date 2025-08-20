package nbo.springframework.spring6di.services.dataSource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev","default"})
@Service
public class IDataSourceServiceDevImpl implements IDataSourceService {
    @Override
    public String getEnvironment() {
        return "Development";
    }
}
