package be.ordina.jworks.lambda.snapstart.lambda;

import be.ordina.jworks.lambda.snapstart.service.DataService;

import java.util.function.Supplier;

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
