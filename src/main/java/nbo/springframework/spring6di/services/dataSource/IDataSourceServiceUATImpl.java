package nbo.springframework.spring6di.services.dataSource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class IDataSourceServiceUATImpl implements IDataSourceService {
    @Override
    public String getEnvironment() {
        return "UAT (User Acceptance Testing)";
    }
}
