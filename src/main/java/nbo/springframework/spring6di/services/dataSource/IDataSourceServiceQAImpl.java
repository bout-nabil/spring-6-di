package nbo.springframework.spring6di.services.dataSource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service
public class IDataSourceServiceQAImpl implements IDataSourceService {
    @Override
    public String getEnvironment() {
        return "QA (Quality Assurance)";
    }
}
