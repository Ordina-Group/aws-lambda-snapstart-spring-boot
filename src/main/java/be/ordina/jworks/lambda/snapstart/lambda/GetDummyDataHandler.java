package be.ordina.jworks.lambda.snapstart.lambda;

import be.ordina.jworks.lambda.snapstart.service.DataService;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class GetDummyDataHandler implements Supplier<String> {
    private DataService dataService;

    public GetDummyDataHandler(DataService dataService) {
        this.dataService = dataService;
    }

    @Override
    public String get() {
        return dataService.getData();
    }
}
