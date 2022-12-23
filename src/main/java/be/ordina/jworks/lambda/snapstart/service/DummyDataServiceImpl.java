package be.ordina.jworks.lambda.snapstart.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DummyDataServiceImpl implements DataService {
    private static final String DUMMY_DATA_API_URL = "https://dummyjson.com/";
    private RestTemplate restTemplate;

    public DummyDataServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getData() {
        return restTemplate.getForObject(DUMMY_DATA_API_URL + "products/1", String.class);
    }
}
