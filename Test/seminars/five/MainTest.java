package seminars.five;

import org.junit.jupiter.api.Test;
import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;
import seminars.five.order.OrderService;
import seminars.five.order.PaymentService;
import seminars.five.user.UserRepository;
import seminars.five.user.UserService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {
    //5.1.
    @Test
    void testRandomGen() {
        RandomNumberModule random = new RandomNumberModule();
        ArrayList<Integer> array = random.getList(6);

        assertThat(array.size()).isEqualTo(6);
    }

    @Test
    void testMaxNumber() {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 3, 30, 40, 5));
        MaxNumberModule maxNumber = new MaxNumberModule();

        assertThat(maxNumber.getMaxNum(array)).isEqualTo(40);
    }

    @Test
    void testIntegration() {
        RandomNumberModule random = new RandomNumberModule();
        ArrayList<Integer> array = random.getList(6);
        MaxNumberModule maxNumber = new MaxNumberModule();

        assertThat(maxNumber.getMaxNum(array)).isEqualTo(Collections.max(array));


    }

    //5.2.
    @Test
    void integrationUserTest() {
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        String result = userService.getUserName(2);

        assertThat(result).isEqualTo("User 2");

    }


    //5.3.
    @Test
    void integrationOrderTest() {
        PaymentService paymentService = new PaymentService();
        OrderService orderService = new OrderService(paymentService);

        boolean result = orderService.placeOrder("test", 10.5);

        assertThat(result).isEqualTo(true);
    }


}