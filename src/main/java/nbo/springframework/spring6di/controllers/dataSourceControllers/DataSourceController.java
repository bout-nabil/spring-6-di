package nbo.springframework.spring6di.controllers.dataSourceControllers;

import nbo.springframework.spring6di.services.dataSource.IDataSourceService;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {
    private final IDataSourceService iDataSourceService;

    public DataSourceController(IDataSourceService iDataSourceService) {
        this.iDataSourceService = iDataSourceService;
    }

    public String getDataSource() {
        return "You're in " + iDataSourceService.getEnvironment() + " Environment";
    }
}
