package edu.test.spring_modulith_test.delivery.application;

import edu.test.spring_modulith_test.delivery.domain.Delivery;
import edu.test.spring_modulith_test.delivery.domain.DeliveryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;

    public DeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    public void createDelivery(Integer orderId) {
        deliveryRepository.save(new Delivery(orderId));
    }

}
